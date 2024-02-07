import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testFiltrarJogadorasFemininas() {
        List<Jogador> jogadores = Arrays.asList(
                new Jogador("Alice", "Digimon TCG", "Feminino"),
                new Jogador("Bob", "Magic The Gathering", "Masculino"),
                new Jogador("Charlie", "Pokemon TCG", "Masculino"),
                new Jogador("Diana", "Digimon TCG", "Feminino"),
                new Jogador("Eva", "Magic The Gathering", "Feminino")
        );

        List<Jogador> mulheres = Main.filtrarJogadorasFemininas(jogadores);

        assertEquals(3, mulheres.size()); // Espera-se que haja 3 jogadoras femininas
        // Verifica se todos os nomes na lista são de jogadoras femininas
        mulheres.forEach(jogador -> assertEquals("Feminino", jogador.getGenero()));
    }
}
