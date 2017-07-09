/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory_BinaryIO;

/**
 *
 * @author Zhang
 */
public class READ_ME {
    /*
        BINARY IO
            - Ghi file nhị phân trong java thường được sử dụng hơn là file text
            - Các class xử lí IO nhị phân trong Java đều cùng 1 cơ chế, đó là stream
            - Cây kế thừa của Binary IO cũng đơn giản
                    * trên cùng là InputStream/OutputStream
                    * Con của chúng có 3 cặp: +, FileInputStream/FileOutputStream
                                   +, ObjectInputStream/ObjectOutputStream
                                   +, FilterInputStream/ FilterOutputStream
                    * cuối cùng là con của Filter có 2 cặp: +, DataInputStream/DataOutputStream                
                                                            +, BufferedInputStream/BufferedOutputStream
     */
}
