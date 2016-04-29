(function($){
	$(window).load(function(){
		$(".royalSlider").royalSlider({
	    	// general options go gere
	    	keyboardNavEnabled: true,
	    	imageScalePadding:0,
	    	slidesSpacing:0,
	    	// randomizeSlides:true,
	    	loop:true,
	    	// height:400,
	    	// autoHeight: true,
			// autoScaleSlider:false,
			// imageScaleMode:'none',
			// imageAlignCenter: false,
	    	controlsInside:false,
	    	arrowsNavAutoHide:false,
	    	controlNavigation:'bullets',
	    	loopRewind:true,
	        visibleNearby: {
	            enabled: true,
	            centerArea: 0.34,
	            center: true,
	            breakpoint: 750,
	            breakpointCenterArea: 1,
	            navigateByCenterClick: true
	        }
	    });
	})
})(jQuery);