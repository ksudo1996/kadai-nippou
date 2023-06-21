package actions;

import java.io.IOException;

import javax.servlet.ServletException;

import constants.ForwardConst;

/**
 * 共通エラー画面「お探しのページは見つかりませんでした。」を表示する
 */
public class UnknownAction extends ActionBase {

    @Override
    public void process() throws ServletException, IOException {

        // エラー画面を表示
        forward(ForwardConst.FW_ERR_UNKNOWN);

    }

}
