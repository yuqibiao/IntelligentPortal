package com.yyyu.db.std.portal.app.ui.fragment;

import android.os.Bundle;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.View;
import android.widget.TextView;

import com.yyyu.db.std.portal.app.R;
import com.yyyu.db.std.portal.app.ui.fragment.base.PortalBaseFragment;

import java.util.Objects;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * 功能：
 *
 * @author yyyu
 * @version 1.0
 * @date 2022-11-30
 */
public class ToolbarFragment extends PortalBaseFragment {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.btn_left)
    AppCompatImageView btnLeft;
    @BindView(R.id.btn_right)
    TextView btnRight;

    private Builder mBuilder;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_toolbar;
    }

    @Override
    protected void beforeInit() {
        super.beforeInit();

    }

    @Override
    protected void initView() {
        if (getArguments() != null) {
            String title = getArguments().getString("title");
            String rightBtnText = getArguments().getString("rightBtnText");
            tvTitle.setText(title);
            btnRight.setText(rightBtnText);
        }
        if (mBuilder != null && mBuilder.showLeftBtn) {
            btnLeft.setVisibility(View.VISIBLE);
        } else {
            btnLeft.setVisibility(View.GONE);
        }
        if (mBuilder != null && mBuilder.mOnRightButtonListener != null) {
            btnRight.setVisibility(View.VISIBLE);
        }
    }

    @Override
    protected void initListener() {

    }

    @OnClick({R.id.btn_left, R.id.btn_right})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_left: {//左边按钮
                if (mBuilder.mOnLeftButtonListener != null) {
                    mBuilder.mOnLeftButtonListener.onClick();
                } else {//默认关闭当前页
                    Objects.requireNonNull(getActivity()).finish();
                }
                break;
            }
            case R.id.btn_right: {
                if (mBuilder.mOnRightButtonListener != null) {
                    mBuilder.mOnRightButtonListener.onClick();
                }
                break;
            }
        }
    }

    public static class Builder {

        private String title;
        private String rightBtnText;
        private boolean showLeftBtn;

        private OnLeftButtonListener mOnLeftButtonListener;
        private OnRightButtonListener mOnRightButtonListener;

        public ToolbarFragment create() {

            ToolbarFragment fragment = new ToolbarFragment();
            fragment.mBuilder = this;
            Bundle args = new Bundle();
            args.putString("title", title);
            args.putString("rightBtnText", rightBtnText);
            fragment.setArguments(args);
            return fragment;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setRightBtnText(String rightBtnText) {
            this.rightBtnText = rightBtnText;
            return this;
        }

        public Builder setOnLeftButtonListener(OnLeftButtonListener mOnLeftButtonListener) {
            this.mOnLeftButtonListener = mOnLeftButtonListener;
            return this;
        }

        public Builder setmOnRightButtonListener(OnRightButtonListener mOnRightButtonListener) {
            this.mOnRightButtonListener = mOnRightButtonListener;
            return this;
        }

        public Builder setShowLeftBtn(boolean showLeftBtn) {
            this.showLeftBtn = showLeftBtn;
            return this;
        }
    }

    public interface OnLeftButtonListener {
        void onClick();
    }

    public interface OnRightButtonListener {
        void onClick();
    }

}
