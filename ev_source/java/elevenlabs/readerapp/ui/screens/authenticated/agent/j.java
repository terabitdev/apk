package io.elevenlabs.readerapp.ui.screens.authenticated.agent;

import ho.p;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15084a;

    public /* synthetic */ j(int i10) {
        this.f15084a = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z lambda_87571999$lambda$0;
        z lambda_319085793$lambda$0;
        int i10 = this.f15084a;
        m mVar = (m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                lambda_87571999$lambda$0 = ComposableSingletons$AskAgentScreenKt.lambda_87571999$lambda$0(mVar, intValue);
                return lambda_87571999$lambda$0;
            case 1:
                lambda_319085793$lambda$0 = ComposableSingletons$AskAgentScreenKt.lambda_319085793$lambda$0(mVar, intValue);
                return lambda_319085793$lambda$0;
            case 2:
                return ComposableSingletons$PreviewAskAgentScreenConnectedAskAgentAskAgentConnectedKt.a(mVar, intValue);
            default:
                return ComposableSingletons$PreviewAskAgentScreenDisconnectedAskAgentAskAgentDisconnectedKt.a(mVar, intValue);
        }
    }
}
