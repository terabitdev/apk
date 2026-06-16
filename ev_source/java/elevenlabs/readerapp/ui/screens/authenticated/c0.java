package io.elevenlabs.readerapp.ui.screens.authenticated;

import android.view.View;
import io.elevenlabs.readerapp.ui.screens.authenticated.series.ExploreSeriesScreenKt;
import io.elevenlabs.ui.components.KeepScreenOnKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f15275b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15276c;

    public /* synthetic */ c0(View view, int i10, boolean z6) {
        this.f15274a = i10;
        this.f15275b = view;
        this.f15276c = z6;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        u2.h0 ExploreCollectionScreenUI$lambda$2$0;
        switch (this.f15274a) {
            case 0:
                ExploreCollectionScreenUI$lambda$2$0 = ExploreCollectionScreenKt.ExploreCollectionScreenUI$lambda$2$0(this.f15275b, this.f15276c, (u2.i0) obj);
                return ExploreCollectionScreenUI$lambda$2$0;
            case 1:
                return ExploreSeriesScreenKt.c(this.f15275b, this.f15276c, (u2.i0) obj);
            default:
                return KeepScreenOnKt.a(this.f15275b, this.f15276c, (u2.i0) obj);
        }
    }
}
