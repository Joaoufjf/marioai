//geracao 99 level: 1 fit: 1739
 action[ Mario.KEY_LEFT ] = false ;
 if( enemies[11+ 2 ][11+ -3 ] != 1 ){ if( observation.mayMarioJump() ){ if( landscape[11+ 2 ][11+ 1 ] != 1 ){ action[ Mario.KEY_RIGHT ] = true ;
 }else{ action[ Mario.KEY_SPEED ] = false ;
 } } if( observation.isMarioOnGround() ){ if( observation.isMarioOnGround() ){ action[ Mario.KEY_LEFT ] = true ;
 }else{ action[ Mario.KEY_LEFT ] = false ;
 } } } if( observation.isMarioOnGround() ){ if( observation.mayMarioJump() ){ action[ Mario.KEY_JUMP ] = true ;
 if( landscape[11+ 3 ][11+ 0 ] != 1 ){ action[ Mario.KEY_SPEED ] = true ;
 } }else{ if( landscape[11+ -1 ][11+ 0 ] != 1 ){ action[ Mario.KEY_JUMP ] = false ;
 action[ Mario.KEY_RIGHT ] = false ;
 } if( observation.mayMarioJump() ){ action[ Mario.KEY_RIGHT ] = true ;
 }else{ action[ Mario.KEY_RIGHT ] = false ;
 } if( observation.isMarioOnGround() ){ action[ Mario.KEY_JUMP ] = false ;
 }else{ action[ Mario.KEY_SPEED ] = true ;
 } } }else{ if( landscape[11+ 2 ][11+ 1 ] != 1 ){ if( landscape[11+ 3 ][11+ 2 ] != 1 ){ if( enemies[11+ 2 ][11+ -2 ] != 1 ){ if( enemies[11+ -2 ][11+ 3 ] != 1 ){ action[ Mario.KEY_DOWN ] = false ;
 }else{ action[ Mario.KEY_RIGHT ] = false ;
 } } }else{ if( observation.mayMarioJump() ){ action[ Mario.KEY_SPEED ] = false ;
 action[ Mario.KEY_DOWN ] = false ;
 }else{ if( enemies[11+ -2 ][11+ -3 ] != 1 ){ action[ Mario.KEY_JUMP ] = true ;
 } } } } } if( observation.isMarioOnGround() ){ if( observation.mayMarioJump() ){ if( observation.mayMarioJump() ){ if( enemies[11+ 2 ][11+ 3 ] != 1 ){ if( landscape[11+ -1 ][11+ 3 ] != 1 ){ if( landscape[11+ -3 ][11+ 1 ] != 1 ){ action[ Mario.KEY_SPEED ] = true ;
 }else{ action[ Mario.KEY_DOWN ] = true ;
 } }else{ if( enemies[11+ 3 ][11+ 3 ] != 1 ){ action[ Mario.KEY_LEFT ] = false ;
 }else{ action[ Mario.KEY_DOWN ] = false ;
 } } }else{ if( enemies[11+ 3 ][11+ 2 ] != 1 ){ if( enemies[11+ -1 ][11+ 1 ] != 1 ){ action[ Mario.KEY_RIGHT ] = true ;
 }else{ action[ Mario.KEY_JUMP ] = true ;
 } }else{ action[ Mario.KEY_DOWN ] = false ;
 action[ Mario.KEY_JUMP ] = false ;
 } } }else{ action[ Mario.KEY_LEFT ] = true ;
 } } }else{ if( landscape[11+ 1 ][11+ -3 ] != 1 ){ if( enemies[11+ 2 ][11+ 1 ] != 1 ){ action[ Mario.KEY_SPEED ] = false ;
 } } }