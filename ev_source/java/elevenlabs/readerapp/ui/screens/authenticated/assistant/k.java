package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import io.elevenlabs.ui.components.ErrorScreenKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements ho.p {
    public final /* synthetic */ Object Y;
    public final /* synthetic */ sn.d Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15128a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15129b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15130c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f15131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15133f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Object f15134x0;

    public /* synthetic */ k(i3.t tVar, String str, String str2, ho.p pVar, ho.p pVar2, long j4, int i10, int i11) {
        this.Y = tVar;
        this.f15129b = str;
        this.f15130c = str2;
        this.Z = pVar;
        this.f15134x0 = pVar2;
        this.f15131d = j4;
        this.f15132e = i10;
        this.f15133f = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z AskAssistantSheet$lambda$9;
        sn.z ErrorScreen_V_9fs2A$lambda$1;
        switch (this.f15128a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                AskAssistantSheet$lambda$9 = AskAssistantSheetKt.AskAssistantSheet$lambda$9(this.f15129b, this.f15130c, this.f15131d, (String) this.Y, (ho.a) this.Z, (AskAssistantViewModel) this.f15134x0, this.f15132e, this.f15133f, (u2.m) obj, intValue);
                return AskAssistantSheet$lambda$9;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                ErrorScreen_V_9fs2A$lambda$1 = ErrorScreenKt.ErrorScreen_V_9fs2A$lambda$1((i3.t) this.Y, this.f15129b, this.f15130c, (ho.p) this.Z, (ho.p) this.f15134x0, this.f15131d, this.f15132e, this.f15133f, (u2.m) obj, intValue2);
                return ErrorScreen_V_9fs2A$lambda$1;
        }
    }

    public /* synthetic */ k(String str, String str2, long j4, String str3, ho.a aVar, AskAssistantViewModel askAssistantViewModel, int i10, int i11) {
        this.f15129b = str;
        this.f15130c = str2;
        this.f15131d = j4;
        this.Y = str3;
        this.Z = aVar;
        this.f15134x0 = askAssistantViewModel;
        this.f15132e = i10;
        this.f15133f = i11;
    }
}
