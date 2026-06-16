package io.elevenlabs.readerapp.core.router;

import android.os.Bundle;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Destination;
import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14423b;

    public /* synthetic */ g0(Object obj, int i10) {
        this.f14422a = i10;
        this.f14423b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        CharSequence resolvedRoute$lambda$0;
        RouterState requestNavigation$lambda$0;
        RouterState requestStartSelectiveStackPopping$lambda$0;
        switch (this.f14422a) {
            case 0:
                return RouterViewModel$onRouteChanged$1$1.d((AsyncCallResult.Success) this.f14423b, (RouterState) obj);
            case 1:
                resolvedRoute$lambda$0 = RouterKt.resolvedRoute$lambda$0((Bundle) this.f14423b, (wq.h) obj);
                return resolvedRoute$lambda$0;
            case 2:
                requestNavigation$lambda$0 = RouterViewModel.requestNavigation$lambda$0((Destination) this.f14423b, (RouterState) obj);
                return requestNavigation$lambda$0;
            default:
                requestStartSelectiveStackPopping$lambda$0 = RouterViewModel.requestStartSelectiveStackPopping$lambda$0((List) this.f14423b, (RouterState) obj);
                return requestStartSelectiveStackPopping$lambda$0;
        }
    }
}
