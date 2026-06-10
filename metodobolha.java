



METODO BOLHA VETOR
// Suponha que seu vetor se chame 'vetor' e você já tenha o 'totalElementos'
for (int i = 0; i < totalElementos - 1; i++) {
    for (int j = 0; j < totalElementos - 1 - i; j++) {
        
        // 🔥 CRITÉRIO DE TROCA (Mude o sinal para < se quiser ordem decrescente)
        if (vetor[j] > vetor[j + 1]) {
            
            // 🔄 O TRUQUE DO COPO VAZIO (Troca de Posição)
            int aux = vetor[j];
            vetor[j] = vetor[j + 1];
            vetor[j + 1] = aux;
            
        }
    }
}

METODO DA BOLHA LISTA DINAMICA
// Suponha que sua lista se chame 'lista'
for (int i = 0; i < lista.size() - 1; i++) {
    for (int j = 0; j < lista.size() - 1 - i; j++) {
        
        // 🔥 CRITÉRIO DE TROCA (Usando .get(j) para ler os vizinhos)
        if (lista.get(j) > lista.get(j + 1)) {
            
            // 🔄 O TRUQUE DO COPO VAZIO (Usando .set para substituir)
            int aux = lista.get(j);
            
            lista.set(j, lista.get(j + 1)); // Posição j recebe o valor da j+1
            lista.set(j + 1, aux);          // Posição j+1 recebe o valor do aux
            
        }
    }
}


METODO DA BOLHA ORDEM ALFABETICA
// Suponha que seja um vetor de Strings chamado 'nomes'
for (int i = 0; i < total - 1; i++) {
    for (int j = 0; j < total - 1 - i; j++) {
        
        // 🔥 EM STRING NÃO USA '>', USA .compareTo(...) > 0
        if (nomes[j].compareTo(nomes[j + 1]) > 0) {
            
            // 🔄 O TRUQUE DO COPO VAZIO (com tipo String)
            String aux = nomes[j];
            nomes[j] = nomes[j + 1];
            nomes[j + 1] = aux;
            
        }
    }
}

//ordene, ordenação



Java
// 🚨 Mude aqui: Troque 'totalElementos' pelo tamanho fixo (ex: 5)
for (int i = 0; i < 5 - 1; i++) {
    for (int j = 0; j < 5 - 1 - i; j++) {
        
        // 🚨 Mude aqui: Troque 'vetor' pelo nome do seu vetor (ex: notasAlunos)
        if (notasAlunos[j] > notasAlunos[j + 1]) {
            
            // 🚨 Mude aqui: O tipo do 'aux' deve ser igual ao do vetor (ex: double)
            // e troque 'vetor' pelo nome do seu vetor (ex: notasAlunos)
            double aux = notasAlunos[j];
            notasAlunos[j] = notasAlunos[j + 1];
            notasAlunos[j + 1] = aux;
            
        }
    }
}