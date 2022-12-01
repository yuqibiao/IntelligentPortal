package com.yyyu.db.std.portal.app.ui.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.yyyu.db.std.portal.app.R;
import com.yyyu.db.std.portal.app.ui.dialog.base.PortalBaseDialog;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * 功能：
 *
 * @author yyyu
 * @version 1.0
 * @date 2019/6/15
 */
public class OptionDialog extends PortalBaseDialog {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.iv_close)
    ImageView ivClose;
    @BindView(R.id.tv_sub_title)
    TextView tvSubTitle;
    @BindView(R.id.et_content)
    EditText etContent;
    @BindView(R.id.btn_sure)
    Button btnSure;

    private Builder mBuilder;

    public OptionDialog(Context context, Builder builder) {
        super(context);
        this.mBuilder = builder;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.dialog_edit_text;
    }

    @Override
    protected void initView() {
        if (!TextUtils.isEmpty(mBuilder.mTitle)){
            tvTitle.setText(mBuilder.mTitle);
        }
        if (!TextUtils.isEmpty(mBuilder.mSubTitle)){
            tvSubTitle.setText(mBuilder.mSubTitle);
        }
       if (!TextUtils.isEmpty(mBuilder.mBtnText)){
            btnSure.setText(mBuilder.mBtnText);
       }
       if (!TextUtils.isEmpty(mBuilder.mContent)){
           etContent.setText(mBuilder.mContent);
       }

    }

    @Override
    protected void initListener() {

    }

    @OnClick({R.id.iv_close, R.id.btn_sure})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_close:
                dismiss();
                break;
            case R.id.btn_sure:
                String content = etContent.getText().toString();
                if (mBuilder.mOnResultListener != null){
                    mBuilder.mOnResultListener.onResult(content);
                }
                dismiss();
                break;
        }
    }


    public interface OnResultListener {
        void onResult(String str);
    }

    public static class Builder {
        private String mTitle;
        private String mSubTitle;
        private String mBtnText;
        private String mContent;
        private OnResultListener mOnResultListener;

        public OptionDialog create(Context context) {
            return new OptionDialog(context, this);
        }

        public String getmTitle() {
            return mTitle;
        }

        public Builder setmTitle(String mTitle) {
            this.mTitle = mTitle;
            return this;
        }

        public String getmSubTitle() {
            return mSubTitle;
        }

        public Builder setmSubTitle(String mSubTitle) {
            this.mSubTitle = mSubTitle;
            return this;
        }

        public String getmBtnText() {
            return mBtnText;
        }

        public Builder setmBtnText(String mBtnText) {
            this.mBtnText = mBtnText;
            return this;
        }

        public String getmContent() {
            return mContent;
        }

        public Builder setmContent(String mContent) {
            this.mContent = mContent;
            return this;
        }

        public OnResultListener getmOnResultListener() {
            return mOnResultListener;
        }

        public Builder setmOnResultListener(OnResultListener mOnResultListener) {
            this.mOnResultListener = mOnResultListener;
            return this;
        }
    }

}
