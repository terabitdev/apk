package io.elevenlabs.readerapp.ui.screens.authenticated.explore;

import java.util.List;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15443a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15444b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f15443a = i10;
        this.f15444b = obj;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z ExploreScreenUI$lambda$5$0$0$0$15$0$1$0$0;
        z ExploreScreen$lambda$3;
        z ExploreScreen$lambda$7$0;
        switch (this.f15443a) {
            case 0:
                ExploreScreenUI$lambda$5$0$0$0$15$0$1$0$0 = ExploreScreenKt.ExploreScreenUI$lambda$5$0$0$0$15$0$1$0$0((ho.l) this.f15444b, (String) obj, (List) obj2);
                return ExploreScreenUI$lambda$5$0$0$0$15$0$1$0$0;
            case 1:
                ExploreScreen$lambda$3 = ExploreScreenKt.ExploreScreen$lambda$3((ho.p) this.f15444b, (u2.m) obj, ((Integer) obj2).intValue());
                return ExploreScreen$lambda$3;
            default:
                ExploreScreen$lambda$7$0 = ExploreScreenKt.ExploreScreen$lambda$7$0((ExploreViewModel) this.f15444b, (String) obj, ((Boolean) obj2).booleanValue());
                return ExploreScreen$lambda$7$0;
        }
    }
}
