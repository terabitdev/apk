package io.elevenlabs.readerapp.ui.components;

import r1.l2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14690a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14691b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f14692c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f14693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14694e;

    public /* synthetic */ j(String str, Long l4, boolean z6, boolean z10) {
        this.f14692c = z6;
        this.f14693d = z10;
        this.f14694e = l4;
        this.f14691b = str;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z CollectionRow$lambda$0$0$0;
        sn.z VoiceFeaturedCell$lambda$1$0$0$0;
        switch (this.f14690a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                CollectionRow$lambda$0$0$0 = CollectionMetaSmallRowKt.CollectionRow$lambda$0$0$0(this.f14692c, this.f14693d, (Long) this.f14694e, this.f14691b, (l2) obj, (u2.m) obj2, intValue);
                return CollectionRow$lambda$0$0$0;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                VoiceFeaturedCell$lambda$1$0$0$0 = VoiceFeaturedCellKt.VoiceFeaturedCell$lambda$1$0$0$0(this.f14691b, (String) this.f14694e, this.f14692c, this.f14693d, (r1.s) obj, (u2.m) obj2, intValue2);
                return VoiceFeaturedCell$lambda$1$0$0$0;
        }
    }

    public /* synthetic */ j(String str, String str2, boolean z6, boolean z10) {
        this.f14691b = str;
        this.f14694e = str2;
        this.f14692c = z6;
        this.f14693d = z10;
    }
}
