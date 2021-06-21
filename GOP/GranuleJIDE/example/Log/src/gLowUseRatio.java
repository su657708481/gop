granule gLowUseRatio(WriteUtil){
	external double useRatio;
	{
		if(useRatio <= 0.6)
			return true;
		else 
			return false;
	}



}
