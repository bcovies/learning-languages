def somaVetor(vetor): 
  if len(vetor)== 1: 
    return vetor[0]; 
  elif ( vetor[0] > 0): 
    return vetor[0]+somaVetor(vetor[1:]) 
  else: 
    return somaVetor(vetor[1:]) 
 
vetor = [20, -30, 15, -10, 30, -20, -30, 30]  
print (somaVetor(vetor))