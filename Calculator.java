public class Calculator {
	private int result;
	
	//Суммируем аргументы. params аргументы суммирования
	public void add(int ... params){
		for(Integer param : params){
			this.result += param;
		}
	}
	//Получить результат
	public int getResult(){
		return this.result;
	}
	//Clear result
	public void cleanResult(){
		this.result = 0;
	}
}