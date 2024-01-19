/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hspace.mathutil.main;

import com.hspace.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
       //thử nghiệm hàm tính giai thừa đúng như thiết kế hay không
       // ta phải đưa  các tình huống sử dụng hàm trong thực tế
       // ví dụ : -5 coi tính được không
       // 0 coi tính đc mấy
       //20 coi tính dc mấy
       // 21 coi tính được mấy
       //TEST CASE: Một tình huống hàm/app/ màn hình được đưa vào sử dụng
       // giả lập hành vi xài của ai đó!!
       
       //TEST CASE: LÀ 1 TÌNH HUỐNG SỬ DỤNG , XÀI APP( HÀM) MÀ NÓ BAO HÀM
       // DATA ĐẦU VÀO CỤ THỂ NÀO ĐÓ
       // OUTPUT ĐẦU RA ỨNG VỚI XỬ LÍ CỦA HÀM / CHỨC NƯNG CỦA APP, DĨ NHIÊN DÙNG
       // ĐẦU VÀO ĐỂ XỬ LÍ
       // KÌ VỌNG: MONG HÀM SẼ TRẢ VỀ VALUE NÀO ĐÓ ỨNG VỚI Ở TRÊN
       // SO SÁNH KẾT QUẢ CÓ NHƯ KÌ VỌNG HAY KHÔNG
       long expected=120;// tao kì vọng hàm ói về 120 nếu tính 5!
       int n=5;          // input
       long actual= MathUtil.getFactorial(n);
       System.out.println("5! = "+expected+" expected");
        System.out.println("5! = "+ actual +" actual");
    }
    
}
