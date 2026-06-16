package io.elevenlabs.ui.components;

import io.elevenlabs.readerapp.ui.screens.authenticated.reads.composables.ChaptersSectionKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q1 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17584a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17585b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17586c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17589f;

    public /* synthetic */ q1(String str, int i10, MetaChipVariant metaChipVariant, int i11, int i12) {
        this.f17584a = 0;
        this.f17588e = str;
        this.f17585b = i10;
        this.f17589f = metaChipVariant;
        this.f17586c = i11;
        this.f17587d = i12;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z MetaChip$lambda$1;
        sn.z ChapterItem$lambda$1;
        switch (this.f17584a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                MetaChip$lambda$1 = MetaChipKt.MetaChip$lambda$1((String) this.f17588e, this.f17585b, (MetaChipVariant) this.f17589f, this.f17586c, this.f17587d, (u2.m) obj, intValue);
                return MetaChip$lambda$1;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                return TabIndicatorKt.a(this.f17585b, (w1.e0) this.f17588e, (i3.t) this.f17589f, this.f17586c, this.f17587d, (u2.m) obj, intValue2);
            default:
                int intValue3 = ((Integer) obj2).intValue();
                ChapterItem$lambda$1 = ChaptersSectionKt.ChapterItem$lambda$1(this.f17585b, (String) this.f17588e, (i3.t) this.f17589f, this.f17586c, this.f17587d, (u2.m) obj, intValue3);
                return ChapterItem$lambda$1;
        }
    }

    public /* synthetic */ q1(int i10, Object obj, i3.t tVar, int i11, int i12, int i13) {
        this.f17584a = i13;
        this.f17585b = i10;
        this.f17588e = obj;
        this.f17589f = tVar;
        this.f17586c = i11;
        this.f17587d = i12;
    }
}
