package io.elevenlabs.readerapp.ui.screens.authenticated.explore;

import java.util.List;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15553a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f15554b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15555c;

    public /* synthetic */ o(String str, List list) {
        this.f15555c = str;
        this.f15554b = list;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z ExploreScreenUI$lambda$5$0$0$0$15$0$1$0$0$0;
        ExploreState updateFilter$lambda$0;
        switch (this.f15553a) {
            case 0:
                ExploreScreenUI$lambda$5$0$0$0$15$0$1$0$0$0 = ExploreScreenKt.ExploreScreenUI$lambda$5$0$0$0$15$0$1$0$0$0(this.f15555c, this.f15554b, (ExploreViewModel) obj);
                return ExploreScreenUI$lambda$5$0$0$0$15$0$1$0$0$0;
            default:
                updateFilter$lambda$0 = ExploreViewModel.updateFilter$lambda$0(this.f15554b, this.f15555c, (ExploreState) obj);
                return updateFilter$lambda$0;
        }
    }

    public /* synthetic */ o(List list, String str) {
        this.f15554b = list;
        this.f15555c = str;
    }
}
