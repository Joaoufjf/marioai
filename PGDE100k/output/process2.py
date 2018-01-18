from __future__ import print_function
import os
import sys
from numpy import *

root= sys.argv[1]
roots = []
roots.append((root+'/0'))
roots.append((root+'/1'))
roots.append((root+'/2'))
roots.append((root+'/3'))
roots.append((root+'/4'))
roots.append((root+'/5'))
roots.append((root+'/6'))
roots.append((root+'/7'))
roots.append((root+'/8'))
roots.append((root+'/9'))
roots.append((root+'/10'))
roots.append((root+'/11'))
roots.append((root+'/12'))
roots.append((root+'/13'))
roots.append((root+'/14'))
roots.append((root+'/15'))
roots.append((root+'/16'))
roots.append((root+'/17'))
roots.append((root+'/18'))
roots.append((root+'/19'))
roots.append((root+'/20'))
roots.append((root+'/21'))
roots.append((root+'/22'))
roots.append((root+'/23'))
roots.append((root+'/24'))

tableTrain = [[]]
tableTest = [[]]
tableValidation = [[]]

modelsTrain = [[]]
modelsTest = [[]]
modelsValidation = [[]]

i = 0

for rootdir in roots:
	#print(rootdir, end="\n")
	train = []
	test = []
	validation = []

	minTrain = float("inf")
	idTrain = ''
	minValidation = float("inf")
	idValidation = ''
	minTest = float("inf")
	idTest = ''

	for subdir, dirs, files in sorted(os.walk(rootdir)):
		for file in sorted(files):
			filepath = subdir + os.sep + file
			#print(filepath)
			with open(filepath) as f:
				lines = f.readlines()
	
			fitnesses = lines[-1].split(' ')
			f1 = float(fitnesses[0])
			f2 = float(fitnesses[1])
			f3 = float(fitnesses[2])

			#print(filepath, end=' ')
			#print(f1, end=' ')
			#print(f2, end=' ')
			#print(f3, end='\n')
			
			#VALIDAcaO E TESTE ESTaO TROCADOS

			if f1 < minTrain:
				minTrain = f1
				idTrain = filepath

			if f2 < minTest:
				minTest = f2
				idTest = filepath

			if f3 < minValidation:
				minValidation = f3
				idValidation = filepath

			train.append(f1)
			test.append(f2)
			validation.append(f3)
	
	modelsTrain.append([])
	modelsTrain[i].append(idTrain)

	tableTrain.append([])
	tableTrain[i].append(min(train))
	tableTrain[i].append(median(train))
	tableTrain[i].append(mean(train))
	tableTrain[i].append(std(train))
	tableTrain[i].append(max(train))

	modelsTest.append([])
	modelsTest[i].append(idTest)

	tableTest.append([])
	tableTest[i].append(min(test))
	tableTest[i].append(median(test))
	tableTest[i].append(mean(test))
	tableTest[i].append(std(test))
	tableTest[i].append(max(test))

	modelsValidation.append([])
	modelsValidation[i].append(idValidation)	

	tableValidation.append([])
	tableValidation[i].append(min(validation))
	tableValidation[i].append(median(validation))
	tableValidation[i].append(mean(validation))
	tableValidation[i].append(std(validation))
	tableValidation[i].append(max(validation))

	i = i + 1

#TRAINING RESULTS

#print("min & median & mean & std & max", end='\\\ \n')
#for line in tableTrain:
#	for column in line:
#		print('%.5e' % float(column), end=' & ')
#		#print("{0:.5f}".format(float(column)), end=' & ')
#	print('\\', end='\n')

#for line in modelsTrain:
#	for column in line:
#		print(column, end=' ')
#	print('\\', end='\n')

#VALIDATION RESULTS

#print("min & median & mean & std & max", end='\\\ \n')
#for line in tableTest:
#	for column in line:
#		print('%.5e' % float(column), end=' & ')
#		#print("{0:.5f}".format(float(column)), end=' & ')
#	print('\\', end='\n')

#for line in modelsTest:
#	for column in line:
#		print(column, end=' ')
#	print('\\', end='\n')

#TEST RESULTS

print("\\begin{table}[]\n\centering\n\caption{"+root+"}\n\label{my-label}\n\\begin{tabular}{|c|c|c|c|c|c|}\n\hline", end='\n')
print("approach & min & median & mean & std & max \\\ \hline", end='\n')
approach = 1
for line in tableValidation:
	print(approach-1,end='')
	for column in line:
		print(' & %.5e' % float(column), end=' ')
	print('\\\ ', end='\n')
	approach += 1
print("\end{tabular}\n\end{table}", end='\n')

#for line in modelsValidation:
#	for column in line:
#		print(column, end=' ')
#	print('\\', end='\n')
