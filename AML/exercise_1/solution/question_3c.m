function question_3c

    function phi = fourierbasis(n, x)
        if n == 0
            phi = ones(size(x));
        else
            if mod(n, 2) == 1
                l = (n + 1) / 2;
                phi = (1 / l) * cos(2*pi*l*x);
            else 
                l = n / 2;
                phi = (1 / l) * sin(2*pi*l*x);
            end
        end
    end

    function Phi = basis_matrix(max_k, x)
        Phi = [];
        for n=0:2*max_k
            Phi(:,n+1) = fourierbasis(n, x);
        end
    end

    %% load the data
    clc;
    clear;
    train = load('data/regTrain.txt'); 
    test = load('data/regTest.txt'); 
    train_x = train(:,1); 
    train_y = train(:,2);
    test_x = test(:,1); 
    test_y = test(:,2);

    %% visualize the data
    figure(1); title('Train and Test Data') ; hold on;
    plot(train_x, train_y, 'rx');
    plot(test_x, test_y, 'bo');
    legend('train set', 'test set')
    hold off;
    pause

    %% plot the basis functions
    figure(3); title ('Basis Functions') ; hold on; 
    x = [0:0.01:2*pi];
    for n=1:7
        plot(x, fourierbasis(n, x), 'b');
        pause
    end
    hold off;
    pause

    %% calculate least squares regression
    x = [0:0.001:1];
    model_estimate = [];

    cmap = hsv(20);
    figure(4);  hold on;
    plot(train_x, train_y, 'rx');
    max_k = 17;
    lambda_values = [0:0.25:4.0];
    cnt = 0;
    
    for lambda=lambda_values
        % perform least squares regression for given max. frequency
        Phi = basis_matrix(max_k, train_x);
        w = inv(Phi' * Phi + lambda * eye(size(Phi,2))) * Phi' * train_y;

        % compute the estimate at sampled locations and visualize
        model_estimate = basis_matrix(max_k, x) * w;
        cnt = cnt + 1;
        plot(x, model_estimate, '-', 'Color', cmap(cnt,:));
        axis([0 1 -1 1]);
        title(strcat('Model with lambda : ', num2str(lambda))); 
        pause
    end
    hold off;

    %% calculate root mean square error
    cnt = 0;
    for lambda=lambda_values
        cnt = cnt + 1;
        Phi_train = basis_matrix(max_k, train_x);
        Phi_test = basis_matrix(max_k, test_x);
        
        w = inv(Phi_train' * Phi_train + lambda * eye(size(Phi_train,2))) * Phi_train' * train_y;

        % compute the root mean square error
        train_err(cnt) = sqrt(norm(Phi_train * w - train_y, 2)^2 / size(train,2));
        test_err(cnt) = sqrt(norm(Phi_test * w - test_y, 2)^2 / size(test,2));
    end

    figure(5); title('Train Err') ; hold on;
    plot(repmat(lambda_values,size(train_err,2),1)', train_err', 'r');
    hold off
    figure(6) ; title('Test Err'); hold on
    plot(repmat(lambda_values,size(test_err,2),1)', test_err', 'g');
    hold off;

    %% close all windows
    pause
    close all
end
