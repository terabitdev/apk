package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import a2.n1;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantContract;
import p4.a0;
import p4.b0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15143a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15144b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15145c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15146d;

    public /* synthetic */ m(l2.i iVar, boolean z6, boolean z10) {
        this.f15146d = iVar;
        this.f15144b = z6;
        this.f15145c = z10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        AssistantContract.State updateMicPermission$lambda$0;
        n1 n1Var;
        l2.z zVar;
        boolean z6;
        switch (this.f15143a) {
            case 0:
                updateMicPermission$lambda$0 = AskAssistantViewModel.updateMicPermission$lambda$0(this.f15144b, (AskAssistantViewModel) this.f15146d, this.f15145c, (AssistantContract.State) obj);
                return updateMicPermission$lambda$0;
            default:
                b0 b0Var = (b0) obj;
                long a10 = ((l2.i) this.f15146d).a();
                a0 a0Var = l2.b0.f21115c;
                if (this.f15144b) {
                    n1Var = n1.f1003b;
                } else {
                    n1Var = n1.f1004c;
                }
                if (this.f15145c) {
                    zVar = l2.z.f21299a;
                } else {
                    zVar = l2.z.f21301c;
                }
                if ((9223372034707292159L & a10) != 9205357640488583168L) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                b0Var.b(a0Var, new l2.a0(n1Var, a10, zVar, z6));
                return sn.z.f31622a;
        }
    }

    public /* synthetic */ m(boolean z6, AskAssistantViewModel askAssistantViewModel, boolean z10) {
        this.f15144b = z6;
        this.f15146d = askAssistantViewModel;
        this.f15145c = z10;
    }
}
