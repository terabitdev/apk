package io.elevenlabs.ocr;

import androidx.lifecycle.b0;
import fr.d0;
import g0.i0;
import g0.u0;
import i1.j2;
import i4.q2;
import io.elevenlabs.readerapp.core.router.RouterKt;
import io.elevenlabs.readerapp.core.router.RouterViewModel;
import java.util.List;
import na.c0;
import sn.z;
import u2.h0;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements ho.l {
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14299b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14300c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14302e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14303f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Object f14304x0;

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10) {
        this.f14298a = i10;
        this.f14299b = obj;
        this.f14300c = obj2;
        this.f14301d = obj3;
        this.f14302e = obj4;
        this.f14303f = obj5;
        this.Y = obj6;
        this.Z = obj7;
        this.f14304x0 = obj8;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        h0 CameraView$lambda$16$0;
        z Router$lambda$20$0$4$0;
        switch (this.f14298a) {
            case 0:
                CameraView$lambda$16$0 = OcrImportScreenKt.CameraView$lambda$16$0((u0) this.f14299b, (i0) this.f14300c, (b0) this.f14301d, (c1.k) this.f14302e, (ho.l) this.f14303f, (z0) this.Y, (z0) this.Z, (z0) this.f14304x0, (u2.i0) obj);
                return CameraView$lambda$16$0;
            default:
                Router$lambda$20$0$4$0 = RouterKt.Router$lambda$20$0$4$0((String) this.f14299b, (c0) this.f14300c, (RouterViewModel) this.f14301d, (List) this.f14302e, (h5.c) this.f14303f, (d0) this.Y, (q2) this.Z, (j2) this.f14304x0, (na.z) obj);
                return Router$lambda$20$0$4$0;
        }
    }
}
