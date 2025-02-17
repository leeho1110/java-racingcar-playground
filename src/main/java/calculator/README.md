### TODO List

> 요구사항
  1. 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
  2. 앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
  3. 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw한다.
<br><br>

> Method
1. 구분자를 기준으로 숫자를 분리하는 메소드
    - 전달된 숫자가 없는 경우 0으로 반환하는 것은 if-return문으로 처리
3. 분리된 숫자를 더하는 메소드
4. 지정된 커스텀 구분자를 추출하는 메소드
5. 숫자 이외의 값 또는 음수를 전달하는 경우 exception 을 던지는 validate 메소드
