
package refeicao;

/**
 *
 * @author felipe
 */
public class DiretorRefeicao {
    
    public Refeicao preparaNaoVegetariana(String sabor, String tipoBebida, String comBatata){
        Refeicao novaRefeicao = new Refeicao();
        NonVegetarianoBuilder refeicaoBuilder = new NonVegetarianoBuilder(novaRefeicao);
        if(tipoBebida.equalsIgnoreCase("refrigerante"))
            refeicaoBuilder.adicionarRefrigerante(sabor);
        else
            refeicaoBuilder.adicionarSuco(sabor);

        refeicaoBuilder.adicionarBatata(comBatata);

        refeicaoBuilder.prepadaHamburgerCarne();
        return novaRefeicao;
    }
    public Refeicao preparaVegetariana(String sabor, String tipoBebida, String comBatata){
        Refeicao novaRefeicao = new Refeicao();
        VegetarianoBuilder refeicaoBuilder = new VegetarianoBuilder(novaRefeicao);
        if(tipoBebida.equalsIgnoreCase("refrigerante"))
            refeicaoBuilder.adicionarRefrigerante(sabor);
        else
            refeicaoBuilder.adicionarSuco(sabor);
        
        refeicaoBuilder.adicionarBatata(comBatata);
        
        refeicaoBuilder.preparaHamburgerVegetariano();
        return novaRefeicao;
    }

}
