package com.uptodown.tv.ui.fragment;

import a6.n;
import android.app.AlertDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.app.VerticalGridSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.VerticalGridPresenter;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import c8.f0;
import com.uptodown.R;
import t5.v;
import t5.w;
import t5.y;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class TvMyAppsFragment extends VerticalGridSupportFragment {

    /* renamed from: b, reason: collision with root package name */
    public v f4500b;
    public AlertDialog l;
    public boolean m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4501n;

    /* renamed from: a, reason: collision with root package name */
    public final LifecycleCoroutineScope f4499a = LifecycleOwnerKt.getLifecycleScope(this);
    public final int o = 5;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.leanback.widget.ArrayObjectAdapter, t5.v, androidx.leanback.widget.ObjectAdapter] */
    /* JADX WARN: Type inference failed for: r1v0, types: [r5.n, androidx.leanback.widget.Presenter] */
    @Override // androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        ?? presenter = new Presenter();
        presenter.f10260a = -1;
        presenter.f10261b = -1;
        presenter.l = -1;
        presenter.m = -1;
        ?? arrayObjectAdapter = new ArrayObjectAdapter((Presenter) presenter);
        this.f4500b = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
        FragmentActivity activity = getActivity();
        if (activity != null && (extras = activity.getIntent().getExtras()) != null) {
            if (extras.containsKey("updates")) {
                this.m = extras.getBoolean("updates");
            }
            if (extras.containsKey("rollback")) {
                this.f4501n = extras.getBoolean("rollback");
            }
        }
        if (this.m) {
            setTitle(getString(R.string.updates));
        } else if (this.f4501n) {
            setTitle(getString(R.string.rollback_title));
        } else {
            setTitle(getString(R.string.installed));
        }
        if (bundle == null) {
            prepareEntranceTransition();
        }
        VerticalGridPresenter verticalGridPresenter = new VerticalGridPresenter();
        verticalGridPresenter.setNumberOfColumns(this.o);
        setGridPresenter(verticalGridPresenter);
        new Handler(Looper.getMainLooper()).postDelayed(new n(this, 25), 500L);
        setOnItemViewClickedListener(new w(this));
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        f0.z(this.f4499a, null, null, new y(this, null, 0), 3);
    }
}
