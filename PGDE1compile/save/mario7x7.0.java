//geracao 99 level: 0 fit: 3643
 if( landscape[11+ -1 ][11+ 2 ] != 20 ){ if( enemies[11+ -2 ][11+ 3 ] != Sprite.KIND_GREEN_KOOPA ){ if( landscape[11+ -2 ][11+ 2 ] != 16 ){ if( observation.isMarioOnGround() ){ action[ Mario.KEY_LEFT ] = false ;
 }else{ action[ Mario.KEY_JUMP ] = false ;
 } if( observation.mayMarioJump() ){ action[ Mario.KEY_DOWN ] = true ;
 }else{ action[ Mario.KEY_LEFT ] = false ;
 } } if( observation.isMarioOnGround() ){ action[ Mario.KEY_RIGHT ] = false ;
 }else{ action[ Mario.KEY_SPEED ] = true ;
 } action[ Mario.KEY_RIGHT ] = false ;
 if( enemies[11+ 0 ][11+ 2 ] != Sprite.KIND_BULLET_BILL ){ if( observation.mayMarioJump() ){ action[ Mario.KEY_RIGHT ] = false ;
 } } } } if( landscape[11+ 1 ][11+ -1 ] != 20 ){ if( landscape[11+ 1 ][11+ -2 ] != -11 ){ if( observation.isMarioOnGround() ){ if( landscape[11+ 2 ][11+ -2 ] != 20 ){ action[ Mario.KEY_LEFT ] = false ;
 }else{ action[ Mario.KEY_SPEED ] = true ;
 } } if( landscape[11+ 0 ][11+ 2 ] != 21 ){ action[ Mario.KEY_LEFT ] = false ;
 }else{ action[ Mario.KEY_DOWN ] = true ;
 } action[ Mario.KEY_DOWN ] = false ;
 action[ Mario.KEY_RIGHT ] = true ;
 }else{ if( observation.mayMarioJump() ){ if( observation.mayMarioJump() ){ action[ Mario.KEY_SPEED ] = true ;
 action[ Mario.KEY_DOWN ] = false ;
 } }else{ action[ Mario.KEY_LEFT ] = true ;
 action[ Mario.KEY_LEFT ] = true ;
 if( enemies[11+ 2 ][11+ 2 ] != Sprite.KIND_SPIKY ){ action[ Mario.KEY_RIGHT ] = false ;
 }else{ action[ Mario.KEY_LEFT ] = false ;
 } } } }else{ if( observation.isMarioOnGround() ){ if( observation.isMarioOnGround() ){ if( landscape[11+ 2 ][11+ 0 ] != 20 ){ if( observation.isMarioOnGround() ){ action[ Mario.KEY_JUMP ] = true ;
 }else{ action[ Mario.KEY_JUMP ] = true ;
 } }else{ if( landscape[11+ -1 ][11+ -1 ] != 20 ){ action[ Mario.KEY_DOWN ] = false ;
 } } }else{ action[ Mario.KEY_JUMP ] = true ;
 action[ Mario.KEY_JUMP ] = true ;
 if( observation.mayMarioJump() ){ action[ Mario.KEY_RIGHT ] = false ;
 }else{ action[ Mario.KEY_RIGHT ] = false ;
 } } } } if( observation.mayMarioJump() ){ if( observation.isMarioOnGround() ){ if( enemies[11+ 0 ][11+ 3 ] != Sprite.KIND_GREEN_KOOPA ){ if( landscape[11+ -1 ][11+ -3 ] != -11 ){ action[ Mario.KEY_JUMP ] = true ;
 }else{ action[ Mario.KEY_JUMP ] = false ;
 } if( observation.mayMarioJump() ){ action[ Mario.KEY_LEFT ] = true ;
 }else{ action[ Mario.KEY_RIGHT ] = false ;
 } }else{ if( observation.mayMarioJump() ){ if( observation.mayMarioJump() ){ action[ Mario.KEY_JUMP ] = true ;
 } }else{ if( observation.isMarioOnGround() ){ action[ Mario.KEY_RIGHT ] = true ;
 }else{ action[ Mario.KEY_LEFT ] = true ;
 } } } }else{ if( observation.mayMarioJump() ){ if( landscape[11+ -2 ][11+ 2 ] != 20 ){ action[ Mario.KEY_SPEED ] = false ;
 }else{ action[ Mario.KEY_SPEED ] = true ;
 } if( observation.mayMarioJump() ){ action[ Mario.KEY_JUMP ] = true ;
 } } } }