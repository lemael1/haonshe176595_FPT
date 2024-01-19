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
    
   
   
}
