//geracao 99 level: 1 fit: 763
 if( enemies[11+ -2 ][11+ 2 ] != Sprite.KIND_GREEN_KOOPA ){ if( observation.mayMarioJump() ){ action[ Mario.KEY_LEFT ] = true ;
 if( observation.isMarioOnGround() ){ action[ Mario.KEY_RIGHT ] = true ;
 }else{ action[ Mario.KEY_DOWN ] = false ;
 action[ Mario.KEY_DOWN ] = true ;
 } if( landscape[11+ -2 ][11+ 1 ] != 0 ){ if( landscape[11+ 0 ][11+ 0 ] != 20 ){ if( observation.isMarioOnGround() ){ action[ Mario.KEY_DOWN ] = false ;
 }else{ action[ Mario.KEY_JUMP ] = false ;
 } } }else{ if( enemies[11+ 1 ][11+ 1 ] != Sprite.KIND_SPIKY ){ action[ Mario.KEY_SPEED ] = true ;
 }else{ action[ Mario.KEY_JUMP ] = true ;
 action[ Mario.KEY_SPEED ] = true ;
 } } }else{ if( enemies[11+ 1 ][11+ -2 ] != Sprite.KIND_SPIKY_WINGED ){ if( enemies[11+ 0 ][11+ 1 ] != Sprite.KIND_SPIKY_WINGED ){ action[ Mario.KEY_SPEED ] = true ;
 } if( observation.mayMarioJump() ){ action[ Mario.KEY_LEFT ] = false ;
 }else{ action[ Mario.KEY_JUMP ] = true ;
 } }else{ if( landscape[11+ -2 ][11+ 1 ] != 16 ){ action[ Mario.KEY_LEFT ] = false ;
 action[ Mario.KEY_RIGHT ] = true ;
 } } if( enemies[11+ 2 ][11+ -1 ] != Sprite.KIND_GOOMBA_WINGED ){ action[ Mario.KEY_DOWN ] = false ;
 } if( observation.mayMarioJump() ){ action[ Mario.KEY_JUMP ] = true ;
 }else{ action[ Mario.KEY_LEFT ] = false ;
 } if( observation.isMarioOnGround() ){ action[ Mario.KEY_JUMP ] = false ;
 } } }else{ if( observation.mayMarioJump() ){ action[ Mario.KEY_SPEED ] = false ;
 }else{ if( observation.mayMarioJump() ){ action[ Mario.KEY_RIGHT ] = false ;
 action[ Mario.KEY_LEFT ] = false ;
 if( landscape[11+ -2 ][11+ -2 ] != -10 ){ action[ Mario.KEY_RIGHT ] = false ;
 } }else{ action[ Mario.KEY_SPEED ] = false ;
 if( observation.mayMarioJump() ){ action[ Mario.KEY_DOWN ] = false ;
 } if( enemies[11+ -1 ][11+ -2 ] != Sprite.KIND_RED_KOOPA ){ action[ Mario.KEY_DOWN ] = false ;
 } if( observation.isMarioOnGround() ){ action[ Mario.KEY_RIGHT ] = true ;
 }else{ action[ Mario.KEY_DOWN ] = true ;
 } } } } if( observation.mayMarioJump() ){ if( observation.mayMarioJump() ){ if( enemies[11+ -2 ][11+ -1 ] != Sprite.KIND_GOOMBA ){ action[ Mario.KEY_LEFT ] = false ;
 action[ Mario.KEY_JUMP ] = false ;
 } }else{ if( enemies[11+ 2 ][11+ -1 ] != Sprite.KIND_RED_KOOPA ){ action[ Mario.KEY_DOWN ] = false ;
 action[ Mario.KEY_JUMP ] = false ;
 } } if( landscape[11+ -2 ][11+ 1 ] != 0 ){ if( observation.isMarioOnGround() ){ if( enemies[11+ 0 ][11+ 1 ] != Sprite.KIND_RED_KOOPA_WINGED ){ if( observation.isMarioOnGround() ){ action[ Mario.KEY_DOWN ] = false ;
 }else{ action[ Mario.KEY_DOWN ] = false ;
 } }else{ if( landscape[11+ 0 ][11+ 1 ] != 20 ){ action[ Mario.KEY_SPEED ] = true ;
 } } }else{ action[ Mario.KEY_JUMP ] = true ;
 action[ Mario.KEY_DOWN ] = true ;
 if( landscape[11+ -2 ][11+ 2 ] != -10 ){ action[ Mario.KEY_LEFT ] = true ;
 } } }else{ action[ Mario.KEY_JUMP ] = true ;
 if( landscape[11+ -1 ][11+ 2 ] != 16 ){ action[ Mario.KEY_LEFT ] = false ;
 }else{ if( landscape[11+ 2 ][11+ -1 ] != 16 ){ action[ Mario.KEY_SPEED ] = false ;
 } } } }else{ if( observation.mayMarioJump() ){ if( observation.isMarioOnGround() ){ action[ Mario.KEY_LEFT ] = false ;
 } }else{ if( landscape[11+ 0 ][11+ 2 ] != 21 ){ if( landscape[11+ -2 ][11+ 2 ] != 0 ){ if( observation.isMarioOnGround() ){ action[ Mario.KEY_DOWN ] = true ;
 action[ Mario.KEY_JUMP ] = true ;
 }else{ action[ Mario.KEY_RIGHT ] = true ;
 } }else{ if( observation.mayMarioJump() ){ if( observation.isMarioOnGround() ){ action[ Mario.KEY_RIGHT ] = true ;
 }else{ action[ Mario.KEY_DOWN ] = false ;
 } } } }else{ if( observation.mayMarioJump() ){ action[ Mario.KEY_DOWN ] = true ;
 } } } }