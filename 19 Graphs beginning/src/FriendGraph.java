import java.io.*;
import java.util.LinkedList;

public class FriendGraph {
    private LinkedList<Vertex<String>> verteces;
    public FriendGraph() throws IOException, FormatException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(
                                "friends.txt"
                        )
                )
        );
        String in = null;
        in = br.readLine();
        if (!in.equals("# v")) {
            throw new FormatException();
        }
        in = br.readLine();
        while ("# e".equals(in = br.readLine())) {
            String [] data = in.split(" ");
            verteces.add(
                    new Vertex<String>(
                            Integer.parseInt(data[0]),
                            data[1]
                    )
            );
        }
        while((in = br.readLine())!= null) {
            this.addEdge(verteces, in);
        }
    }

    private void addEdge(LinkedList<Vertex<String>> verteces,
                         String in) {
        String [] data = in.split(" ");
        Vertex<String> v1 = getVertexById(
                verteces,
                Integer.parseInt(data[0])
        );
        Vertex<String> v2 = getVertexById(
                verteces,
                Integer.parseInt(data[1])
        );
        v1.getNeighbours().add(v2);
        v2.getNeighbours().add(v1);
    }

    private Vertex<String> getVertexById(
            LinkedList<Vertex<String>> verteces, int id) {
        for (Vertex<String> v : verteces) {
            if (v.getId() == id) {
                return v;
            }
        }
        return null;
    }
}
