package io.elevenlabs.ocr;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.util.Rational;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.b0;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import fr.d0;
import g0.i0;
import g0.i1;
import g0.j1;
import g0.k1;
import h4.f2;
import i1.e2;
import i1.g0;
import i1.y0;
import io.elevenlabs.domain.model.LimitReachedData;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.components.ButtonIconKt;
import io.elevenlabs.ui.components.ButtonIconVariant;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonSize;
import io.elevenlabs.ui.components.ButtonVariant;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.ReorderableRowKt;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ReaderColors;
import io.livekit.android.rpc.RpcError;
import j1.b2;
import j1.e1;
import j1.u1;
import j1.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import m0.d1;
import m0.p1;
import m0.q1;
import p3.h0;
import p3.w0;
import q2.k5;
import r1.c3;
import r1.d2;
import r1.i2;
import r1.k2;
import r1.l2;
import r1.m0;
import r1.m1;
import r1.m2;
import r1.o1;
import r1.p2;
import r1.u0;
import sn.z;
import u2.r;
import u2.r1;
import u2.s2;
import u2.x0;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\u001ag\u0010\u000f\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u00020\t*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001aE\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u001e\u0010\u0017\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001aM\u0010\u001e\u001a\u00020\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001aE\u0010 \u001a\u00020\u00052\u001e\u0010\u0017\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0003¢\u0006\u0004\b \u0010!\u001aq\u0010,\u001a\u00020\u00052\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00002\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00050\u00032\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00050&2\b\u0010(\u001a\u0004\u0018\u00010\"2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010+\u001a\u00020*H\u0003¢\u0006\u0004\b,\u0010-\u001a?\u00101\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00112\u0006\u00100\u001a\u00020/2\u001e\u0010\u0017\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\u00050\u0003H\u0002¢\u0006\u0004\b1\u00102\u001a\u0013\u00103\u001a\u00020\t*\u00020\u0011H\u0002¢\u0006\u0004\b3\u00104\u001a(\u00107\u001a\u00028\u0000\"\u0004\b\u0000\u00105*\b\u0012\u0004\u0012\u00028\u0000062\u0006\u0010.\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b7\u00108\u001a\u001b\u0010<\u001a\u00020\t*\u0002092\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=\u001a\u0013\u0010>\u001a\u00020\u0005*\u00020\u0011H\u0002¢\u0006\u0004\b>\u0010?\u001a\u000f\u0010@\u001a\u00020\u0005H\u0007¢\u0006\u0004\b@\u0010A\u001a\u000f\u0010B\u001a\u00020\u0005H\u0007¢\u0006\u0004\bB\u0010A\u001a\u000f\u0010C\u001a\u00020\u0005H\u0007¢\u0006\u0004\bC\u0010A\u001a\u000f\u0010D\u001a\u00020\u0005H\u0007¢\u0006\u0004\bD\u0010A\u001a\u000f\u0010E\u001a\u00020\u0005H\u0007¢\u0006\u0004\bE\u0010A\u001a\u000f\u0010F\u001a\u00020\u0005H\u0007¢\u0006\u0004\bF\u0010A\u001a\u000f\u0010G\u001a\u00020\u0005H\u0007¢\u0006\u0004\bG\u0010A¨\u0006V²\u0006\f\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002²\u0006\u000e\u0010H\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010J\u001a\u0004\u0018\u00010I8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010K\u001a\u0004\u0018\u0001098\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010M\u001a\u0004\u0018\u00010L8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010N\u001a\u00020$8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010O\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010Q\u001a\u00020P8\nX\u008a\u0084\u0002²\u0006\f\u0010R\u001a\u00020P8\nX\u008a\u0084\u0002²\u0006\u0010\u0010S\u001a\u0004\u0018\u00010\"8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010T\u001a\u00020P8\nX\u008a\u0084\u0002²\u0006\f\u0010U\u001a\u00020P8\nX\u008a\u0084\u0002²\u0006\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00008\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010(\u001a\u0004\u0018\u00010\"8\n@\nX\u008a\u008e\u0002"}, d2 = {"", "", "initialImages", "Lkotlin/Function1;", "Lio/elevenlabs/domain/model/ReadMeta;", "Lsn/z;", "onNavigateToRead", "Lkotlin/Function0;", "onClose", "", "isPodcastMode", "Lio/elevenlabs/domain/model/LimitReachedData;", "onNavigateToAddPodcastLimitReached", "Lio/elevenlabs/ocr/OcrImportViewModel;", "vm", "OcrImportScreen", "(Ljava/util/List;Lho/l;Lho/a;ZLho/l;Lio/elevenlabs/ocr/OcrImportViewModel;Lu2/m;II)V", "Landroid/content/Context;", "permission", "hasPermission", "(Landroid/content/Context;Ljava/lang/String;)Z", "Lio/elevenlabs/ocr/OcrImportState;", RemoteConfigConstants.ResponseFieldKey.STATE, "action", "onGoBack", "OcrImportScreenUI", "(Lio/elevenlabs/ocr/OcrImportState;Lho/l;Lho/a;Lu2/m;I)V", "Lr1/l2;", "middle", "end", "CameraHeader", "(Lho/a;Lho/q;Lho/q;Lu2/m;II)V", "CameraView", "(Lho/l;Lio/elevenlabs/ocr/OcrImportState;Lho/a;Lu2/m;I)V", "Landroid/net/Uri;", "images", "", "onDragStarted", "Lkotlin/Function2;", "onSwap", "selectedImage", "onPictureClick", "Lt1/z;", "listState", "Thumbnails", "(Ljava/util/List;Lho/l;Lho/p;Landroid/net/Uri;Lho/l;Lt1/z;Lu2/m;I)V", "context", "Lg0/i0;", "imageCapture", "captureImage", "(Landroid/content/Context;Lg0/i0;Lho/l;)V", "hasWriteImagePermissions", "(Landroid/content/Context;)Z", TokenNames.T, "Llh/b0;", "await", "(Llh/b0;Landroid/content/Context;Lwn/c;)Ljava/lang/Object;", "Lb1/h;", "Lg0/q;", "selector", "hasCameraSafe", "(Lb1/h;Lg0/q;)Z", "openAppSettings", "(Landroid/content/Context;)V", "Preview_OcrImportScreen_Idle", "(Lu2/m;I)V", "Preview_OcrImportScreen_PermissionsNotGranted", "Preview_OcrImportScreen_PermissionsGranted", "Preview_OcrImportScreen_WithImages", "Preview_OcrImportScreen_WithImages_Selected", "Preview_OcrImportScreen_Loading", "Preview_Thumbnails", "torchEnabled", "Lh5/l;", "previewSize", "cameraProvider", "Lg0/k;", "camera", "lastImageCount", "shutterOpen", "", "shutterOverlayOpacity", "shutterButtonScale", "lastImage", "selectionScale", "draggingScale", "ocr_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OcrImportScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0042  */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void CameraHeader(ho.a aVar, ho.q qVar, ho.q qVar2, u2.m mVar, int i10, int i11) {
        int i12;
        ho.q qVar3;
        int i13;
        int i14;
        ho.q qVar4;
        int i15;
        boolean z6;
        ho.q qVar5;
        ho.q qVar6;
        r1 r10;
        ho.q qVar7;
        int i16;
        h4.e eVar;
        h4.e eVar2;
        h4.e eVar3;
        h4.f fVar;
        h4.d dVar;
        h4.e eVar4;
        ?? r92;
        ho.q qVar8;
        ho.q qVar9;
        int i17;
        u2.q qVar10 = (u2.q) mVar;
        qVar10.Z(-944528394);
        if ((i10 & 6) == 0) {
            if (qVar10.h(aVar)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            qVar3 = qVar;
            if (qVar10.h(qVar3)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                qVar4 = qVar2;
                if (qVar10.h(qVar4)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                if ((i12 & 147) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar10.O(i12 & 1, z6)) {
                    if (i18 != 0) {
                        qVar3 = null;
                    }
                    if (i14 != 0) {
                        qVar7 = null;
                    } else {
                        qVar7 = qVar4;
                    }
                    i3.q qVar11 = i3.q.f13017a;
                    i3.t e10 = p2.e(qVar11, 1.0f);
                    WeakHashMap weakHashMap = c3.f29142x;
                    i3.t P = r1.d.P(e10, u0.e(qVar10).f29154l);
                    f1 d10 = r1.p.d(i3.d.f12997a, false);
                    int hashCode = Long.hashCode(qVar10.T);
                    c3.o l4 = qVar10.l();
                    i3.t c5 = i3.a.c(P, qVar10);
                    h4.h.f11920i.getClass();
                    h4.f fVar2 = h4.g.f11903b;
                    qVar10.b0();
                    if (qVar10.S) {
                        qVar10.k(fVar2);
                    } else {
                        qVar10.k0();
                    }
                    h4.e eVar5 = h4.g.f11907f;
                    r.J(eVar5, d10, qVar10);
                    h4.e eVar6 = h4.g.f11906e;
                    r.J(eVar6, l4, qVar10);
                    Integer valueOf = Integer.valueOf(hashCode);
                    h4.e eVar7 = h4.g.f11908g;
                    r.y(qVar10, valueOf, eVar7);
                    h4.d dVar2 = h4.g.f11909h;
                    r.F(dVar2, qVar10);
                    h4.e eVar8 = h4.g.f11905d;
                    r.J(eVar8, c5, qVar10);
                    u0 u0Var = r1.j.f29228a;
                    ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                    int i19 = ElevenLabsTheme.$stable;
                    int i20 = i12;
                    r1.h h10 = r1.j.h(elevenLabsTheme.getSpacings(qVar10, i19).m2356getX4D9Ej5fM(), i3.d.B0);
                    i3.t f10 = ib.i.f(elevenLabsTheme, qVar10, i19, p2.e(qVar11, 1.0f));
                    i3.k kVar = i3.d.f13004y0;
                    k2 a10 = i2.a(h10, kVar, qVar10, 0);
                    int hashCode2 = Long.hashCode(qVar10.T);
                    c3.o l7 = qVar10.l();
                    i3.t c10 = i3.a.c(f10, qVar10);
                    qVar10.b0();
                    if (qVar10.S) {
                        qVar10.k(fVar2);
                    } else {
                        qVar10.k0();
                    }
                    r.J(eVar5, a10, qVar10);
                    r.J(eVar6, l7, qVar10);
                    defpackage.f.u(hashCode2, qVar10, eVar7, qVar10, dVar2);
                    r.J(eVar8, c10, qVar10);
                    ho.q qVar12 = qVar7;
                    ho.q qVar13 = qVar3;
                    boolean z10 = true;
                    ButtonIconKt.ButtonIcon(io.elevenlabs.ui.R.drawable.chevron_left, kj.c.R(qVar10, R.string.ocr_accessibility_go_back), aVar, null, ButtonIconVariant.Transparent, null, false, false, false, qVar10, ((i20 << 6) & 896) | 24576, 488);
                    qVar10.p(true);
                    Object obj = m2.f29267a;
                    if (qVar12 != null) {
                        qVar10.X(-1540188644);
                        r1.h h11 = r1.j.h(elevenLabsTheme.getSpacings(qVar10, i19).m2356getX4D9Ej5fM(), i3.d.D0);
                        i3.t f11 = ib.i.f(elevenLabsTheme, qVar10, i19, p2.e(qVar11, 1.0f));
                        r92 = 0;
                        k2 a11 = i2.a(h11, kVar, qVar10, 0);
                        int hashCode3 = Long.hashCode(qVar10.T);
                        c3.o l10 = qVar10.l();
                        i3.t c11 = i3.a.c(f11, qVar10);
                        qVar10.b0();
                        if (qVar10.S) {
                            fVar = fVar2;
                            qVar10.k(fVar);
                        } else {
                            fVar = fVar2;
                            qVar10.k0();
                        }
                        eVar = eVar5;
                        r.J(eVar, a11, qVar10);
                        eVar2 = eVar6;
                        r.J(eVar2, l10, qVar10);
                        eVar3 = eVar7;
                        dVar = dVar2;
                        defpackage.f.u(hashCode3, qVar10, eVar3, qVar10, dVar);
                        eVar4 = eVar8;
                        r.J(eVar4, c11, qVar10);
                        i16 = 6;
                        ho.q qVar14 = qVar12;
                        qVar14.invoke(obj, qVar10, Integer.valueOf(((i20 >> 3) & 112) | 6));
                        qVar10.p(true);
                        qVar10.p(false);
                        qVar8 = qVar14;
                    } else {
                        i16 = 6;
                        eVar = eVar5;
                        eVar2 = eVar6;
                        eVar3 = eVar7;
                        fVar = fVar2;
                        dVar = dVar2;
                        eVar4 = eVar8;
                        r92 = 0;
                        qVar8 = qVar12;
                        qVar10.X(-1539830842);
                        qVar10.p(false);
                    }
                    if (qVar13 != null) {
                        qVar10.X(-1539775414);
                        r1.h h12 = r1.j.h(elevenLabsTheme.getSpacings(qVar10, i19).m2356getX4D9Ej5fM(), i3.d.C0);
                        i3.t f12 = ib.i.f(elevenLabsTheme, qVar10, i19, p2.e(qVar11, 1.0f));
                        k2 a12 = i2.a(h12, kVar, qVar10, r92);
                        int hashCode4 = Long.hashCode(qVar10.T);
                        c3.o l11 = qVar10.l();
                        i3.t c12 = i3.a.c(f12, qVar10);
                        qVar10.b0();
                        if (qVar10.S) {
                            qVar10.k(fVar);
                        } else {
                            qVar10.k0();
                        }
                        r.J(eVar, a12, qVar10);
                        r.J(eVar2, l11, qVar10);
                        defpackage.f.u(hashCode4, qVar10, eVar3, qVar10, dVar);
                        r.J(eVar4, c12, qVar10);
                        ho.q qVar15 = qVar13;
                        qVar15.invoke(obj, qVar10, Integer.valueOf(i16 | (i20 & 112)));
                        z10 = true;
                        qVar10.p(true);
                        qVar10.p(r92);
                        qVar9 = qVar15;
                    } else {
                        qVar9 = qVar13;
                        qVar10.X(-1539400314);
                        qVar10.p(r92);
                    }
                    qVar10.p(z10);
                    qVar5 = qVar9;
                    qVar6 = qVar8;
                } else {
                    qVar10.R();
                    qVar5 = qVar3;
                    qVar6 = qVar4;
                }
                r10 = qVar10.r();
                if (r10 != null) {
                    r10.f34012d = new fm.f(aVar, qVar5, qVar6, i10, i11, 4);
                    return;
                }
                return;
            }
            qVar4 = qVar2;
            if ((i12 & 147) != 146) {
            }
            if (qVar10.O(i12 & 1, z6)) {
            }
            r10 = qVar10.r();
            if (r10 != null) {
            }
        }
        qVar3 = qVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        qVar4 = qVar2;
        if ((i12 & 147) != 146) {
        }
        if (qVar10.O(i12 & 1, z6)) {
        }
        r10 = qVar10.r();
        if (r10 != null) {
        }
    }

    public static final z CameraHeader$lambda$1(ho.a aVar, ho.q qVar, ho.q qVar2, int i10, int i11, u2.m mVar, int i12) {
        CameraHeader(aVar, qVar, qVar2, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [g0.u0, java.lang.Object, g0.i1] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v47 */
    private static final void CameraView(final ho.l lVar, OcrImportState ocrImportState, ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        ho.l lVar2;
        OcrImportState ocrImportState2;
        u2.q qVar;
        boolean z10;
        z0 z0Var;
        final int i12;
        boolean z11;
        i0 i0Var;
        b1.h hVar;
        h5.l lVar3;
        int i13;
        Context context;
        j.j jVar;
        u2.e eVar;
        z0 z0Var2;
        z0 z0Var3;
        c1.k kVar;
        z0 z0Var4;
        h4.e eVar2;
        h4.d dVar;
        boolean z12;
        Object j02;
        float f10;
        float f11;
        boolean z13;
        Object j03;
        float f12;
        ?? r62;
        z0 z0Var5;
        j1.r1 r1Var;
        i3.t tVar;
        j1.z zVar;
        boolean z14;
        boolean z15;
        final ho.l lVar4;
        boolean z16;
        boolean z17;
        int i14;
        boolean z18;
        int i15;
        u2.q qVar2;
        boolean z19;
        boolean z20;
        g3.g f13;
        ho.l lVar5;
        ho.l lVar6;
        g3.g j4;
        int i16;
        int i17;
        int i18;
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(-1233190935);
        if ((i10 & 6) == 0) {
            if (qVar3.h(lVar)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i11 = i18 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar3.h(ocrImportState)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i11 |= i17;
        }
        if ((i10 & 384) == 0) {
            if (qVar3.h(aVar)) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i11 |= i16;
        }
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar3.O(i11 & 1, z6)) {
            Object L = qVar3.L();
            u2.e eVar3 = u2.l.f33918a;
            if (L == eVar3) {
                L = r.A(Boolean.FALSE);
                qVar3.h0(L);
            }
            z0 z0Var6 = (z0) L;
            b0 b0Var = (b0) qVar3.j(o7.e.f24864a);
            Context context2 = (Context) qVar3.j(AndroidCompositionLocals_androidKt.f2291b);
            q1 q1Var = new q1(p1.j(new g0.u(1).f10169a));
            d1.i(q1Var);
            ?? i1Var = new i1(q1Var);
            i1Var.f10172r = g0.u0.f10171y;
            Object L2 = qVar3.L();
            if (L2 == eVar3) {
                L2 = new c1.k(context2);
                qVar3.h0(L2);
            }
            c1.k kVar2 = (c1.k) L2;
            Object L3 = qVar3.L();
            if (L3 == eVar3) {
                L3 = r.A(null);
                qVar3.h0(L3);
            }
            z0 z0Var7 = (z0) L3;
            Object L4 = qVar3.L();
            if (L4 == eVar3) {
                L4 = new qf.i(27).z();
                qVar3.h0(L4);
            }
            i0 i0Var2 = (i0) L4;
            i0Var2.getClass();
            Object L5 = qVar3.L();
            if (L5 == eVar3) {
                L5 = r.A(null);
                qVar3.h0(L5);
            }
            z0 z0Var8 = (z0) L5;
            int i19 = i11;
            Object L6 = qVar3.L();
            if (L6 == eVar3) {
                L6 = r.A(null);
                qVar3.h0(L6);
            }
            z0 z0Var9 = (z0) L6;
            n.c cVar = new n.c();
            int i20 = i19 & 14;
            if (i20 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object L7 = qVar3.L();
            if (!z10 && L7 != eVar3) {
                z0Var = z0Var7;
                i12 = 0;
            } else {
                z0Var = z0Var7;
                i12 = 0;
                L7 = new ho.l() { // from class: io.elevenlabs.ocr.c
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        z CameraView$lambda$14$0;
                        z CameraView$lambda$22$0$10$0$5$0$0;
                        z CameraView$lambda$22$0$10$0$5$2$0;
                        switch (i12) {
                            case 0:
                                CameraView$lambda$14$0 = OcrImportScreenKt.CameraView$lambda$14$0(lVar, (List) obj);
                                return CameraView$lambda$14$0;
                            case 1:
                                CameraView$lambda$22$0$10$0$5$0$0 = OcrImportScreenKt.CameraView$lambda$22$0$10$0$5$0$0(lVar, ((Integer) obj).intValue());
                                return CameraView$lambda$22$0$10$0$5$0$0;
                            default:
                                CameraView$lambda$22$0$10$0$5$2$0 = OcrImportScreenKt.CameraView$lambda$22$0$10$0$5$2$0(lVar, (Uri) obj);
                                return CameraView$lambda$22$0$10$0$5$2$0;
                        }
                    }
                };
                qVar3.h0(L7);
            }
            j.j C = android.support.v4.media.session.b.C(cVar, (ho.l) L7, qVar3, i12);
            boolean h10 = qVar3.h(context2);
            Object L8 = qVar3.L();
            if (h10 || L8 == eVar3) {
                L8 = new OcrImportScreenKt$CameraView$1$1(context2, z0Var8, null);
                qVar3.h0(L8);
            }
            r.f((ho.p) L8, z.f31622a, qVar3);
            b1.h CameraView$lambda$9 = CameraView$lambda$9(z0Var8);
            h5.l CameraView$lambda$5 = CameraView$lambda$5(z0Var);
            boolean h11 = qVar3.h(i1Var) | qVar3.h(i0Var2) | qVar3.h(b0Var) | qVar3.h(kVar2);
            if (i20 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z21 = h11 | z11;
            Object L9 = qVar3.L();
            if (!z21 && L9 != eVar3) {
                lVar3 = CameraView$lambda$5;
                context = context2;
                i13 = i20;
                i0Var = i0Var2;
                z0Var2 = z0Var9;
                z0Var3 = z0Var;
                jVar = C;
                hVar = CameraView$lambda$9;
                kVar = kVar2;
                eVar = eVar3;
            } else {
                i0Var = i0Var2;
                hVar = CameraView$lambda$9;
                lVar3 = CameraView$lambda$5;
                i13 = i20;
                context = context2;
                z0 z0Var10 = z0Var;
                jVar = C;
                eVar = eVar3;
                L9 = new q(i1Var, i0Var, b0Var, kVar2, lVar, z0Var8, z0Var10, z0Var9, 0);
                z0Var2 = z0Var9;
                z0Var3 = z0Var10;
                kVar = kVar2;
                qVar3.h0(L9);
            }
            r.d(hVar, lVar3, (ho.l) L9, qVar3);
            g0.k CameraView$lambda$12 = CameraView$lambda$12(z0Var2);
            Boolean valueOf = Boolean.valueOf(CameraView$lambda$1(z0Var6));
            Object L10 = qVar3.L();
            if (L10 == eVar) {
                z0Var4 = z0Var6;
                L10 = new OcrImportScreenKt$CameraView$3$1(z0Var2, z0Var4, null);
                qVar3.h0(L10);
            } else {
                z0Var4 = z0Var6;
            }
            r.g(CameraView$lambda$12, valueOf, (ho.p) L10, qVar3);
            t1.z a10 = t1.b0.a(0, qVar3, 3);
            Object L11 = qVar3.L();
            if (L11 == eVar) {
                L11 = com.google.android.gms.internal.play_billing.b.t(0, qVar3);
            }
            x0 x0Var = (x0) L11;
            Integer valueOf2 = Integer.valueOf(ocrImportState.getImages().size());
            boolean h12 = qVar3.h(ocrImportState) | qVar3.f(a10);
            Object L12 = qVar3.L();
            if (h12 || L12 == eVar) {
                L12 = new OcrImportScreenKt$CameraView$4$1(ocrImportState, a10, x0Var, null);
                qVar3.h0(L12);
            }
            r.f((ho.p) L12, valueOf2, qVar3);
            i3.q qVar4 = i3.q.f13017a;
            i3.t d10 = p2.d(qVar4, 1.0f);
            r1.x a11 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar3, 0);
            int hashCode = Long.hashCode(qVar3.T);
            c3.o l4 = qVar3.l();
            i3.t c5 = i3.a.c(d10, qVar3);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar);
            } else {
                qVar3.k0();
            }
            h4.e eVar4 = h4.g.f11907f;
            r.J(eVar4, a11, qVar3);
            h4.e eVar5 = h4.g.f11906e;
            r.J(eVar5, l4, qVar3);
            Integer valueOf3 = Integer.valueOf(hashCode);
            h4.e eVar6 = h4.g.f11908g;
            r.y(qVar3, valueOf3, eVar6);
            h4.d dVar2 = h4.g.f11909h;
            r.F(dVar2, qVar3);
            h4.e eVar7 = h4.g.f11905d;
            r.J(eVar7, c5, qVar3);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i21 = ElevenLabsTheme.$stable;
            i3.t I = r1.d.I(qVar4, t2.u.P, elevenLabsTheme.getSpacings(qVar3, i21).m2356getX4D9Ej5fM(), t2.u.P, t2.u.P, 13);
            z0 z0Var11 = z0Var4;
            WeakHashMap weakHashMap = c3.f29142x;
            i0 i0Var3 = i0Var;
            z0 z0Var12 = z0Var3;
            i3.t P = r1.d.P(I, new o1(u0.e(qVar3).f29154l, 16));
            c1.k kVar3 = kVar;
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            i3.t c10 = m3.h.c(P.then(new m1(1.0f, true)), elevenLabsTheme.getShapes(qVar3, i21).getXl());
            i3.l lVar7 = i3.d.f12997a;
            f1 d11 = r1.p.d(lVar7, false);
            int hashCode2 = Long.hashCode(qVar3.T);
            c3.o l7 = qVar3.l();
            i3.t c11 = i3.a.c(c10, qVar3);
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar);
            } else {
                qVar3.k0();
            }
            r.J(eVar4, d11, qVar3);
            r.J(eVar5, l7, qVar3);
            defpackage.f.u(hashCode2, qVar3, eVar6, qVar3, dVar2);
            r.J(eVar7, c11, qVar3);
            Object L13 = qVar3.L();
            if (L13 == eVar) {
                L13 = r.A(Boolean.TRUE);
                qVar3.h0(L13);
            }
            z0 z0Var13 = (z0) L13;
            final u1 f14 = z1.f(Boolean.valueOf(CameraView$lambda$22$0$1(z0Var13)), "shutter", qVar3, 48);
            f9.e eVar8 = f14.f18411a;
            OcrImportScreenKt$CameraView$lambda$22$0$$inlined$animateFloat$1 ocrImportScreenKt$CameraView$lambda$22$0$$inlined$animateFloat$1 = new ho.q() { // from class: io.elevenlabs.ocr.OcrImportScreenKt$CameraView$lambda$22$0$$inlined$animateFloat$1
                public final e1 invoke(j1.p1 p1Var, u2.m mVar2, int i22) {
                    u2.q qVar5 = (u2.q) mVar2;
                    qVar5.X(-985243360);
                    e1 r10 = j1.e.r(t2.u.P, t2.u.P, 7, null);
                    qVar5.p(false);
                    return r10;
                }

                @Override // ho.q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((j1.p1) obj, (u2.m) obj2, ((Number) obj3).intValue());
                }
            };
            b2 b2Var = j1.e.f18214j;
            if (!f14.g()) {
                qVar3.X(1666573488);
                boolean f15 = qVar3.f(f14);
                j02 = qVar3.L();
                if (!f15 && j02 != eVar) {
                    eVar2 = eVar4;
                    dVar = dVar2;
                } else {
                    f13 = g3.t.f();
                    if (f13 != null) {
                        lVar6 = f13.e();
                    } else {
                        lVar6 = null;
                    }
                    dVar = dVar2;
                    j4 = g3.t.j(f13);
                    eVar2 = eVar4;
                    try {
                        Object j04 = eVar8.j0();
                        g3.t.m(f13, j4, lVar6);
                        qVar3.h0(j04);
                        j02 = j04;
                    } finally {
                    }
                }
                z12 = false;
                qVar3.p(false);
            } else {
                eVar2 = eVar4;
                dVar = dVar2;
                z12 = false;
                qVar3.X(1666827533);
                qVar3.p(false);
                j02 = eVar8.j0();
            }
            boolean booleanValue = ((Boolean) j02).booleanValue();
            qVar3.X(1674336167);
            if (booleanValue) {
                f10 = t2.u.P;
            } else {
                f10 = 1.0f;
            }
            qVar3.p(z12);
            Float valueOf4 = Float.valueOf(f10);
            boolean f16 = qVar3.f(f14);
            Object L14 = qVar3.L();
            if (f16 || L14 == eVar) {
                L14 = r.s(new ho.a() { // from class: io.elevenlabs.ocr.OcrImportScreenKt$CameraView$lambda$22$0$$inlined$animateFloat$2
                    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
                    @Override // ho.a
                    public final Boolean invoke() {
                        return u1.this.f18414d.getValue();
                    }
                });
                qVar3.h0(L14);
            }
            boolean booleanValue2 = ((Boolean) ((s2) L14).getValue()).booleanValue();
            qVar3.X(1674336167);
            if (booleanValue2) {
                f11 = t2.u.P;
            } else {
                f11 = 1.0f;
            }
            qVar3.p(false);
            Float valueOf5 = Float.valueOf(f11);
            boolean f17 = qVar3.f(f14);
            Object L15 = qVar3.L();
            if (f17 || L15 == eVar) {
                L15 = r.s(new ho.a() { // from class: io.elevenlabs.ocr.OcrImportScreenKt$CameraView$lambda$22$0$$inlined$animateFloat$3
                    @Override // ho.a
                    public final j1.p1 invoke() {
                        return u1.this.f();
                    }
                });
                qVar3.h0(L15);
            }
            h4.d dVar3 = dVar;
            h4.e eVar9 = eVar2;
            j1.r1 d12 = z1.d(f14, valueOf4, valueOf5, (j1.z) ocrImportScreenKt$CameraView$lambda$22$0$$inlined$animateFloat$1.invoke(((s2) L15).getValue(), (Object) qVar3, (Object) 0), b2Var, qVar3, 196608);
            OcrImportScreenKt$CameraView$lambda$22$0$$inlined$animateFloat$4 ocrImportScreenKt$CameraView$lambda$22$0$$inlined$animateFloat$4 = new ho.q() { // from class: io.elevenlabs.ocr.OcrImportScreenKt$CameraView$lambda$22$0$$inlined$animateFloat$4
                public final e1 invoke(j1.p1 p1Var, u2.m mVar2, int i22) {
                    u2.q qVar5 = (u2.q) mVar2;
                    qVar5.X(-985243360);
                    e1 r10 = j1.e.r(t2.u.P, t2.u.P, 7, null);
                    qVar5.p(false);
                    return r10;
                }

                @Override // ho.q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((j1.p1) obj, (u2.m) obj2, ((Number) obj3).intValue());
                }
            };
            if (!f14.g()) {
                qVar3.X(1666573488);
                boolean f18 = qVar3.f(f14);
                Object L16 = qVar3.L();
                if (f18 || L16 == eVar) {
                    f13 = g3.t.f();
                    if (f13 != null) {
                        lVar5 = f13.e();
                    } else {
                        lVar5 = null;
                    }
                    j4 = g3.t.j(f13);
                    try {
                        Object j05 = eVar8.j0();
                        g3.t.m(f13, j4, lVar6);
                        qVar3.h0(j05);
                        L16 = j05;
                    } finally {
                    }
                }
                qVar3.p(false);
                j03 = L16;
                z13 = false;
            } else {
                z13 = false;
                qVar3.X(1666827533);
                qVar3.p(false);
                j03 = eVar8.j0();
            }
            boolean booleanValue3 = ((Boolean) j03).booleanValue();
            qVar3.X(-643728398);
            float f19 = 0.6f;
            if (booleanValue3) {
                f12 = 1.0f;
            } else {
                f12 = 0.6f;
            }
            qVar3.p(z13);
            Float valueOf6 = Float.valueOf(f12);
            boolean f20 = qVar3.f(f14);
            Object L17 = qVar3.L();
            if (f20 || L17 == eVar) {
                L17 = r.s(new ho.a() { // from class: io.elevenlabs.ocr.OcrImportScreenKt$CameraView$lambda$22$0$$inlined$animateFloat$5
                    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
                    @Override // ho.a
                    public final Boolean invoke() {
                        return u1.this.f18414d.getValue();
                    }
                });
                qVar3.h0(L17);
            }
            boolean booleanValue4 = ((Boolean) ((s2) L17).getValue()).booleanValue();
            qVar3.X(-643728398);
            if (booleanValue4) {
                f19 = 1.0f;
            }
            qVar3.p(false);
            Float valueOf7 = Float.valueOf(f19);
            boolean f21 = qVar3.f(f14);
            Object L18 = qVar3.L();
            if (f21 || L18 == eVar) {
                L18 = r.s(new ho.a() { // from class: io.elevenlabs.ocr.OcrImportScreenKt$CameraView$lambda$22$0$$inlined$animateFloat$6
                    @Override // ho.a
                    public final j1.p1 invoke() {
                        return u1.this.f();
                    }
                });
                qVar3.h0(L18);
            }
            j1.r1 d13 = z1.d(f14, valueOf6, valueOf7, (j1.z) ocrImportScreenKt$CameraView$lambda$22$0$$inlined$animateFloat$4.invoke(((s2) L18).getValue(), (Object) qVar3, (Object) 0), b2Var, qVar3, 196608);
            boolean h13 = qVar3.h(kVar3);
            Object L19 = qVar3.L();
            if (h13 || L19 == eVar) {
                L19 = new y(kVar3, 4);
                qVar3.h0(L19);
            }
            ho.l lVar8 = (ho.l) L19;
            i3.t d14 = p2.d(qVar4, 1.0f);
            Object L20 = qVar3.L();
            if (L20 == eVar) {
                r62 = 1;
                L20 = new f(z0Var12, 1);
                qVar3.h0(L20);
            } else {
                r62 = 1;
            }
            k5.k.b(lVar8, f4.i0.q(d14, (ho.l) L20), null, qVar3, 48, 4);
            CameraHeader(aVar, c3.k.d(-1975050523, r62, new p(z0Var11, r62), qVar3), null, qVar3, ((i19 >> 6) & 14) | 48, 4);
            i3.t e10 = p2.e(qVar4, 1.0f);
            f1 d15 = r1.p.d(lVar7, false);
            int hashCode3 = Long.hashCode(qVar3.T);
            c3.o l10 = qVar3.l();
            i3.t c12 = i3.a.c(e10, qVar3);
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar);
            } else {
                qVar3.k0();
            }
            r.J(eVar9, d15, qVar3);
            r.J(eVar5, l10, qVar3);
            defpackage.f.u(hashCode3, qVar3, eVar6, qVar3, dVar3);
            r.J(eVar7, c12, qVar3);
            i3.t d16 = p2.d(qVar4, 1.0f);
            Uri selectedImage = ocrImportState.getSelectedImage();
            w0 w0Var = h0.f26395b;
            if (selectedImage != null) {
                z0Var5 = z0Var13;
                r1Var = d13;
                tVar = l1.n.h(qVar4, ReaderColors.INSTANCE.m2366getBlack0d7_KjU(), w0Var);
            } else {
                z0Var5 = z0Var13;
                r1Var = d13;
                tVar = qVar4;
            }
            i3.t then = d16.then(tVar);
            f1 d17 = r1.p.d(lVar7, false);
            int hashCode4 = Long.hashCode(qVar3.T);
            c3.o l11 = qVar3.l();
            i3.t c13 = i3.a.c(then, qVar3);
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar);
            } else {
                qVar3.k0();
            }
            r.J(eVar9, d17, qVar3);
            r.J(eVar5, l11, qVar3);
            defpackage.f.u(hashCode4, qVar3, eVar6, qVar3, dVar3);
            r.J(eVar7, c13, qVar3);
            Object L21 = qVar3.L();
            if (L21 == eVar) {
                L21 = r.A(null);
                qVar3.h0(L21);
            }
            z0 z0Var14 = (z0) L21;
            Uri selectedImage2 = ocrImportState.getSelectedImage();
            boolean h14 = qVar3.h(ocrImportState);
            Object L22 = qVar3.L();
            if (!h14 && L22 != eVar) {
                zVar = null;
            } else {
                zVar = null;
                L22 = new OcrImportScreenKt$CameraView$5$1$4$1$1$1(ocrImportState, z0Var14, null);
                qVar3.h0(L22);
            }
            r.f((ho.p) L22, selectedImage2, qVar3);
            if (ocrImportState.getSelectedImage() != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            u2.e eVar10 = eVar;
            e2.c(z14, null, y0.e(zVar, 3), y0.f(zVar, 3), null, c3.k.d(241267977, true, new defpackage.b(lVar, z0Var14, 4), qVar3), qVar3, 200064, 18);
            i3.t I2 = r1.d.I(p2.d(qVar4, 1.0f), t2.u.P, t2.u.P, t2.u.P, elevenLabsTheme.getSpacings(qVar3, i21).m2357getX5D9Ej5fM(), 7);
            r1.x a12 = r1.w.a(r1.j.f29231d, i3.d.C0, qVar3, 54);
            int hashCode5 = Long.hashCode(qVar3.T);
            c3.o l12 = qVar3.l();
            i3.t c14 = i3.a.c(I2, qVar3);
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar);
            } else {
                qVar3.k0();
            }
            r.J(eVar9, a12, qVar3);
            r.J(eVar5, l12, qVar3);
            defpackage.f.u(hashCode5, qVar3, eVar6, qVar3, dVar3);
            r.J(eVar7, c14, qVar3);
            List<Uri> images = ocrImportState.getImages();
            int i22 = i13;
            if (i22 == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            Object L23 = qVar3.L();
            if (!z15 && L23 != eVar10) {
                lVar4 = lVar;
            } else {
                final int i23 = 1;
                lVar4 = lVar;
                L23 = new ho.l() { // from class: io.elevenlabs.ocr.c
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        z CameraView$lambda$14$0;
                        z CameraView$lambda$22$0$10$0$5$0$0;
                        z CameraView$lambda$22$0$10$0$5$2$0;
                        switch (i23) {
                            case 0:
                                CameraView$lambda$14$0 = OcrImportScreenKt.CameraView$lambda$14$0(lVar4, (List) obj);
                                return CameraView$lambda$14$0;
                            case 1:
                                CameraView$lambda$22$0$10$0$5$0$0 = OcrImportScreenKt.CameraView$lambda$22$0$10$0$5$0$0(lVar4, ((Integer) obj).intValue());
                                return CameraView$lambda$22$0$10$0$5$0$0;
                            default:
                                CameraView$lambda$22$0$10$0$5$2$0 = OcrImportScreenKt.CameraView$lambda$22$0$10$0$5$2$0(lVar4, (Uri) obj);
                                return CameraView$lambda$22$0$10$0$5$2$0;
                        }
                    }
                };
                qVar3.h0(L23);
            }
            ho.l lVar9 = (ho.l) L23;
            if (i22 == 4) {
                z16 = true;
            } else {
                z16 = false;
            }
            Object L24 = qVar3.L();
            if (z16 || L24 == eVar10) {
                L24 = new d(lVar4, 0);
                qVar3.h0(L24);
            }
            ho.p pVar = (ho.p) L24;
            Uri selectedImage3 = ocrImportState.getSelectedImage();
            if (i22 == 4) {
                z17 = true;
            } else {
                z17 = false;
            }
            Object L25 = qVar3.L();
            if (!z17 && L25 != eVar10) {
                i14 = i22;
            } else {
                i14 = i22;
                final int i24 = 2;
                L25 = new ho.l() { // from class: io.elevenlabs.ocr.c
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        z CameraView$lambda$14$0;
                        z CameraView$lambda$22$0$10$0$5$0$0;
                        z CameraView$lambda$22$0$10$0$5$2$0;
                        switch (i24) {
                            case 0:
                                CameraView$lambda$14$0 = OcrImportScreenKt.CameraView$lambda$14$0(lVar4, (List) obj);
                                return CameraView$lambda$14$0;
                            case 1:
                                CameraView$lambda$22$0$10$0$5$0$0 = OcrImportScreenKt.CameraView$lambda$22$0$10$0$5$0$0(lVar4, ((Integer) obj).intValue());
                                return CameraView$lambda$22$0$10$0$5$0$0;
                            default:
                                CameraView$lambda$22$0$10$0$5$2$0 = OcrImportScreenKt.CameraView$lambda$22$0$10$0$5$2$0(lVar4, (Uri) obj);
                                return CameraView$lambda$22$0$10$0$5$2$0;
                        }
                    }
                };
                qVar3.h0(L25);
            }
            int i25 = i14;
            Thumbnails(images, lVar9, pVar, selectedImage3, (ho.l) L25, a10, qVar3, 0);
            Object L26 = qVar3.L();
            if (L26 == eVar10) {
                L26 = r.q(qVar3);
                qVar3.h0(L26);
            }
            d0 d0Var = (d0) L26;
            String R = kj.c.R(qVar3, R.string.ocr_accessibility_take_picture);
            i3.t c15 = m3.h.c(qVar4, elevenLabsTheme.getShapes(qVar3, i21).getFull());
            long d18 = ib.i.d(elevenLabsTheme, qVar3, i21);
            boolean h15 = qVar3.h(ocrImportState);
            if (i25 == 4) {
                z18 = true;
            } else {
                z18 = false;
            }
            Context context3 = context;
            boolean h16 = h15 | z18 | qVar3.h(d0Var) | qVar3.h(context3) | qVar3.h(i0Var3);
            Object L27 = qVar3.L();
            if (!h16 && L27 != eVar10) {
                i15 = i25;
                qVar2 = qVar3;
            } else {
                i15 = i25;
                qVar2 = qVar3;
                f3.b bVar = new f3.b(ocrImportState, lVar, d0Var, context3, i0Var3, z0Var5, 1);
                qVar2.h0(bVar);
                L27 = bVar;
            }
            u2.q qVar5 = qVar2;
            ButtonContainerKt.m1780ButtonContainer83mGB3Q(R, (ho.a) L27, c15, d18, false, 0, null, false, null, c3.k.d(-1414291257, true, new defpackage.b(ocrImportState, r1Var, 3), qVar2), qVar5, 805306368, 496);
            qVar5.p(true);
            r1.p.a(l1.n.h(h0.t(p2.d(qVar4, 1.0f), t2.u.P, t2.u.P, CameraView$lambda$22$0$4(d12), t2.u.P, t2.u.P, t2.u.P, null, 524283), ReaderColors.INSTANCE.m2366getBlack0d7_KjU(), w0Var), qVar5, 0);
            p.n.t(qVar5, true, true, true);
            i3.t e11 = p2.e(r1.d.P(r1.d.E(qVar4, elevenLabsTheme.getSpacings(qVar5, i21).m2357getX5D9Ej5fM()), new r1.i0(u0.e(qVar5).f29154l, new o1(u0.e(qVar5).f29154l, 16))), 1.0f);
            k2 a13 = i2.a(r1.j.f29234g, i3.d.f13005z0, qVar5, 54);
            int hashCode6 = Long.hashCode(qVar5.T);
            c3.o l13 = qVar5.l();
            i3.t c16 = i3.a.c(e11, qVar5);
            qVar5.b0();
            if (qVar5.S) {
                qVar5.k(fVar);
            } else {
                qVar5.k0();
            }
            r.J(eVar9, a13, qVar5);
            r.J(eVar5, l13, qVar5);
            defpackage.f.u(hashCode6, qVar5, eVar6, qVar5, dVar3);
            r.J(eVar7, c16, qVar5);
            int i26 = io.elevenlabs.ui.R.drawable.file_import;
            String R2 = kj.c.R(qVar5, R.string.ocr_accessibility_add_image_gallery);
            j.j jVar2 = jVar;
            boolean h17 = qVar5.h(jVar2);
            Object L28 = qVar5.L();
            if (h17 || L28 == eVar10) {
                L28 = new a(jVar2, 1);
                qVar5.h0(L28);
            }
            lVar2 = lVar;
            ocrImportState2 = ocrImportState;
            int i27 = i15;
            ButtonIconKt.ButtonIcon(i26, R2, (ho.a) L28, null, ButtonIconVariant.Secondary, null, false, false, false, qVar5, 24576, 488);
            qVar = qVar5;
            int i28 = io.elevenlabs.ui.R.drawable.listen;
            String R3 = kj.c.R(qVar, R.string.ocr_listen);
            ButtonVariant buttonVariant = ButtonVariant.Secondary;
            boolean isLoading = ocrImportState2.isLoading();
            boolean z22 = !ocrImportState2.getImages().isEmpty();
            ButtonSize buttonSize = ButtonSize.Medium;
            if (i27 == 4) {
                z19 = true;
            } else {
                z19 = false;
            }
            Object L29 = qVar.L();
            if (!z19 && L29 != eVar10) {
                z20 = true;
            } else {
                z20 = true;
                L29 = new h(lVar2, 1);
                qVar.h0(L29);
            }
            ButtonKt.Button(R3, (ho.a) L29, null, buttonSize, buttonVariant, Integer.valueOf(i28), null, isLoading, z22, false, qVar, 27648, 580);
            qVar.p(z20);
            qVar.p(z20);
        } else {
            lVar2 = lVar;
            ocrImportState2 = ocrImportState;
            qVar = qVar3;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new l(lVar2, ocrImportState2, aVar, i10);
        }
    }

    public static final boolean CameraView$lambda$1(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final g0.k CameraView$lambda$12(z0 z0Var) {
        return (g0.k) z0Var.getValue();
    }

    public static final z CameraView$lambda$14$0(ho.l lVar, List list) {
        list.getClass();
        lVar.invoke(new k(list, 0));
        return z.f31622a;
    }

    public static final z CameraView$lambda$14$0$0(List list, OcrImportViewModel ocrImportViewModel) {
        ocrImportViewModel.getClass();
        ocrImportViewModel.onPicturesSaved(list);
        return z.f31622a;
    }

    /* JADX WARN: Type inference failed for: r13v9, types: [g0.k1, java.lang.Object] */
    public static final u2.h0 CameraView$lambda$16$0(g0.u0 u0Var, i0 i0Var, b0 b0Var, c1.k kVar, ho.l lVar, final z0 z0Var, z0 z0Var2, final z0 z0Var3, u2.i0 i0Var2) {
        k1 k1Var;
        i0Var2.getClass();
        b1.h CameraView$lambda$9 = CameraView$lambda$9(z0Var);
        if (CameraView$lambda$9 != null) {
            CameraView$lambda$9.f4143a.e();
            h5.l CameraView$lambda$5 = CameraView$lambda$5(z0Var2);
            if (CameraView$lambda$5 != null) {
                long j4 = CameraView$lambda$5.f12092a;
                Rational rational = new Rational((int) (j4 >> 32), (int) (j4 & 4294967295L));
                ?? obj = new Object();
                obj.f10118a = 1;
                obj.f10119b = rational;
                obj.f10120c = 0;
                obj.f10121d = 0;
                k1Var = obj;
            } else {
                k1Var = null;
            }
            j1 j1Var = new j1();
            ArrayList arrayList = j1Var.f10116b;
            arrayList.add(u0Var);
            arrayList.add(i0Var);
            if (k1Var != null) {
                j1Var.f10115a = k1Var;
            }
            kj.c.n(!arrayList.isEmpty(), "UseCase must not be empty.");
            ArrayList arrayList2 = j1Var.f10117c;
            Iterator it = arrayList2.iterator();
            if (!it.hasNext()) {
                a5.a aVar = new a5.a(j1Var.f10115a, arrayList, arrayList2, 22);
                g0.q qVar = g0.q.f10133c;
                qVar.getClass();
                if (!hasCameraSafe(CameraView$lambda$9, qVar)) {
                    qVar = g0.q.f10132b;
                }
                qVar.getClass();
                try {
                    z0Var3.setValue(CameraView$lambda$9.a(b0Var, qVar, aVar));
                    u0Var.D(kVar.getSurfaceProvider());
                } catch (IllegalArgumentException e10) {
                    lVar.invoke(new y(e10, 3));
                    z0Var3.setValue(null);
                }
            } else {
                throw j0.c.g(it);
            }
        }
        return new u2.h0() { // from class: io.elevenlabs.ocr.OcrImportScreenKt$CameraView$lambda$16$0$$inlined$onDispose$1
            @Override // u2.h0
            public void dispose() {
                b1.h CameraView$lambda$92;
                CameraView$lambda$92 = OcrImportScreenKt.CameraView$lambda$9(z0.this);
                if (CameraView$lambda$92 != null) {
                    CameraView$lambda$92.f4143a.e();
                }
                z0Var3.setValue(null);
            }
        };
    }

    public static final z CameraView$lambda$16$0$1(IllegalArgumentException illegalArgumentException, OcrImportViewModel ocrImportViewModel) {
        ocrImportViewModel.getClass();
        ocrImportViewModel.onCameraBindError(illegalArgumentException);
        return z.f31622a;
    }

    public static final int CameraView$lambda$19(x0 x0Var) {
        return ((u2.f1) x0Var).h();
    }

    private static final void CameraView$lambda$2(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final void CameraView$lambda$20(x0 x0Var, int i10) {
        ((u2.f1) x0Var).i(i10);
    }

    private static final boolean CameraView$lambda$22$0$1(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final Uri CameraView$lambda$22$0$10$0$1(z0 z0Var) {
        return (Uri) z0Var.getValue();
    }

    public static final z CameraView$lambda$22$0$10$0$4(ho.l lVar, z0 z0Var, g0 g0Var, u2.m mVar, int i10) {
        g0Var.getClass();
        i3.q qVar = i3.q.f13017a;
        i3.t d10 = p2.d(qVar, 1.0f);
        f1 d11 = r1.p.d(i3.d.f12997a, false);
        u2.q qVar2 = (u2.q) mVar;
        int hashCode = Long.hashCode(qVar2.T);
        c3.o l4 = qVar2.l();
        i3.t c5 = i3.a.c(d10, mVar);
        h4.h.f11920i.getClass();
        h4.f fVar = h4.g.f11903b;
        f2 f2Var = qVar2.f33969a;
        qVar2.b0();
        if (qVar2.S) {
            qVar2.k(fVar);
        } else {
            qVar2.k0();
        }
        r.J(h4.g.f11907f, d11, mVar);
        r.J(h4.g.f11906e, l4, mVar);
        r.y(mVar, Integer.valueOf(hashCode), h4.g.f11908g);
        r.F(h4.g.f11909h, mVar);
        r.J(h4.g.f11905d, c5, mVar);
        h5.c cVar = (h5.c) qVar2.j(i4.j1.f13129h);
        ad.h hVar = new ad.h((Context) qVar2.j(AndroidCompositionLocals_androidKt.f2291b));
        hVar.f1788c = CameraView$lambda$22$0$10$0$1(z0Var);
        hVar.b();
        qVar2.X(2005631789);
        ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
        int i11 = ElevenLabsTheme.$stable;
        float d02 = cVar.d0(elevenLabsTheme.getSpacings(mVar, i11).m2356getX4D9Ej5fM());
        qVar2.p(false);
        hVar.f1793h = x7.e.U(tn.n.d1(new dd.c[]{new dd.b(d02)}));
        ad.i a10 = hVar.a();
        i3.t j4 = l1.n.j(2, ReaderColors.INSTANCE.m2466getWhite0d7_KjU(), p2.d(qVar, 1.0f), elevenLabsTheme.getShapes(mVar, i11).getXl());
        boolean f10 = qVar2.f(lVar);
        Object L = qVar2.L();
        u2.e eVar = u2.l.f33918a;
        if (f10 || L == eVar) {
            L = new h(lVar, 2);
            qVar2.h0(L);
        }
        qc.m.b(a10, null, l1.n.p(j4, false, null, null, null, (ho.a) L, 15), null, f4.q.f8840c, null, mVar, 1572912, 4024);
        boolean f11 = qVar2.f(lVar);
        Object L2 = qVar2.L();
        if (f11 || L2 == eVar) {
            L2 = new h(lVar, 3);
            qVar2.h0(L2);
        }
        CameraHeader((ho.a) L2, null, c3.k.d(-1166142566, true, new p(lVar, 0), mVar), mVar, 384, 2);
        qVar2.p(true);
        return z.f31622a;
    }

    public static final z CameraView$lambda$22$0$10$0$4$0$1$0(ho.l lVar) {
        lVar.invoke(new x(3));
        return z.f31622a;
    }

    public static final z CameraView$lambda$22$0$10$0$4$0$1$0$0(OcrImportViewModel ocrImportViewModel) {
        ocrImportViewModel.getClass();
        ocrImportViewModel.onPictureClose();
        return z.f31622a;
    }

    public static final z CameraView$lambda$22$0$10$0$4$0$2$0(ho.l lVar) {
        lVar.invoke(new x(5));
        return z.f31622a;
    }

    public static final z CameraView$lambda$22$0$10$0$4$0$2$0$0(OcrImportViewModel ocrImportViewModel) {
        ocrImportViewModel.getClass();
        ocrImportViewModel.onPictureClose();
        return z.f31622a;
    }

    public static final z CameraView$lambda$22$0$10$0$4$0$3(ho.l lVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            int i11 = io.elevenlabs.ui.R.drawable.trash;
            String R = kj.c.R(qVar, R.string.ocr_accessibility_remove_image);
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new h(lVar, 0);
                qVar.h0(L);
            }
            ButtonIconKt.ButtonIcon(i11, R, (ho.a) L, null, ButtonIconVariant.Transparent, null, false, false, false, qVar, 24576, 488);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z CameraView$lambda$22$0$10$0$4$0$3$0$0(ho.l lVar) {
        lVar.invoke(new x(13));
        return z.f31622a;
    }

    public static final z CameraView$lambda$22$0$10$0$4$0$3$0$0$0(OcrImportViewModel ocrImportViewModel) {
        ocrImportViewModel.getClass();
        ocrImportViewModel.onPictureRemove();
        return z.f31622a;
    }

    public static final z CameraView$lambda$22$0$10$0$5$0$0(ho.l lVar, int i10) {
        lVar.invoke(new io.elevenlabs.highlighter.t(i10, 1));
        return z.f31622a;
    }

    public static final z CameraView$lambda$22$0$10$0$5$0$0$0(int i10, OcrImportViewModel ocrImportViewModel) {
        ocrImportViewModel.getClass();
        ocrImportViewModel.onDragStarted(i10);
        return z.f31622a;
    }

    public static final z CameraView$lambda$22$0$10$0$5$1$0(ho.l lVar, final int i10, final int i11) {
        lVar.invoke(new ho.l() { // from class: io.elevenlabs.ocr.i
            @Override // ho.l
            public final Object invoke(Object obj) {
                z CameraView$lambda$22$0$10$0$5$1$0$0;
                CameraView$lambda$22$0$10$0$5$1$0$0 = OcrImportScreenKt.CameraView$lambda$22$0$10$0$5$1$0$0(i10, i11, (OcrImportViewModel) obj);
                return CameraView$lambda$22$0$10$0$5$1$0$0;
            }
        });
        return z.f31622a;
    }

    public static final z CameraView$lambda$22$0$10$0$5$1$0$0(int i10, int i11, OcrImportViewModel ocrImportViewModel) {
        ocrImportViewModel.getClass();
        ocrImportViewModel.onImageSwap(i10, i11);
        return z.f31622a;
    }

    public static final z CameraView$lambda$22$0$10$0$5$2$0(ho.l lVar, Uri uri) {
        uri.getClass();
        lVar.invoke(new m(uri, 0));
        return z.f31622a;
    }

    public static final z CameraView$lambda$22$0$10$0$5$2$0$0(Uri uri, OcrImportViewModel ocrImportViewModel) {
        ocrImportViewModel.getClass();
        ocrImportViewModel.onPictureClick(uri);
        return z.f31622a;
    }

    public static final z CameraView$lambda$22$0$10$0$5$3$0(OcrImportState ocrImportState, ho.l lVar, d0 d0Var, Context context, i0 i0Var, z0 z0Var) {
        if (ocrImportState.getSelectedImage() != null) {
            lVar.invoke(new x(11));
        } else {
            fr.g0.D(d0Var, null, null, new OcrImportScreenKt$CameraView$5$1$4$1$3$4$1$2(context, i0Var, lVar, z0Var, null), 3);
        }
        return z.f31622a;
    }

    public static final z CameraView$lambda$22$0$10$0$5$3$0$0(OcrImportViewModel ocrImportViewModel) {
        ocrImportViewModel.getClass();
        ocrImportViewModel.onPictureClose();
        return z.f31622a;
    }

    public static final z CameraView$lambda$22$0$10$0$5$4(OcrImportState ocrImportState, s2 s2Var, r1.s sVar, u2.m mVar, int i10) {
        boolean z6;
        float f10;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            u3.c M = kd.a.M(R.drawable.shutter, qVar, 0);
            Uri selectedImage = ocrImportState.getSelectedImage();
            float f11 = t2.u.P;
            if (selectedImage == null) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            i3.q qVar2 = i3.q.f13017a;
            i3.t a10 = m3.h.a(qVar2, f10);
            float CameraView$lambda$22$0$6 = CameraView$lambda$22$0$6(s2Var);
            i3.t j4 = m3.h.j(a10, CameraView$lambda$22$0$6, CameraView$lambda$22$0$6);
            int i11 = u3.c.$stable | 48;
            l1.n.c(M, null, j4, null, null, t2.u.P, null, qVar, i11, 120);
            u3.c M2 = kd.a.M(R.drawable.shutter_plus, qVar, 0);
            if (ocrImportState.getSelectedImage() != null) {
                f11 = 1.0f;
            }
            l1.n.c(M2, null, m3.h.a(qVar2, f11), null, null, t2.u.P, null, qVar, i11, 120);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final void CameraView$lambda$22$0$2(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    private static final float CameraView$lambda$22$0$4(s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    private static final float CameraView$lambda$22$0$6(s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final c1.k CameraView$lambda$22$0$7$0(c1.k kVar, Context context) {
        context.getClass();
        return kVar;
    }

    public static final z CameraView$lambda$22$0$8$0(z0 z0Var, h5.l lVar) {
        z0Var.setValue(lVar);
        return z.f31622a;
    }

    public static final z CameraView$lambda$22$0$9(z0 z0Var, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        int i11;
        String R;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            if (CameraView$lambda$1(z0Var)) {
                i11 = io.elevenlabs.ui.R.drawable.flash;
            } else {
                i11 = io.elevenlabs.ui.R.drawable.flash_off;
            }
            int i12 = i11;
            if (CameraView$lambda$1(z0Var)) {
                qVar.X(-1972929259);
                R = kj.c.R(qVar, R.string.ocr_accessibility_torch_disable);
                qVar.p(false);
            } else {
                qVar.X(-1972820170);
                R = kj.c.R(qVar, R.string.ocr_accessibility_torch_enable);
                qVar.p(false);
            }
            String str = R;
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new a(z0Var, 2);
                qVar.h0(L);
            }
            ButtonIconKt.ButtonIcon(i12, str, (ho.a) L, null, ButtonIconVariant.TransparentInverted, null, false, false, false, qVar, 24960, 488);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z CameraView$lambda$22$0$9$0$0(z0 z0Var) {
        CameraView$lambda$2(z0Var, !CameraView$lambda$1(z0Var));
        return z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r5 >= 2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r0 >= 2) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r4 >= 2) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, m.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final z CameraView$lambda$22$1$0$0(j.j jVar) {
        int pickImagesMaxLimit;
        int extensionVersion;
        int extensionVersion2;
        int extensionVersion3;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33) {
            if (i10 >= 30) {
                extensionVersion3 = SdkExtensions.getExtensionVersion(30);
            }
            pickImagesMaxLimit = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            if (i10 < 33) {
                if (i10 >= 30) {
                    extensionVersion2 = SdkExtensions.getExtensionVersion(30);
                }
                ?? obj = new Object();
                obj.f22094a = n.e.f23564a;
                if (i10 < 33) {
                    if (i10 >= 30) {
                        extensionVersion = SdkExtensions.getExtensionVersion(30);
                    }
                    obj.f22094a = n.f.f23565a;
                    obj.f22095b = pickImagesMaxLimit;
                    obj.f22096c = n.d.f23563a;
                    jVar.a(obj);
                    return z.f31622a;
                }
                MediaStore.getPickImagesMaxLimit();
                obj.f22094a = n.f.f23565a;
                obj.f22095b = pickImagesMaxLimit;
                obj.f22096c = n.d.f23563a;
                jVar.a(obj);
                return z.f31622a;
            }
            MediaStore.getPickImagesMaxLimit();
            ?? obj2 = new Object();
            obj2.f22094a = n.e.f23564a;
            if (i10 < 33) {
            }
            MediaStore.getPickImagesMaxLimit();
            obj2.f22094a = n.f.f23565a;
            obj2.f22095b = pickImagesMaxLimit;
            obj2.f22096c = n.d.f23563a;
            jVar.a(obj2);
            return z.f31622a;
        }
        pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
        if (i10 < 33) {
        }
        MediaStore.getPickImagesMaxLimit();
        ?? obj22 = new Object();
        obj22.f22094a = n.e.f23564a;
        if (i10 < 33) {
        }
        MediaStore.getPickImagesMaxLimit();
        obj22.f22094a = n.f.f23565a;
        obj22.f22095b = pickImagesMaxLimit;
        obj22.f22096c = n.d.f23563a;
        jVar.a(obj22);
        return z.f31622a;
    }

    public static final z CameraView$lambda$22$1$1$0(ho.l lVar) {
        lVar.invoke(new x(7));
        return z.f31622a;
    }

    public static final z CameraView$lambda$22$1$1$0$0(OcrImportViewModel ocrImportViewModel) {
        ocrImportViewModel.getClass();
        ocrImportViewModel.listen();
        return z.f31622a;
    }

    public static final z CameraView$lambda$23(ho.l lVar, OcrImportState ocrImportState, ho.a aVar, int i10, u2.m mVar, int i11) {
        CameraView(lVar, ocrImportState, aVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final h5.l CameraView$lambda$5(z0 z0Var) {
        return (h5.l) z0Var.getValue();
    }

    public static final b1.h CameraView$lambda$9(z0 z0Var) {
        return (b1.h) z0Var.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OcrImportScreen(List<String> list, ho.l lVar, ho.a aVar, boolean z6, ho.l lVar2, OcrImportViewModel ocrImportViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        ho.l lVar3;
        int i13;
        OcrImportViewModel ocrImportViewModel2;
        boolean z10;
        u2.q qVar;
        ho.l lVar4;
        OcrImportViewModel ocrImportViewModel3;
        r1 r10;
        u2.e eVar;
        int i14;
        u2.q qVar2;
        int i15;
        OcrImportViewModel ocrImportViewModel4;
        q7.c cVar;
        boolean z11;
        boolean z12;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        list.getClass();
        lVar.getClass();
        aVar.getClass();
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(-220511808);
        if ((i10 & 6) == 0) {
            if (qVar3.h(list)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar3.h(lVar)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i10 & 384) == 0) {
            if (qVar3.h(aVar)) {
                i18 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        if ((i10 & 3072) == 0) {
            if (qVar3.g(z6)) {
                i17 = 2048;
            } else {
                i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i17;
        }
        int i21 = i11 & 16;
        if (i21 != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            lVar3 = lVar2;
            if (qVar3.h(lVar3)) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i13;
            if ((196608 & i10) != 0) {
                if ((i11 & 32) == 0) {
                    ocrImportViewModel2 = ocrImportViewModel;
                    if (qVar3.h(ocrImportViewModel2)) {
                        i16 = 131072;
                        i12 |= i16;
                    }
                } else {
                    ocrImportViewModel2 = ocrImportViewModel;
                }
                i16 = 65536;
                i12 |= i16;
            } else {
                ocrImportViewModel2 = ocrImportViewModel;
            }
            boolean z13 = true;
            if ((74899 & i12) == 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!qVar3.O(i12 & 1, z10)) {
                qVar3.T();
                int i22 = i10 & 1;
                u2.e eVar2 = u2.l.f33918a;
                if (i22 != 0 && !qVar3.y()) {
                    qVar3.R();
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                    }
                    lVar4 = lVar3;
                    eVar = eVar2;
                    i14 = 0;
                    i15 = i12;
                    ocrImportViewModel4 = ocrImportViewModel2;
                    qVar2 = qVar3;
                } else {
                    if (i21 != 0) {
                        Object L = qVar3.L();
                        if (L == eVar2) {
                            L = new x(9);
                            qVar3.h0(L);
                        }
                        lVar4 = (ho.l) L;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i11 & 32) != 0) {
                        androidx.lifecycle.r1 a10 = r7.a.a(qVar3);
                        if (a10 != null) {
                            qVar2 = qVar3;
                            pl.f o6 = tb.a.o(a10, qVar2);
                            if (a10 instanceof androidx.lifecycle.o) {
                                cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                            } else {
                                cVar = q7.a.f28123b;
                            }
                            eVar = eVar2;
                            i14 = 0;
                            i15 = i12 & (-458753);
                            ocrImportViewModel4 = (OcrImportViewModel) gg.b.j0(e0.f20562a.b(OcrImportViewModel.class), a10, null, o6, cVar, qVar2);
                        } else {
                            c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                    } else {
                        eVar = eVar2;
                        i14 = 0;
                        qVar2 = qVar3;
                        i15 = i12;
                        ocrImportViewModel4 = ocrImportViewModel2;
                    }
                }
                qVar2.q();
                boolean h10 = qVar2.h(list) | qVar2.h(ocrImportViewModel4);
                Object L2 = qVar2.L();
                if (h10 || L2 == eVar) {
                    L2 = new OcrImportScreenKt$OcrImportScreen$2$1(list, ocrImportViewModel4, null);
                    qVar2.h0(L2);
                }
                r.f((ho.p) L2, list, qVar2);
                z0 o10 = r.o(ocrImportViewModel4.getStateFlow(), qVar2, i14);
                String[] strArr = {"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};
                Object L3 = qVar2.L();
                if (L3 == eVar) {
                    L3 = new x(10);
                    qVar2.h0(L3);
                }
                u2.q qVar4 = qVar2;
                int i23 = i15;
                Boolean rememberPermissionsGranted = ComposeExtensionsKt.rememberPermissionsGranted(strArr, (ho.l) L3, null, qVar4, 48, 4);
                qVar = qVar4;
                boolean f10 = qVar.f(rememberPermissionsGranted) | qVar.h(ocrImportViewModel4);
                Object L4 = qVar.L();
                if (f10 || L4 == eVar) {
                    L4 = new OcrImportScreenKt$OcrImportScreen$3$1(rememberPermissionsGranted, ocrImportViewModel4, null);
                    qVar.h0(L4);
                }
                r.f((ho.p) L4, rememberPermissionsGranted, qVar);
                Boolean valueOf = Boolean.valueOf(z6);
                boolean h11 = qVar.h(ocrImportViewModel4);
                if ((i23 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z14 = h11 | z11;
                Object L5 = qVar.L();
                if (z14 || L5 == eVar) {
                    L5 = new OcrImportScreenKt$OcrImportScreen$4$1(ocrImportViewModel4, z6, null);
                    qVar.h0(L5);
                }
                r.f((ho.p) L5, valueOf, qVar);
                ReadMeta navigateToRead = OcrImportScreen$lambda$2(o10).getNavigateToRead();
                boolean f11 = qVar.f(o10);
                if ((i23 & 112) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z15 = f11 | z12;
                Object L6 = qVar.L();
                if (z15 || L6 == eVar) {
                    L6 = new OcrImportScreenKt$OcrImportScreen$5$1(lVar, o10, null);
                    qVar.h0(L6);
                }
                r.f((ho.p) L6, navigateToRead, qVar);
                LimitReachedData navigateToAddPodcastLimitReached = OcrImportScreen$lambda$2(o10).getNavigateToAddPodcastLimitReached();
                boolean f12 = qVar.f(o10);
                if ((57344 & i23) != 16384) {
                    z13 = false;
                }
                boolean h12 = f12 | z13 | qVar.h(ocrImportViewModel4);
                Object L7 = qVar.L();
                if (h12 || L7 == eVar) {
                    L7 = new OcrImportScreenKt$OcrImportScreen$6$1(lVar4, ocrImportViewModel4, o10, null);
                    qVar.h0(L7);
                }
                r.f((ho.p) L7, navigateToAddPodcastLimitReached, qVar);
                OcrImportState OcrImportScreen$lambda$2 = OcrImportScreen$lambda$2(o10);
                boolean h13 = qVar.h(ocrImportViewModel4);
                Object L8 = qVar.L();
                if (h13 || L8 == eVar) {
                    L8 = new n(0, ocrImportViewModel4);
                    qVar.h0(L8);
                }
                OcrImportScreenUI(OcrImportScreen$lambda$2, (ho.l) L8, aVar, qVar, i23 & 896);
                ocrImportViewModel3 = ocrImportViewModel4;
            } else {
                qVar = qVar3;
                qVar.R();
                lVar4 = lVar3;
                ocrImportViewModel3 = ocrImportViewModel2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new o(list, lVar, aVar, z6, lVar4, ocrImportViewModel3, i10, i11);
                return;
            }
            return;
        }
        lVar3 = lVar2;
        if ((196608 & i10) != 0) {
        }
        boolean z132 = true;
        if ((74899 & i12) == 74898) {
        }
        if (!qVar3.O(i12 & 1, z10)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z OcrImportScreen$lambda$0$0(LimitReachedData limitReachedData) {
        limitReachedData.getClass();
        return z.f31622a;
    }

    public static final OcrImportState OcrImportScreen$lambda$2(s2 s2Var) {
        return (OcrImportState) s2Var.getValue();
    }

    public static final boolean OcrImportScreen$lambda$3$0(Context context) {
        context.getClass();
        if (hasPermission(context, "android.permission.CAMERA") && hasWriteImagePermissions(context)) {
            return true;
        }
        return false;
    }

    public static final z OcrImportScreen$lambda$8$0(OcrImportViewModel ocrImportViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(ocrImportViewModel);
        return z.f31622a;
    }

    public static final z OcrImportScreen$lambda$9(List list, ho.l lVar, ho.a aVar, boolean z6, ho.l lVar2, OcrImportViewModel ocrImportViewModel, int i10, int i11, u2.m mVar, int i12) {
        OcrImportScreen(list, lVar, aVar, z6, lVar2, ocrImportViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    private static final void OcrImportScreenUI(OcrImportState ocrImportState, ho.l lVar, ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        u2.q qVar;
        int i12;
        int i13;
        int i14;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(1025841196);
        if ((i10 & 6) == 0) {
            if (qVar2.h(ocrImportState)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(lVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(aVar)) {
                i12 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            qVar = qVar2;
            k5.a(null, null, null, null, null, 0, ReaderColors.INSTANCE.m2366getBlack0d7_KjU(), 0L, new m0(0), c3.k.d(799367419, true, new fm.o(ocrImportState, lVar, aVar, 1), qVar2), qVar, 805306368, 191);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new l(ocrImportState, lVar, aVar, i10);
        }
    }

    public static final z OcrImportScreenUI$lambda$0(OcrImportState ocrImportState, ho.l lVar, ho.a aVar, r1.z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        z1Var.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(z1Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            i3.l lVar2 = i3.d.f12997a;
            f1 d10 = r1.p.d(lVar2, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.q qVar2 = i3.q.f13017a;
            i3.t c5 = i3.a.c(qVar2, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            r.J(eVar, d10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            r.J(eVar4, c5, qVar);
            i3.t o6 = r1.d.o(r1.d.D(qVar2, z1Var), z1Var);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(o6, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar, a10, qVar);
            r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            r.J(eVar4, c10, qVar);
            Boolean permissionGranted = ocrImportState.getPermissionGranted();
            if (kotlin.jvm.internal.m.c(permissionGranted, Boolean.TRUE)) {
                qVar.X(1218542274);
                CameraView(lVar, ocrImportState, aVar, qVar, 0);
                qVar.p(false);
            } else if (kotlin.jvm.internal.m.c(permissionGranted, Boolean.FALSE)) {
                qVar.X(1218545079);
                i3.t d11 = p2.d(qVar2, 1.0f);
                f1 d12 = r1.p.d(lVar2, false);
                int hashCode3 = Long.hashCode(qVar.T);
                c3.o l10 = qVar.l();
                i3.t c11 = i3.a.c(d11, qVar);
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(eVar, d12, qVar);
                r.J(eVar2, l10, qVar);
                defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
                r.J(eVar4, c11, qVar);
                WeakHashMap weakHashMap = c3.f29142x;
                ErrorScreenKt.m1836ErrorScreenV9fs2A(r1.d.P(qVar2, u0.e(qVar).f29154l), null, kj.c.R(qVar, R.string.ocr_camera_permission_required), ComposableSingletons$OcrImportScreenKt.INSTANCE.getLambda$1760686258$ocr_release(), null, 0L, qVar, 3072, 50);
                CameraHeader(aVar, null, null, qVar, 0, 6);
                qVar.p(true);
                qVar.p(false);
            } else if (permissionGranted == null) {
                qVar.X(1218569603);
                qVar.p(false);
            } else {
                throw com.google.android.gms.internal.play_billing.b.h(1218541225, qVar, false);
            }
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z OcrImportScreenUI$lambda$1(OcrImportState ocrImportState, ho.l lVar, ho.a aVar, int i10, u2.m mVar, int i11) {
        OcrImportScreenUI(ocrImportState, lVar, aVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_OcrImportScreen_Idle(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2137448327);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            OcrImportState ocrImportState = new OcrImportState(null, null, null, false, null, null, false, 127, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new x(4);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new g(0);
                qVar.h0(L2);
            }
            OcrImportScreenUI(ocrImportState, lVar, (ho.a) L2, qVar, 432);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.highlighter.y(i10, 8);
        }
    }

    public static final z Preview_OcrImportScreen_Idle$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_OcrImportScreen_Idle$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_OcrImportScreen_Idle(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_OcrImportScreen_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1810550107);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Boolean bool = Boolean.TRUE;
            List I = ig.f.I("content://a", "content://b", "content://c");
            ArrayList arrayList = new ArrayList(tn.p.a0(I, 10));
            Iterator it = I.iterator();
            while (it.hasNext()) {
                arrayList.add(Uri.parse((String) it.next()));
            }
            OcrImportState ocrImportState = new OcrImportState(bool, arrayList, null, true, null, null, false, 116, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new x(14);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new g(4);
                qVar.h0(L2);
            }
            OcrImportScreenUI(ocrImportState, lVar, (ho.a) L2, qVar, 432);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.highlighter.y(i10, 12);
        }
    }

    public static final z Preview_OcrImportScreen_Loading$lambda$1$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_OcrImportScreen_Loading$lambda$3(int i10, u2.m mVar, int i11) {
        Preview_OcrImportScreen_Loading(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_OcrImportScreen_PermissionsGranted(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(494012682);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            OcrImportState ocrImportState = new OcrImportState(Boolean.TRUE, null, null, false, null, null, false, 126, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new x(6);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new g(1);
                qVar.h0(L2);
            }
            OcrImportScreenUI(ocrImportState, lVar, (ho.a) L2, qVar, 432);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.highlighter.y(i10, 9);
        }
    }

    public static final z Preview_OcrImportScreen_PermissionsGranted$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_OcrImportScreen_PermissionsGranted$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_OcrImportScreen_PermissionsGranted(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_OcrImportScreen_PermissionsNotGranted(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-64920011);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            OcrImportState ocrImportState = new OcrImportState(Boolean.FALSE, null, null, false, null, null, false, 126, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new x(15);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new g(5);
                qVar.h0(L2);
            }
            OcrImportScreenUI(ocrImportState, lVar, (ho.a) L2, qVar, 432);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.highlighter.y(i10, 13);
        }
    }

    public static final z Preview_OcrImportScreen_PermissionsNotGranted$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_OcrImportScreen_PermissionsNotGranted$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_OcrImportScreen_PermissionsNotGranted(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_OcrImportScreen_WithImages(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-396321327);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Boolean bool = Boolean.TRUE;
            List I = ig.f.I("content://a", "content://b", "content://c");
            ArrayList arrayList = new ArrayList(tn.p.a0(I, 10));
            Iterator it = I.iterator();
            while (it.hasNext()) {
                arrayList.add(Uri.parse((String) it.next()));
            }
            OcrImportState ocrImportState = new OcrImportState(bool, arrayList, null, false, null, null, false, 124, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new x(12);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new g(3);
                qVar.h0(L2);
            }
            OcrImportScreenUI(ocrImportState, lVar, (ho.a) L2, qVar, 432);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.highlighter.y(i10, 11);
        }
    }

    public static final z Preview_OcrImportScreen_WithImages$lambda$1$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_OcrImportScreen_WithImages$lambda$3(int i10, u2.m mVar, int i11) {
        Preview_OcrImportScreen_WithImages(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_OcrImportScreen_WithImages_Selected(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1271138277);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Boolean bool = Boolean.TRUE;
            List I = ig.f.I("content://a", "content://b", "content://c");
            ArrayList arrayList = new ArrayList(tn.p.a0(I, 10));
            Iterator it = I.iterator();
            while (it.hasNext()) {
                arrayList.add(Uri.parse((String) it.next()));
            }
            OcrImportState ocrImportState = new OcrImportState(bool, arrayList, Uri.parse("content://b"), false, null, null, false, 120, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new x(8);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new g(2);
                qVar.h0(L2);
            }
            OcrImportScreenUI(ocrImportState, lVar, (ho.a) L2, qVar, 432);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.highlighter.y(i10, 10);
        }
    }

    public static final z Preview_OcrImportScreen_WithImages_Selected$lambda$1$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_OcrImportScreen_WithImages_Selected$lambda$3(int i10, u2.m mVar, int i11) {
        Preview_OcrImportScreen_WithImages_Selected(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_Thumbnails(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1472864822);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                List I = ig.f.I("content://a", "content://b", "content://c", "content://d");
                ArrayList arrayList = new ArrayList(tn.p.a0(I, 10));
                Iterator it = I.iterator();
                while (it.hasNext()) {
                    arrayList.add(Uri.parse((String) it.next()));
                }
                L = r.A(arrayList);
                qVar.h0(L);
            }
            z0 z0Var = (z0) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = r.A(null);
                qVar.h0(L2);
            }
            z0 z0Var2 = (z0) L2;
            i3.t f10 = ib.i.f(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable, p2.e(i3.q.f13017a, 1.0f));
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(f10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, d10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            List<Uri> Preview_Thumbnails$lambda$1 = Preview_Thumbnails$lambda$1(z0Var);
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new e(z0Var, z0Var2, 0);
                qVar.h0(L3);
            }
            ho.l lVar = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new d(z0Var, 1);
                qVar.h0(L4);
            }
            ho.p pVar = (ho.p) L4;
            Uri Preview_Thumbnails$lambda$4 = Preview_Thumbnails$lambda$4(z0Var2);
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new f(z0Var2, 0);
                qVar.h0(L5);
            }
            Thumbnails(Preview_Thumbnails$lambda$1, lVar, pVar, Preview_Thumbnails$lambda$4, (ho.l) L5, t1.b0.a(0, qVar, 3), qVar, 25008);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.highlighter.y(i10, 7);
        }
    }

    private static final List<Uri> Preview_Thumbnails$lambda$1(z0 z0Var) {
        return (List) z0Var.getValue();
    }

    private static final Uri Preview_Thumbnails$lambda$4(z0 z0Var) {
        return (Uri) z0Var.getValue();
    }

    public static final z Preview_Thumbnails$lambda$6$0$0(z0 z0Var, z0 z0Var2, int i10) {
        z0Var2.setValue((Uri) tn.o.z0(i10, Preview_Thumbnails$lambda$1(z0Var)));
        return z.f31622a;
    }

    public static final z Preview_Thumbnails$lambda$6$1$0(z0 z0Var, int i10, int i11) {
        ArrayList i12 = tn.o.i1(Preview_Thumbnails$lambda$1(z0Var));
        i12.add(i11, i12.remove(i10));
        z0Var.setValue(i12);
        return z.f31622a;
    }

    public static final z Preview_Thumbnails$lambda$6$2$0(z0 z0Var, Uri uri) {
        uri.getClass();
        z0Var.setValue(uri);
        return z.f31622a;
    }

    public static final z Preview_Thumbnails$lambda$7(int i10, u2.m mVar, int i11) {
        Preview_Thumbnails(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void Thumbnails(List<? extends Uri> list, ho.l lVar, ho.p pVar, final Uri uri, final ho.l lVar2, t1.z zVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        u2.q qVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-943926278);
        if ((i10 & 6) == 0) {
            if (qVar2.h(list)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i11 = i17 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(lVar)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i11 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(pVar)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i11 |= i15;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(uri)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i14;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.h(lVar2)) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i13;
        }
        if ((196608 & i10) == 0) {
            if (qVar2.f(zVar)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i11 |= i12;
        }
        final int i18 = 0;
        final int i19 = 1;
        if ((74899 & i11) != 74898) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            i3.t e10 = p2.e(i3.q.f13017a, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i20 = ElevenLabsTheme.$stable;
            i3.t I = r1.d.I(e10, t2.u.P, t2.u.P, t2.u.P, elevenLabsTheme.getSpacings(qVar2, i20).m2357getX5D9Ej5fM(), 7);
            u0 u0Var = r1.j.f29228a;
            r1.h h10 = r1.j.h(elevenLabsTheme.getSpacings(qVar2, i20).m2353getX2D9Ej5fM(), i3.d.C0);
            float m2353getX2D9Ej5fM = elevenLabsTheme.getSpacings(qVar2, i20).m2353getX2D9Ej5fM();
            qVar = qVar2;
            ReorderableRowKt.ReorderableRow(list, pVar, I, new ho.r() { // from class: io.elevenlabs.ocr.j
                @Override // ho.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    i3.t Thumbnails$lambda$0;
                    z Thumbnails$lambda$1;
                    switch (i18) {
                        case 0:
                            Thumbnails$lambda$0 = OcrImportScreenKt.Thumbnails$lambda$0((Uri) uri, (Uri) obj, ((Boolean) obj2).booleanValue(), (u2.m) obj3, ((Integer) obj4).intValue());
                            return Thumbnails$lambda$0;
                        default:
                            Thumbnails$lambda$1 = OcrImportScreenKt.Thumbnails$lambda$1((ho.l) uri, (t1.b) obj, (Uri) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                            return Thumbnails$lambda$1;
                    }
                }
            }, lVar, zVar, c3.k.d(-1170975881, true, new ho.r() { // from class: io.elevenlabs.ocr.j
                @Override // ho.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    i3.t Thumbnails$lambda$0;
                    z Thumbnails$lambda$1;
                    switch (i19) {
                        case 0:
                            Thumbnails$lambda$0 = OcrImportScreenKt.Thumbnails$lambda$0((Uri) lVar2, (Uri) obj, ((Boolean) obj2).booleanValue(), (u2.m) obj3, ((Integer) obj4).intValue());
                            return Thumbnails$lambda$0;
                        default:
                            Thumbnails$lambda$1 = OcrImportScreenKt.Thumbnails$lambda$1((ho.l) lVar2, (t1.b) obj, (Uri) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                            return Thumbnails$lambda$1;
                    }
                }
            }, qVar2), h10, new d2(m2353getX2D9Ej5fM, m2353getX2D9Ej5fM, m2353getX2D9Ej5fM, m2353getX2D9Ej5fM), i3.d.f13005z0, qVar, (i11 & 14) | 806879232 | ((i11 >> 3) & 112) | ((i11 << 9) & 57344) | (i11 & 458752), 0);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.e(list, lVar, pVar, uri, lVar2, zVar, i10, 2);
        }
    }

    public static final i3.t Thumbnails$lambda$0(Uri uri, Uri uri2, boolean z6, u2.m mVar, int i10) {
        float f10;
        float f11;
        uri2.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.X(1922513828);
        if (uri2.equals(uri)) {
            f10 = 1.2f;
        } else {
            f10 = 1.0f;
        }
        s2 b10 = j1.f.b(f10, null, "selection-scale", qVar, 3072, 22);
        if (z6) {
            f11 = 1.1f;
        } else {
            f11 = 1.0f;
        }
        s2 b11 = j1.f.b(f11, null, "dragging-scale", qVar, 3072, 22);
        float Thumbnails$lambda$0$0 = Thumbnails$lambda$0$0(b10);
        i3.t tVar = i3.q.f13017a;
        i3.t j4 = m3.h.j(tVar, Thumbnails$lambda$0$0, Thumbnails$lambda$0$0);
        float Thumbnails$lambda$0$1 = Thumbnails$lambda$0$1(b11);
        ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
        int i11 = ElevenLabsTheme.$stable;
        i3.t k4 = m3.h.k(m3.h.j(j4, Thumbnails$lambda$0$1, Thumbnails$lambda$0$1), 10, elevenLabsTheme.getShapes(qVar, i11).getMd(), 0L, 0L, 28);
        if (kotlin.jvm.internal.m.c(uri, uri2)) {
            qVar.X(699877870);
            tVar = i3.a.d(l1.n.j(2, ReaderColors.INSTANCE.m2466getWhite0d7_KjU(), tVar, elevenLabsTheme.getShapes(qVar, i11).getMd()), 1.0f);
        } else {
            qVar.X(699878380);
        }
        qVar.p(false);
        i3.t then = k4.then(tVar);
        qVar.p(false);
        return then;
    }

    private static final float Thumbnails$lambda$0$0(s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    private static final float Thumbnails$lambda$0$1(s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final z Thumbnails$lambda$1(ho.l lVar, t1.b bVar, Uri uri, u2.m mVar, int i10) {
        bVar.getClass();
        uri.getClass();
        u2.q qVar = (u2.q) mVar;
        ad.h hVar = new ad.h((Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b));
        hVar.f1788c = uri;
        hVar.b();
        ad.i a10 = hVar.a();
        i3.t c5 = m3.h.c(i3.a.d(p2.f(p2.s(i3.q.f13017a, 54), 68), 0.5f), ElevenLabsTheme.INSTANCE.getShapes(qVar, ElevenLabsTheme.$stable).getMd());
        boolean f10 = qVar.f(lVar) | qVar.h(uri);
        Object L = qVar.L();
        if (f10 || L == u2.l.f33918a) {
            L = new a2.q(lVar, uri, 14);
            qVar.h0(L);
        }
        qc.m.b(a10, null, l1.n.p(c5, false, null, null, null, (ho.a) L, 15), null, f4.q.f8839b, null, qVar, 1572912, 4024);
        return z.f31622a;
    }

    public static final z Thumbnails$lambda$1$0$0(ho.l lVar, Uri uri) {
        lVar.invoke(uri);
        return z.f31622a;
    }

    public static final z Thumbnails$lambda$2(List list, ho.l lVar, ho.p pVar, Uri uri, ho.l lVar2, t1.z zVar, int i10, u2.m mVar, int i11) {
        Thumbnails(list, lVar, pVar, uri, lVar2, zVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final <T> Object await(final lh.b0 b0Var, Context context, wn.c<? super T> cVar) {
        final fr.n nVar = new fr.n(1, gg.b.V(cVar));
        nVar.t();
        nVar.e(new ho.l() { // from class: io.elevenlabs.ocr.OcrImportScreenKt$await$2$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return z.f31622a;
            }

            public final void invoke(Throwable th) {
                lh.b0.this.cancel(true);
            }
        });
        b0Var.a(new Runnable() { // from class: io.elevenlabs.ocr.OcrImportScreenKt$await$2$2
            @Override // java.lang.Runnable
            public final void run() {
                fr.l.this.resumeWith(b0Var.get(10L, TimeUnit.SECONDS));
            }
        }, y5.c.b(context));
        return nVar.s();
    }

    public static final void captureImage(Context context, i0 i0Var, ho.l lVar) {
        String str = UUID.randomUUID() + ".jpeg";
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "image/jpeg");
        if (Build.VERSION.SDK_INT > 28) {
            contentValues.put("relative_path", "Pictures/ElevenLabsReader");
        }
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        i0Var.G(new a5.a(contentResolver, contentValues), y5.c.b(context), new OcrImportScreenKt$captureImage$1(lVar, "captureImage"));
    }

    private static final boolean hasCameraSafe(b1.h hVar, g0.q qVar) {
        boolean z6;
        hVar.getClass();
        qVar.getClass();
        b1.e eVar = hVar.f4143a;
        Trace.beginSection(ae.l.e0("CX:hasCamera"));
        try {
            g0.t tVar = (g0.t) eVar.f4130f;
            tVar.getClass();
            qVar.c(tVar.f10153a.c());
            z6 = true;
        } catch (IllegalArgumentException unused) {
            z6 = false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
        Trace.endSection();
        return z6;
    }

    private static final boolean hasPermission(Context context, String str) {
        if (y5.c.a(context, str) == 0) {
            return true;
        }
        return false;
    }

    private static final boolean hasWriteImagePermissions(Context context) {
        if (Build.VERSION.SDK_INT > 32 || y5.c.a(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    public static final void openAppSettings(Context context) {
        context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", context.getPackageName(), null)));
    }
}
