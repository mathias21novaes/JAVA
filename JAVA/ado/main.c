/*#include "stdio.h"
#include "stdlib.h"

typedef struct{

  int valor = 0;
  no esquerda = NULL;
  no direita = NULL;

  no(){
    valor = 0;
    esquerda = NULL;
    direita = NULL;
  }

  no(int num){
    valor = num;
    esquerda = NULL;
    direita = NULL;
  }

}no;*/

#include "stdio.h"
#include "stdlib.h"

typedef struct{

  int valor;
  int *esquerda;
  int *direita;

}no;
