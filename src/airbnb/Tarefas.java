/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airbnb;

/**
 *
 * @author USER
 */
interface Tarefas {
    void clean(); // limpar a habitação e verificar que está em condições de ser ocupada; 
    void collect(); //buscar os hóspedes no aeroposto e levá-los à habitação que alugaram; 
    void checkin(); //Fazer Checkin dos hóspedes explicando-lhes os detalhes funcionais da habitação; 
    void solveproblem(); //Resolver problemas de manutenção (conserto e troca de equipamento), assistir os hóspedes em alguma emergência 
    void checkout(); //Checkout verificando que os hóspedes não partiram nem levaram nada da habitação; 
    void delivery(); // Levar os hóspedes ao aeroporto, fazer a limpeza novamente; 
    
    
    
}
