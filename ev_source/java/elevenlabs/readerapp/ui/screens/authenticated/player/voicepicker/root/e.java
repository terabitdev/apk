package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root;

import ho.q;
import i1.j2;
import i1.o;
import io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt;
import r1.s;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16442a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f16443b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j2 f16444c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f16445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z0 f16446e;

    public /* synthetic */ e(ho.l lVar, j2 j2Var, o oVar, z0 z0Var, int i10) {
        this.f16442a = i10;
        this.f16443b = lVar;
        this.f16444c = j2Var;
        this.f16445d = oVar;
        this.f16446e = z0Var;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z SearchHeader$lambda$3;
        z SearchScreenUI$lambda$9$0$0;
        switch (this.f16442a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                SearchHeader$lambda$3 = VoicePickerHeaderKt.SearchHeader$lambda$3(this.f16443b, this.f16444c, this.f16445d, this.f16446e, (s) obj, (u2.m) obj2, intValue);
                return SearchHeader$lambda$3;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                SearchScreenUI$lambda$9$0$0 = SearchScreenKt.SearchScreenUI$lambda$9$0$0(this.f16443b, this.f16444c, this.f16445d, this.f16446e, (s) obj, (u2.m) obj2, intValue2);
                return SearchScreenUI$lambda$9$0$0;
        }
    }
}
