package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3;

import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3;
import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15692a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f15693b;

    public /* synthetic */ s(List list, int i10) {
        this.f15692a = i10;
        this.f15693b = list;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        HomeStateV3 emit$lambda$0;
        HomeStateV3 emit$lambda$02;
        switch (this.f15692a) {
            case 0:
                emit$lambda$0 = HomeViewModelV3.AnonymousClass6.AnonymousClass2.AnonymousClass1.emit$lambda$0(this.f15693b, (HomeStateV3) obj);
                return emit$lambda$0;
            default:
                emit$lambda$02 = HomeViewModelV3.AnonymousClass7.AnonymousClass1.emit$lambda$0(this.f15693b, (HomeStateV3) obj);
                return emit$lambda$02;
        }
    }
}
