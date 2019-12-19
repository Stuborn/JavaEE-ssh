
jQuery(document).ready(function() {
	
    /*
        Fullscreen background
    */
    $.backstretch([
                    "assets/img/background_2.jpg"
	              , "assets/img/background_3.jpg"
	              , "assets/img/background_1.jpg"
	             ], {duration: 3000, fade: 750});
    
    /*
        Form validation
    */
    $('.login-form input[type="text"], .login-form input[type="password"], .login-form textarea').on('focus', function() {
    	$(this).removeClass('input-error');
    });
    
    $('.login-form').on('submit', function(e) {
    	
    	$(this).find('input[type="text"], input[type="password"], textarea').each(function(){
    		if( $(this).val() == "" ) {
    			e.preventDefault();
    			$(this).addClass('input-error');
                $('#err').text("");
    		}
    		else {
    			$(this).removeClass('input-error');
                $('#err').text("");
    		}
    	});
    });

    $('.signup-form').on('submit', function(e) {

        $(this).find('input[type="text"], input[type="password"], textarea').each(function(){
            if( $(this).val() == "" ) {
                e.preventDefault();
                $(this).addClass('input-error');
                $('.err').text("账号或密码为空，请重新输入");
            }
            else {
                $(this).removeClass('input-error');
                $('.err').text("");
            }
        });

        if($('#form-password-1').val()!=($('#form-password-2').val())){
            e.preventDefault();
            $('#form-password-1').addClass('input-error');
            $('#form-password-2').addClass('input-error');
            $('.err').text("两次密码不一致，请重新输入");
        }
        else {
            $('#form-password-1').removeClass('input-error');
            $('#form-password-2').removeClass('input-error');
            $('.err').text("");
        }
    });
    
});
