function question_4

    function k = kernel_exponential(x,y, length_scale)
        k = exp( -0.5 * ((x - y).^2 / length_scale^2));
    end

    function k = kernel_polynomial(x,y, d)
        k = (x*y + 1) ^ d;
    end

    kernel = @kernel_exponential;
    length_scale = 0.04;
    
    kernel = @kernel_polynomial;
    length_scale = 5;

    %% load the data
    train = load('data/regTrain.txt'); 
    test = load('data/regTest.txt'); 
    train_x = train(:,1); 
    train_y = train(:,2);
    test_x = test(:,1);
    test_y = test(:,2);

    x = [0:0.001:1];
    model_estimate = [];

    %% visualize the training data
    figure(1); hold on;
    plot(train_x, train_y, 'rx');

    cmap = hsv(20);  % initialize a color map
    lambda_values = [0.1:0.1:2];
    cnt = 0;
    for lambda=lambda_values
        cnt = cnt + 1;
        
        % compute kernel matrix K = k(x_i,x_j)
        K = zeros(size(train_x,1));
        for j=1:size(train_x,1)
            for i=1:size(train_x,1)
                K(i,j) = kernel( train_x(i), train_x(j), length_scale);
            end
        end
        
        % compute solution to dual representation
        a = inv(K + lambda * eye(size(train_x,1))) * train_y;

        % compute the estimate at sampled locations
        k = zeros(size(test_x,1),size(train_x,1));
        for j=1:size(test_x,1)
            for i=1:size(train_x,1)
                k(j,i) = kernel(test_x(j), train_x(i), length_scale);
            end
        end
        model_estimate = k * a;
        
        % visualize
        plot(test_x, model_estimate, '-', 'Color', cmap(cnt,:));
        title(strcat('Estimate with lambda : ', num2str(lambda)))
        pause
        
        % compute root mean square error
        test_err(cnt) = sqrt(norm(k * a - test_y, 2)^2 / size(test,2));
    end
    hold off;

    % plot test errors
    figure(2) ; title('Test Err'); hold on
    plot(repmat(lambda_values,size(test_err,2),1)', test_err', 'g');
    hold off;
    
    %% close all windows
    pause
    close all
end
