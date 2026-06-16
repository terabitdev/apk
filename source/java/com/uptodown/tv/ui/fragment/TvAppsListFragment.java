package com.uptodown.tv.ui.fragment;

import android.app.AlertDialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.app.VerticalGridSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.VerticalGridPresenter;
import androidx.lifecycle.LifecycleOwnerKt;
import c8.f0;
import com.uptodown.R;
import java.util.ArrayList;
import k5.j;
import r5.f;
import s5.b;
import t5.g;
import t5.h;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class TvAppsListFragment extends VerticalGridSupportFragment {

    /* renamed from: a, reason: collision with root package name */
    public ArrayObjectAdapter f4497a;

    /* renamed from: b, reason: collision with root package name */
    public j f4498b;
    public int l;
    public boolean m;

    public static final void a(TvAppsListFragment tvAppsListFragment, ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ArrayObjectAdapter arrayObjectAdapter = tvAppsListFragment.f4497a;
                arrayObjectAdapter.getClass();
                arrayObjectAdapter.add(arrayList.get(i));
            }
            return;
        }
        String string = tvAppsListFragment.getString(R.string.no_data_available);
        string.getClass();
        FragmentActivity activity = tvAppsListFragment.getActivity();
        if (activity != null && !activity.isFinishing()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setMessage(string);
            builder.setPositiveButton(android.R.string.ok, new b(6));
            builder.setCancelable(true);
            builder.create().show();
        }
    }

    @Override // androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        CharSequence charSequence;
        Bundle extras;
        Parcelable parcelable;
        super.onCreate(bundle);
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new f());
        this.f4497a = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
        FragmentActivity activity = getActivity();
        if (activity != null && (extras = activity.getIntent().getExtras()) != null && extras.containsKey("category")) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = (Parcelable) extras.getParcelable("category", j.class);
            } else {
                parcelable = extras.getParcelable("category");
            }
            this.f4498b = (j) parcelable;
        }
        j jVar = this.f4498b;
        if (jVar != null) {
            charSequence = jVar.f7408b;
        } else {
            charSequence = null;
        }
        setTitle(charSequence);
        if (bundle == null) {
            prepareEntranceTransition();
        }
        VerticalGridPresenter verticalGridPresenter = new VerticalGridPresenter();
        verticalGridPresenter.setNumberOfColumns(5);
        setGridPresenter(verticalGridPresenter);
        startEntranceTransition();
        setOnItemViewClickedListener(new t5.f(this));
        setOnItemViewSelectedListener(new g(this));
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new h(this, null, 1), 3);
    }
}
