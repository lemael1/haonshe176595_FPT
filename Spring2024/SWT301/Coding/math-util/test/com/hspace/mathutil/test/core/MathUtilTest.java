/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.hspace.mathutil.test.core;

import com.hspace.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author Admin
 */
public class MathUtilTest {
    //ĐÂY LÀ CLASS sẽ sử dụng các hàm của thư viện/framework JUnit
    // để kiểm thử/ kiểm tra code chính - hàm tínhGiaiThua()bên
    // class core.MathUtil
    // viết code để test code chính bên kia
    
    // có nhiều quy tắc đặt tên hàm kiểm thử
    // nhưng thường sẽ là nói lên mục đích của các case/các tình huống kiểm thử
    // tình huống xài hàm theo kiểu thành công và thất bại
    
    // hàm dưới đây là tính huống test hàm chạy thành công , trả về ngon
    // ta sẽ xài hàm kiểu well - đưa 5!,6! không chơi -5!,30!
    
    // @Test JUnit sẽ phối hợp với JVM để chạy hàm này
    //@Test phía hậu trường chính là psvm()
    // Có nhiều @Test ứng với nhiều case khác nhau để kiểm thử tính hàm giai thừa
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
          int n=0; // test thử tình huống tử tế đầu vào, mày phải chạy đúng
          long expected=1; // hy vọng 0!=1
          //long actual=;// họi hàm cần test bên core/app chính/code chính
          long actual=MathUtil.getFactorial(n);
          
          // so sánh expected vs. actual dùng xanh xanh đỏ đỏ, framework
          Assert.assertEquals(expected, actual);
    
          // gộptheem vài case thành công/ đưa đầu vào ngon!! hàm phải tính ngon
          Assert.assertEquals(1, MathUtil.getFactorial(1));// tui muốn 1!==1
          Assert.assertEquals(2, MathUtil.getFactorial(2));
          Assert.assertEquals(6, MathUtil.getFactorial(3));
          Assert.assertEquals(24, MathUtil.getFactorial(4));         
          
          
          
    
    } // hàm giúp so sánh 2 giá trị nào đó có giống nhau không
      // nếu giống nhauu -> thảy màu xanh đền đường. code ngon
      // nếu không giống nhau -> thảy màu đỏ đền đường
      // hàm ý expected và actual ko giống nhau
    
    
    // hàm getF() ta thiết kế có 2 tình huống xử lí
    // 1. đưa data tử tế trong [0..20]-> tính đúng đc n!- done
    // 2. đưa data vào cả chớn ; THIẾT KẾ CỦA HÀM LÀ NÉM RA NGOẠI LỆ
    // TAO KÌ VỌNG NGOẠI LỆ XUẤT HIỆN KHI N<0 || N>20
    // rất mong ngoại lệ xuất hiện với n cà trớn này
    
    // Nếu hàm nhận vào n<0 hoặc n>20 và hàm ném ra ngoại leej
    // HÀM ĐÚNG NHƯ THIẾT KẾ --> XANH PHẢI XUẤT HIỆN
    
   // nếu hàm nhận vào n< 0 hoặc n>20 và hàm éo ra ngoại lệ
    // sure, HÀM CHẠY SAI THIẾT KẾ, SAI KÌ VỌNG, MÀU ĐỎ
    
    //Test case: 
    //input:-5
    //expeced: IllegalArgumentException xuất hiện
    // tình huống bất thuwongf,  ngoại lệ, ngoài dự tính, không thể so sánh theo kiểu value
    // đo lường bằng cách , chúng có xuất hiện hay không
    // assertEqual() ko dùng để so sánh 2 ngoại lệ
    // equals() là bằng nhau hay không trên value!!!
    
    
    // Màu đỏ, do NÉM RA NGOẠI LỆ KHÔNG NHƯ KÌ VỌNG
    // KO DO NÉM SAI
//   @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException(){
//           MathUtil.getFactorial(-5);// hàm @Test này chạy, hay hàm F()
//                                      // sẽ ném vê ngoại lệ numberFormat
//    }
//    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException(){
           MathUtil.getFactorial(-5);// hàm @Test này chạy, hay hàm F()
                                      // sẽ ném vê ngoại lệ numberFormat
    }
    
    // cách khác để bắt ngoại lệ xuất hiện, viết tự nhiên hơn !!!
    // xài lambda
    //Test case; hàm sẽ ném về ngoại lệ nếu nhận vào 21
    // Tui cần thấy màu xanh khi chơi với 21!
    @Test
     public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion(){
          
           Assert.assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-5));
         // tham số 1 : loại ngoại lệ muốn so sánh,
         // tham số 2: đoạn code chạy răng ra ngoài: runnable
                   
                   
                   MathUtil.getFactorial(-5);// hàm @Test này chạy, hay hàm F()
                                      // sẽ ném vê ngoại lệ numberFormat
    }
    
   
}
