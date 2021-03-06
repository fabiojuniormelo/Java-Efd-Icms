/**
 *
 */
package br.com.swconsultoria.efd.icms.bo.blocoE;

import br.com.swconsultoria.efd.icms.registros.blocoE.RegistroE530;
import br.com.swconsultoria.efd.icms.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroE530 {

    public static StringBuilder gerar(RegistroE530 registroE530, StringBuilder sb) {

        sb.append("|").append(Util.preencheRegistro(registroE530.getReg()));
        sb.append("|").append(Util.preencheRegistro(registroE530.getInd_aj()));
        sb.append("|").append(Util.preencheRegistro(registroE530.getVl_aj()));
        sb.append("|").append(Util.preencheRegistro(registroE530.getCod_aj()));
        sb.append("|").append(Util.preencheRegistro(registroE530.getInd_doc()));
        sb.append("|").append(Util.preencheRegistro(registroE530.getNum_doc()));
        sb.append("|").append(Util.preencheRegistro(registroE530.getDescr_aj()));
        sb.append("|").append('\n');

        return sb;
    }
}
