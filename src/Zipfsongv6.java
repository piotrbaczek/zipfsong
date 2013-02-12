/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author PETTER
 */
public class Zipfsongv6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            final int m, n;
            Kattio io = new Kattio(System.in, System.out);
            m = io.getInt();
            n = io.getInt();
            StringBuilder sb = new StringBuilder();
            int i = 0;
            List a = new ArrayList();
            while (io.hasMoreTokens() && i < m) {
                a.add(new Song(io.getLong(), io.getWord(), (i + 1)));
                i++;
            }
            Collections.sort(a);
            Iterator it = a.iterator();
            i = 0;
            while (it.hasNext() && i < n) {
                sb.append(it.next().toString()).append("\n");
                i++;
            }
            io.print(sb);
            io.close();
        } catch (Exception x) {
        }
    }
}
