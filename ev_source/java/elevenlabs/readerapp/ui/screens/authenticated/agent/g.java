package io.elevenlabs.readerapp.ui.screens.authenticated.agent;

import ho.l;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionState;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionViewModel;
import m2.k1;
import p4.b0;
import p4.n;
import p4.y;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15080c;

    public /* synthetic */ g(String str, boolean z6) {
        this.f15078a = 0;
        this.f15080c = str;
        this.f15079b = z6;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        AskAgentContract.State onAgentResponseStreaming$lambda$0;
        AddReadToCollectionState performToggle$lambda$0;
        switch (this.f15078a) {
            case 0:
                onAgentResponseStreaming$lambda$0 = AskAgentViewModel$sessionListener$1.onAgentResponseStreaming$lambda$0(this.f15080c, this.f15079b, (AskAgentContract.State) obj);
                return onAgentResponseStreaming$lambda$0;
            case 1:
                performToggle$lambda$0 = AddReadToCollectionViewModel.performToggle$lambda$0(this.f15079b, this.f15080c, (AddReadToCollectionState) obj);
                return performToggle$lambda$0;
            default:
                b0 b0Var = (b0) obj;
                if (this.f15079b) {
                    y.f(b0Var, 0);
                }
                y.g(this.f15080c, b0Var);
                b0Var.b(n.f26511v, new p4.a(null, new k1(0)));
                return z.f31622a;
        }
    }

    public /* synthetic */ g(int i10, String str, boolean z6) {
        this.f15078a = i10;
        this.f15079b = z6;
        this.f15080c = str;
    }
}
