function[] = f()
    mu1 = 0;
    mu2 = 3;
    sigma1 = 2;
    sigma2 = 2;

    muprop = 5;
    sigmaprop = 10;

    weight1 = 0.5;
    weight2 = 0.5;

    x = -20:0.1:20;
    
    gauss1 = [];
    gauss2 = [];

    gaussTarget = [];
    gaussprop = [];

    for i = 1:max(size(x))
       gauss1 = [gauss1 , gaussian(mu1, sigma1, x(i))]; 
       gauss2 = [gauss2 , gaussian(mu2, sigma2, x(i))]; 
       gaussprop = [gaussprop , gaussian(muprop, sigmaprop, x(i))]; 
       gaussTarget = [gaussTarget , gaussian(3, 1, x(i))]; 
    end

    newgauss = gauss1.*weight2 + gauss2.*weight1;

    plot(x, newgauss, 'b-'); hold on;
    plot(x, gaussprop, 'r-');
    plot(x, sqrt(x)/100, 'm-');
end

