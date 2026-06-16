package com.uptodown.tv.ui.fragment;

import android.app.AlertDialog;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.leanback.app.BrowseSupportFragment;
import androidx.leanback.app.VerticalGridSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.VerticalGridPresenter;
import androidx.lifecycle.LifecycleOwnerKt;
import c8.f0;
import com.uptodown.R;
import o4.g6;
import q1.e0;
import t5.a0;
import t5.c0;
import w5.g;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class TvMyDownloadsFragment extends VerticalGridSupportFragment implements BrowseSupportFragment.MainFragmentAdapterProvider {

    /* renamed from: a, reason: collision with root package name */
    public ArrayObjectAdapter f4502a;

    /* renamed from: b, reason: collision with root package name */
    public AlertDialog f4503b;
    public final c0 l = new BrowseSupportFragment.MainFragmentAdapter(this);

    @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentAdapterProvider
    public final BrowseSupportFragment.MainFragmentAdapter getMainFragmentAdapter() {
        return this.l;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [r5.o, androidx.leanback.widget.Presenter] */
    @Override // androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ?? presenter = new Presenter();
        presenter.f10263a = -1;
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter((Presenter) presenter);
        this.f4502a = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
        setTitle(getString(R.string.downloads_title));
        if (bundle == null) {
            prepareEntranceTransition();
        }
        VerticalGridPresenter verticalGridPresenter = new VerticalGridPresenter();
        verticalGridPresenter.setNumberOfColumns(2);
        setGridPresenter(verticalGridPresenter);
        startEntranceTransition();
        setOnItemViewClickedListener(new a0(this));
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        e0 e0Var = g.D;
        Context requireContext = requireContext();
        requireContext.getClass();
        g f7 = e0Var.f(requireContext);
        f7.b();
        ContentValues contentValues = new ContentValues();
        contentValues.put("checked", (Integer) 1);
        SQLiteDatabase sQLiteDatabase = f7.f11192a;
        sQLiteDatabase.getClass();
        sQLiteDatabase.update("downloads", contentValues, null, null);
        f7.d();
        super.onPause();
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Context context = getContext();
        if (context != null) {
            Object systemService = context.getSystemService("notification");
            systemService.getClass();
            ((NotificationManager) systemService).cancel(258);
        }
        f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g6(this, null, 10), 3);
    }
}
