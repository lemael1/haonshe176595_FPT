package com.hspace.mathutil.test.core;
import com.hspace.mathutil.core.MathUtil;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
// Câu lệnh này lấy cặp data input/expected nhồi vào hàm test
@RunWith(value=Parameterized.class)// cho biết class này sẽ chạy với tham số
public class MathUtilDDTTest {

    // ta sẽ trả về mảng 2 chiều gồm nhiều cặp Expected\input
    @Parameterized.Parameters //JUnit sẽ ngầm chạy loop qua từng dòng của mảng
    // để lấy ra từng cặp data
    public static Integer[][] initData() {
        return new Integer[][] {
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
        };
    }
    // giả sử loop qua từng dòng của mảng, ta cần phải gán từng value
    // vào biến tương ứng input/expected
    @Parameterized.Parameter(value = 0)// value= 0 là map với mảng data
    public int n;// biến map với value cột 0 của mảng
    @Parameterized.Parameter(value = 1)
    public long expected;// kiểu long vì giá trị trả về của hàm getF()
//    Biến n sẽ chứa giá trị từ cột 0 của mỗi cặp dữ liệu.
//Biến expected sẽ chứa giá trị từ cột 1 của mỗi cặp dữ liệu.
@Test
     public void testGetFactorialGivenRightArgumentReturnsWell(){
     Assert.assertEquals(expected,MathUtil.getFactorial(n));    
     }
}
