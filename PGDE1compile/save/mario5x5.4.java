//geracao 99 level: 2 fit: 299.94
 action[ Mario.KEY_JUMP ] = true ;
 if( enemies[11+ 0 ][11+ -2 ] != Sprite.KIND_GOOMBA_WINGED ){ if( enemies[11+ -1 ][11+ -1 ] != Sprite.KIND_GOOMBA_WINGED ){ action[ Mario.KEY_DOWN ] = true ;
 action[ Mario.KEY_JUMP ] = true ;
 action[ Mario.KEY_JUMP ] = true ;
 } if( landscape[11+ 1 ][11+ -2 ] != 20 ){ action[ Mario.KEY_LEFT ] = true ;
 } if( landscape[11+ -1 ][11+ 0 ] != 21 ){ action[ Mario.KEY_LEFT ] = true ;
 }else{ action[ Mario.KEY_RIGHT ] = true ;
 } }else{ action[ Mario.KEY_LEFT ] = true ;
 action[ Mario.KEY_SPEED ] = true ;
 if( landscape[11+ 0 ][11+ -1 ] != 16 ){ if( observation.isMarioOnGround() ){ action[ Mario.KEY_JUMP ] = true ;
 }else{ action[ Mario.KEY_LEFT ] = false ;
 action[ Mario.KEY_JUMP ] = false ;
 } } } if( observation.isMarioOnGround() ){ if( observation.isMarioOnGround() ){ action[ Mario.KEY_JUMP ] = true ;
 } } if( observation.mayMarioJump() ){ action[ Mario.KEY_JUMP ] = false ;
 } if( landscape[11+ -2 ][11+ -2 ] != 16 ){ action[ Mario.KEY_LEFT ] = true ;
 action[ Mario.KEY_RIGHT ] = false ;
 }else{ if( enemies[11+ 0 ][11+ 1 ] != Sprite.KIND_SPIKY ){ action[ Mario.KEY_RIGHT ] = true ;
 }else{ action[ Mario.KEY_JUMP ] = false ;
 } } if( enemies[11+ 0 ][11+ 1 ] != Sprite.KIND_GREEN_KOOPA ){ if( observation.isMarioOnGround() ){ if( landscape[11+ -2 ][11+ 0 ] != 0 ){ action[ Mario.KEY_SPEED ] = true ;
 }else{ action[ Mario.KEY_RIGHT ] = true ;
 } }else{ if( enemies[11+ -1 ][11+ -1 ] != Sprite.KIND_GOOMBA_WINGED ){ action[ Mario.KEY_SPEED ] = false ;
 } } }else{ if( observation.mayMarioJump() ){ if( observation.mayMarioJump() ){ action[ Mario.KEY_DOWN ] = false ;
 } } } if( observation.isMarioOnGround() ){ if( observation.isMarioOnGround() ){ if( enemies[11+ 2 ][11+ 1 ] != Sprite.KIND_GOOMBA ){ if( enemies[11+ 0 ][11+ -1 ] != Sprite.KIND_RED_KOOPA_WINGED ){ action[ Mario.KEY_DOWN ] = false ;
 }else{ action[ Mario.KEY_LEFT ] = false ;
 } } action[ Mario.KEY_JUMP ] = false ;
 action[ Mario.KEY_SPEED ] = true ;
 action[ Mario.KEY_LEFT ] = false ;
 }else{ if( landscape[11+ -1 ][11+ 0 ] != 21 ){ action[ Mario.KEY_LEFT ] = true ;
 }else{ action[ Mario.KEY_JUMP ] = false ;
 } } }