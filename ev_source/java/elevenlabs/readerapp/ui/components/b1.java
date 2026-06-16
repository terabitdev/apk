package io.elevenlabs.readerapp.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14522a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f14524c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14527f;

    public /* synthetic */ b1(long j4, vk.j jVar, vk.i iVar, vk.j jVar2, int i10) {
        this.f14524c = j4;
        this.f14523b = jVar;
        this.f14526e = iVar;
        this.f14527f = jVar2;
        this.f14525d = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z VoiceCollectionCell_FNF3uiM$lambda$5;
        switch (this.f14522a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                VoiceCollectionCell_FNF3uiM$lambda$5 = VoiceCollectionCellKt.VoiceCollectionCell_FNF3uiM$lambda$5((String) this.f14523b, (String) this.f14526e, this.f14524c, (ho.a) this.f14527f, this.f14525d, (u2.m) obj, intValue);
                return VoiceCollectionCell_FNF3uiM$lambda$5;
            case 1:
                ((Integer) obj2).getClass();
                m2.o0.a((u3.c) this.f14526e, (String) this.f14523b, (i3.t) this.f14527f, this.f14524c, (u2.m) obj, u2.r.M(this.f14525d | 1));
                return sn.z.f31622a;
            default:
                ((Integer) obj2).getClass();
                kd.a.d(this.f14524c, (vk.j) this.f14523b, (vk.i) this.f14526e, (vk.j) this.f14527f, (u2.m) obj, u2.r.M(this.f14525d | 1));
                return sn.z.f31622a;
        }
    }

    public /* synthetic */ b1(String str, String str2, long j4, ho.a aVar, int i10) {
        this.f14523b = str;
        this.f14526e = str2;
        this.f14524c = j4;
        this.f14527f = aVar;
        this.f14525d = i10;
    }

    public /* synthetic */ b1(u3.c cVar, String str, i3.t tVar, long j4, int i10) {
        this.f14526e = cVar;
        this.f14523b = str;
        this.f14527f = tVar;
        this.f14524c = j4;
        this.f14525d = i10;
    }
}
