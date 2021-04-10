/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.Stack;

/**
 *
 * @author asus
 */
public class DFS {
    public static void main(String[] args) {
        char label[] = {'A', 'B', 'S', 'C', 'D', 'E', 'H', 'G', 'F'};
        double[][] adjacentymatrix = {
                // A  B  S  C  D  E  H  G  F 
             /*A*/{0, 8, 7, 0, 0, 0, 0, 0, 0},
             /*B*/{8, 0, 0, 0, 0, 0, 0, 0, 0},
             /*S*/{7, 0, 0, 9, 0, 0, 0, 6, 0},
             /*C*/{4, 2, 9, 0, 5, 10, 0, 0, 1},
             /*D*/{0, 0, 0, 5, 0, 0, 0, 0, 0},
             /*E*/{0, 0, 0, 10, 0, 0, 4, 0, 0},
             /*H*/{0, 0, 0, 0, 0, 4, 0, 2, 0},
             /*G*/{0, 0, 6, 0, 0, 0, 2, 0, 3},
             /*F*/{0, 0, 0, 1, 0, 0, 0, 3, 0},};
        boolean[] visited = new boolean[label.length];
        Stack<Integer> stackvetrex = new Stack<>();
        int pencarianawal = 0;
        int pencarianakhir = 8;
        visited[pencarianawal] = true;
        stackvetrex.push(pencarianawal);
        boolean missioncomplete = false;
        while (!stackvetrex.isEmpty()) {
            System.out.println("Stack " + stackvetrex.toString());
            int vetrexasal = stackvetrex.peek();
            if (vetrexasal == pencarianakhir) {
                missioncomplete = true;
                break;
            } else {
                int vetrextujuan = -1;
                for (int i = 0; i < adjacentymatrix[vetrexasal].length; i++) {
                    double bobot = adjacentymatrix[vetrexasal][i];
                    boolean isVisited = visited[i];
                    if (bobot > 0 && !isVisited) {
                        vetrextujuan = i;
                        break;
                    }
                }
                if (vetrextujuan != -1) {
                    stackvetrex.push(vetrextujuan);
                    visited[vetrextujuan] = true;
                } else {
                    stackvetrex.pop();
                }
            }
        }
        if (missioncomplete && !stackvetrex.isEmpty()) {
            System.out.print("Path :" + label[pencarianawal]);
            double totalbobot = 0;
            for (int i = 1; i < stackvetrex.size(); i++) {
                int va = stackvetrex.get(i - 1);
                int vb = stackvetrex.get(i);
                double bobot = adjacentymatrix[va][vb];
                totalbobot += bobot;
                System.out.print("-" + label[vb]);
            }
            System.out.println("\n total bobot: " + totalbobot);
        }
    }
}
