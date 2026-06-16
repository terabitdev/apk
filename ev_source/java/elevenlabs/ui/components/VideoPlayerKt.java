package io.elevenlabs.ui.components;

import android.content.Context;
import android.net.Uri;
import android.view.SurfaceView;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.livekit.android.rpc.RpcError;
import java.io.File;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0097\u0001\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0017\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0095\u0001\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u001b\"\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0018\u0010#\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006(²\u0006\u0010\u0010&\u001a\u0004\u0018\u00010%8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010'\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Li3/t;", "modifier", "", "rawRes", "Lp3/x;", "backgroundColor", "Lkotlin/Function0;", "Lsn/z;", "onReady", "onEnded", "onBufferingStarted", "", "playInLoop", "zoomToFit", "playSound", "", "hueAdjustmentDegrees", "useComposeSurface", "composeSurfaceType", "VideoPlayer-_Ogyb9c", "(Li3/t;IJLho/a;Lho/a;Lho/a;ZZZLjava/lang/Float;ZILu2/m;III)V", "VideoPlayer", FirebaseAnalytics.Param.CONTENT, "VideoPlayerCacheProvider", "(Lho/p;Lu2/m;I)V", "Landroid/net/Uri;", "uri", "(Li3/t;Landroid/net/Uri;JLho/a;Lho/a;Lho/a;ZZZLjava/lang/Float;ZILu2/m;III)V", "Lu2/q1;", "Ld8/d;", "LocalCacheDataSource", "Lu2/q1;", "", "lock", "Ljava/lang/Object;", "cacheInstance", "Ld8/d;", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "videoAspectRatio", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VideoPlayerKt {
    private static d8.d cacheInstance;
    private static final u2.q1 LocalCacheDataSource = new u2.q1(new t2(8));
    private static final Object lock = new Object();

    public static final d8.d LocalCacheDataSource$lambda$0() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017b  */
    /* JADX WARN: Type inference failed for: r3v40, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* renamed from: VideoPlayer-_Ogyb9c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1885VideoPlayer_Ogyb9c(final i3.t tVar, final Uri uri, final long j4, ho.a aVar, ho.a aVar2, ho.a aVar3, boolean z6, boolean z10, boolean z11, Float f10, boolean z12, int i10, u2.m mVar, final int i11, final int i12, final int i13) {
        int i14;
        ho.a aVar4;
        int i15;
        int i16;
        ho.a aVar5;
        int i17;
        int i18;
        ho.a aVar6;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        boolean z13;
        final boolean z14;
        final boolean z15;
        final Float f11;
        final boolean z16;
        final int i34;
        final ho.a aVar7;
        final ho.a aVar8;
        final ho.a aVar9;
        final boolean z17;
        u2.q qVar;
        u2.r1 r10;
        int i35;
        final ho.a aVar10;
        final ho.a aVar11;
        final boolean z18;
        final boolean z19;
        Float f12;
        boolean z20;
        final int i36;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        int i37;
        boolean z27;
        boolean z28;
        u2.e eVar;
        int i38;
        Context context;
        Float f13;
        u2.z0 z0Var;
        boolean z29;
        sn.z zVar;
        int i39;
        boolean z30;
        boolean z31;
        boolean z32;
        u2.q qVar2;
        boolean z33;
        long j10;
        sn.z zVar2;
        u2.q qVar3;
        ?? r32;
        u2.q qVar4;
        int i40;
        int i41;
        int i42;
        tVar.getClass();
        uri.getClass();
        u2.q qVar5 = (u2.q) mVar;
        qVar5.Z(-452218564);
        if ((i11 & 6) == 0) {
            if (qVar5.f(tVar)) {
                i42 = 4;
            } else {
                i42 = 2;
            }
            i14 = i42 | i11;
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar5.h(uri)) {
                i41 = 32;
            } else {
                i41 = 16;
            }
            i14 |= i41;
        }
        if ((i11 & 384) == 0) {
            if (qVar5.e(j4)) {
                i40 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i40 = 128;
            }
            i14 |= i40;
        }
        int i43 = i13 & 8;
        if (i43 != 0) {
            i14 |= 3072;
        } else if ((i11 & 3072) == 0) {
            aVar4 = aVar;
            if (qVar5.h(aVar4)) {
                i15 = 2048;
            } else {
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i14 |= i15;
            i16 = i13 & 16;
            if (i16 == 0) {
                i14 |= 24576;
            } else if ((i11 & 24576) == 0) {
                aVar5 = aVar2;
                if (qVar5.h(aVar5)) {
                    i17 = 16384;
                } else {
                    i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i14 |= i17;
                i18 = i13 & 32;
                if (i18 != 0) {
                    i14 |= 196608;
                    aVar6 = aVar3;
                } else {
                    aVar6 = aVar3;
                    if ((i11 & 196608) == 0) {
                        if (qVar5.h(aVar6)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i14 |= i19;
                    }
                }
                i20 = i13 & 64;
                if (i20 != 0) {
                    i14 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (qVar5.g(z6)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 128;
                if (i22 != 0) {
                    i14 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (qVar5.g(z10)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i14 |= i23;
                }
                i24 = i13 & RpcError.MAX_MESSAGE_BYTES;
                if (i24 != 0) {
                    i14 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    if (qVar5.g(z11)) {
                        i25 = 67108864;
                    } else {
                        i25 = 33554432;
                    }
                    i14 |= i25;
                }
                i26 = i13 & 512;
                if (i26 != 0) {
                    i14 |= 805306368;
                } else if ((i11 & 805306368) == 0) {
                    if (qVar5.f(f10)) {
                        i27 = 536870912;
                    } else {
                        i27 = 268435456;
                    }
                    i14 |= i27;
                }
                i28 = i13 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i28 != 0) {
                    i30 = i12 | 6;
                    i29 = i28;
                } else if ((i12 & 6) == 0) {
                    i29 = i28;
                    if (qVar5.g(z12)) {
                        i31 = 4;
                    } else {
                        i31 = 2;
                    }
                    i30 = i12 | i31;
                } else {
                    i29 = i28;
                    i30 = i12;
                }
                i32 = i13 & 2048;
                if (i32 != 0) {
                    i30 |= 48;
                } else if ((i12 & 48) == 0) {
                    if (qVar5.d(i10)) {
                        i33 = 32;
                    } else {
                        i33 = 16;
                    }
                    i30 |= i33;
                }
                if ((i14 & 306783379) != 306783378 && (i30 & 19) == 18) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (qVar5.O(i14 & 1, z13)) {
                    u2.e eVar2 = u2.l.f33918a;
                    if (i43 != 0) {
                        Object L = qVar5.L();
                        if (L == eVar2) {
                            L = new t2(4);
                            qVar5.h0(L);
                        }
                        int i44 = i14;
                        aVar10 = (ho.a) L;
                        i35 = i44;
                    } else {
                        i35 = i14;
                        aVar10 = aVar4;
                    }
                    if (i16 != 0) {
                        Object L2 = qVar5.L();
                        if (L2 == eVar2) {
                            L2 = new t2(9);
                            qVar5.h0(L2);
                        }
                        aVar5 = (ho.a) L2;
                    }
                    final ho.a aVar12 = aVar5;
                    if (i18 != 0) {
                        Object L3 = qVar5.L();
                        if (L3 == eVar2) {
                            L3 = new t2(10);
                            qVar5.h0(L3);
                        }
                        aVar11 = (ho.a) L3;
                    } else {
                        aVar11 = aVar6;
                    }
                    if (i20 != 0) {
                        z18 = false;
                    } else {
                        z18 = z6;
                    }
                    if (i22 != 0) {
                        z19 = false;
                    } else {
                        z19 = z10;
                    }
                    if (i24 != 0) {
                        z17 = false;
                    } else {
                        z17 = z11;
                    }
                    if (i26 != 0) {
                        f12 = null;
                    } else {
                        f12 = f10;
                    }
                    if (i29 != 0) {
                        z20 = false;
                    } else {
                        z20 = z12;
                    }
                    if (i32 != 0) {
                        i36 = 1;
                    } else {
                        i36 = i10;
                    }
                    boolean booleanValue = ((Boolean) qVar5.j(i4.w1.f13252a)).booleanValue();
                    p3.w0 w0Var = p3.h0.f26395b;
                    if (booleanValue) {
                        qVar5.X(1269638878);
                        r1.p.a(l1.n.h(tVar, j4, w0Var), qVar5, 0);
                        qVar5.p(false);
                        u2.r1 r11 = qVar5.r();
                        if (r11 != null) {
                            final int i45 = 1;
                            final Float f14 = f12;
                            final boolean z34 = z20;
                            r11.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.a3
                                @Override // ho.p
                                public final Object invoke(Object obj, Object obj2) {
                                    sn.z VideoPlayer__Ogyb9c$lambda$17;
                                    sn.z VideoPlayer__Ogyb9c$lambda$7;
                                    sn.z VideoPlayer__Ogyb9c$lambda$11;
                                    u2.m mVar2 = (u2.m) obj;
                                    switch (i45) {
                                        case 0:
                                            VideoPlayer__Ogyb9c$lambda$17 = VideoPlayerKt.VideoPlayer__Ogyb9c$lambda$17(tVar, uri, j4, aVar10, aVar12, aVar11, z18, z19, z17, f14, z34, i36, i11, i12, i13, mVar2, ((Integer) obj2).intValue());
                                            return VideoPlayer__Ogyb9c$lambda$17;
                                        case 1:
                                            VideoPlayer__Ogyb9c$lambda$7 = VideoPlayerKt.VideoPlayer__Ogyb9c$lambda$7(tVar, uri, j4, aVar10, aVar12, aVar11, z18, z19, z17, f14, z34, i36, i11, i12, i13, mVar2, ((Integer) obj2).intValue());
                                            return VideoPlayer__Ogyb9c$lambda$7;
                                        default:
                                            VideoPlayer__Ogyb9c$lambda$11 = VideoPlayerKt.VideoPlayer__Ogyb9c$lambda$11(tVar, uri, j4, aVar10, aVar12, aVar11, z18, z19, z17, f14, z34, i36, i11, i12, i13, mVar2, ((Integer) obj2).intValue());
                                            return VideoPlayer__Ogyb9c$lambda$11;
                                    }
                                }
                            };
                            return;
                        }
                        return;
                    }
                    final Float f15 = f12;
                    final int i46 = i36;
                    final ho.a aVar13 = aVar10;
                    final boolean z35 = z20;
                    qVar5.X(1269708070);
                    qVar5.p(false);
                    Context context2 = (Context) qVar5.j(AndroidCompositionLocals_androidKt.f2291b);
                    Object L4 = qVar5.L();
                    if (L4 == eVar2) {
                        L4 = u2.r.A(null);
                        qVar5.h0(L4);
                    }
                    u2.z0 z0Var2 = (u2.z0) L4;
                    d8.d dVar = (d8.d) qVar5.j(LocalCacheDataSource);
                    if (dVar == null) {
                        qVar5.X(1269899154);
                        r1.p.a(l1.n.h(tVar, j4, w0Var), qVar5, 0);
                        qVar5.p(false);
                        u2.r1 r12 = qVar5.r();
                        if (r12 != null) {
                            final int i47 = 2;
                            r12.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.a3
                                @Override // ho.p
                                public final Object invoke(Object obj, Object obj2) {
                                    sn.z VideoPlayer__Ogyb9c$lambda$17;
                                    sn.z VideoPlayer__Ogyb9c$lambda$7;
                                    sn.z VideoPlayer__Ogyb9c$lambda$11;
                                    u2.m mVar2 = (u2.m) obj;
                                    switch (i47) {
                                        case 0:
                                            VideoPlayer__Ogyb9c$lambda$17 = VideoPlayerKt.VideoPlayer__Ogyb9c$lambda$17(tVar, uri, j4, aVar13, aVar12, aVar11, z18, z19, z17, f15, z35, i46, i11, i12, i13, mVar2, ((Integer) obj2).intValue());
                                            return VideoPlayer__Ogyb9c$lambda$17;
                                        case 1:
                                            VideoPlayer__Ogyb9c$lambda$7 = VideoPlayerKt.VideoPlayer__Ogyb9c$lambda$7(tVar, uri, j4, aVar13, aVar12, aVar11, z18, z19, z17, f15, z35, i46, i11, i12, i13, mVar2, ((Integer) obj2).intValue());
                                            return VideoPlayer__Ogyb9c$lambda$7;
                                        default:
                                            VideoPlayer__Ogyb9c$lambda$11 = VideoPlayerKt.VideoPlayer__Ogyb9c$lambda$11(tVar, uri, j4, aVar13, aVar12, aVar11, z18, z19, z17, f15, z35, i46, i11, i12, i13, mVar2, ((Integer) obj2).intValue());
                                            return VideoPlayer__Ogyb9c$lambda$11;
                                    }
                                }
                            };
                            return;
                        }
                        return;
                    }
                    boolean z36 = z19;
                    ho.a aVar14 = aVar11;
                    boolean z37 = z18;
                    qVar5.X(1269979878);
                    qVar5.p(false);
                    boolean h10 = qVar5.h(context2) | qVar5.h(uri) | qVar5.h(dVar);
                    int i48 = 1879048192 & i35;
                    if (i48 == 536870912) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    boolean z38 = z21 | h10;
                    if ((i35 & 7168) == 2048) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    boolean z39 = z38 | z22;
                    if ((57344 & i35) == 16384) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    boolean z40 = z39 | z23;
                    if ((458752 & i35) == 131072) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z41 = z40 | z24;
                    if ((234881024 & i35) == 67108864) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z42 = z41 | z25;
                    if ((3670016 & i35) == 1048576) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean z43 = z42 | z26;
                    Object L5 = qVar5.L();
                    if (!z43 && L5 != eVar2) {
                        i37 = i35;
                        context = context2;
                        aVar9 = aVar13;
                        aVar7 = aVar12;
                        aVar8 = aVar14;
                        z27 = z36;
                        z28 = z35;
                        z14 = z37;
                        z0Var = z0Var2;
                        eVar = eVar2;
                        i38 = i48;
                        f13 = f15;
                    } else {
                        i37 = i35;
                        z27 = z36;
                        z28 = z35;
                        eVar = eVar2;
                        i38 = i48;
                        context = context2;
                        boolean z44 = z17;
                        f13 = f15;
                        a2.a1 a1Var = new a2.a1(context, uri, dVar, f13, z44, z37, aVar13, aVar12, aVar14, z0Var2);
                        z14 = z37;
                        aVar7 = aVar12;
                        z0Var = z0Var2;
                        z17 = z44;
                        aVar9 = aVar13;
                        aVar8 = aVar14;
                        qVar5.h0(a1Var);
                        L5 = a1Var;
                    }
                    sn.z zVar3 = sn.z.f31622a;
                    u2.r.c(zVar3, (ho.l) L5, qVar5);
                    if (i38 == 536870912) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    Object L6 = qVar5.L();
                    if (!z29 && L6 != eVar) {
                        zVar = null;
                    } else {
                        zVar = null;
                        L6 = new VideoPlayerKt$VideoPlayer$11$1(f13, z0Var, null);
                        qVar5.h0(L6);
                    }
                    u2.r.f((ho.p) L6, f13, qVar5);
                    if (z28) {
                        qVar5.X(1272416292);
                        ExoPlayer VideoPlayer__Ogyb9c$lambda$9 = VideoPlayer__Ogyb9c$lambda$9(z0Var);
                        if (VideoPlayer__Ogyb9c$lambda$9 == null) {
                            qVar5.X(1272425467);
                            qVar5.p(false);
                            qVar4 = qVar5;
                            i39 = i46;
                            zVar2 = zVar;
                            r32 = 0;
                            j10 = j4;
                        } else {
                            qVar5.X(1272425468);
                            if (z27) {
                                qVar5.X(1441206579);
                                Object L7 = qVar5.L();
                                if (L7 == eVar) {
                                    L7 = new u2.e1(t2.u.P);
                                    qVar5.h0(L7);
                                }
                                u2.w0 w0Var2 = (u2.w0) L7;
                                boolean h11 = qVar5.h(VideoPlayer__Ogyb9c$lambda$9);
                                Object L8 = qVar5.L();
                                if (h11 || L8 == eVar) {
                                    L8 = new u2(VideoPlayer__Ogyb9c$lambda$9, w0Var2, 2);
                                    qVar5.h0(L8);
                                }
                                u2.r.c(VideoPlayer__Ogyb9c$lambda$9, (ho.l) L8, qVar5);
                                i3.t d10 = m3.h.d(tVar);
                                i3.l lVar = i3.d.f13001e;
                                io.elevenlabs.readerapp.ui.components.b bVar = new io.elevenlabs.readerapp.ui.components.b(j4, VideoPlayer__Ogyb9c$lambda$9, i46, w0Var2);
                                j10 = j4;
                                i39 = i46;
                                zVar2 = zVar3;
                                r1.d.a(d10, lVar, false, c3.k.d(-2069991761, true, bVar, qVar5), qVar5, 3120, 4);
                                u2.q qVar6 = qVar5;
                                z33 = false;
                                qVar6.p(false);
                                qVar3 = qVar6;
                            } else {
                                i39 = i46;
                                z33 = false;
                                j10 = j4;
                                zVar2 = zVar3;
                                u2.q qVar7 = qVar5;
                                qVar7.X(1443341890);
                                rd.c1.f(VideoPlayer__Ogyb9c$lambda$9, l1.n.h(tVar, j10, w0Var), i39, qVar7, (i30 << 3) & 896);
                                qVar7.p(false);
                                qVar3 = qVar7;
                            }
                            qVar3.p(z33);
                            qVar4 = qVar3;
                            r32 = z33;
                        }
                        if (zVar2 == null) {
                            qVar4.X(-790161147);
                            r1.p.a(l1.n.h(tVar, j10, w0Var), qVar4, r32);
                        } else {
                            qVar4.X(-790238306);
                        }
                        qVar4.p(r32);
                        qVar4.p(r32);
                        z15 = z27;
                        qVar2 = qVar4;
                    } else {
                        u2.q qVar8 = qVar5;
                        i39 = i46;
                        qVar8.X(1274905871);
                        boolean h12 = qVar8.h(context);
                        int i49 = i37 & 29360128;
                        if (i49 == 8388608) {
                            z30 = true;
                        } else {
                            z30 = false;
                        }
                        boolean z45 = h12 | z30;
                        int i50 = i37;
                        final Context context3 = context;
                        if ((i50 & 896) == 256) {
                            z31 = true;
                        } else {
                            z31 = false;
                        }
                        boolean z46 = z31 | z45;
                        Object L9 = qVar8.L();
                        if (!z46 && L9 != eVar) {
                            z15 = z27;
                        } else {
                            final boolean z47 = z27;
                            final u2.z0 z0Var3 = z0Var;
                            L9 = new ho.l() { // from class: io.elevenlabs.ui.components.b3
                                @Override // ho.l
                                public final Object invoke(Object obj) {
                                    la.e0 VideoPlayer__Ogyb9c$lambda$15$0;
                                    VideoPlayer__Ogyb9c$lambda$15$0 = VideoPlayerKt.VideoPlayer__Ogyb9c$lambda$15$0(context3, z47, j4, z0Var3, (Context) obj);
                                    return VideoPlayer__Ogyb9c$lambda$15$0;
                                }
                            };
                            z15 = z47;
                            qVar8.h0(L9);
                        }
                        ho.l lVar2 = (ho.l) L9;
                        if (i49 == 8388608) {
                            z32 = true;
                        } else {
                            z32 = false;
                        }
                        Object L10 = qVar8.L();
                        if (z32 || L10 == eVar) {
                            L10 = new io.elevenlabs.readerapp.ui.screens.authenticated.account.g(z15, z0Var, 3);
                            qVar8.h0(L10);
                        }
                        k5.k.b(lVar2, tVar, (ho.l) L10, qVar8, (i50 << 3) & 112, 0);
                        qVar8.p(false);
                        qVar2 = qVar8;
                    }
                    z16 = z28;
                    f11 = f13;
                    i34 = i39;
                    qVar = qVar2;
                } else {
                    u2.q qVar9 = qVar5;
                    qVar9.R();
                    z14 = z6;
                    z15 = z10;
                    f11 = f10;
                    z16 = z12;
                    i34 = i10;
                    aVar7 = aVar5;
                    aVar8 = aVar6;
                    aVar9 = aVar4;
                    z17 = z11;
                    qVar = qVar9;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    final int i51 = 0;
                    r10.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.a3
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            sn.z VideoPlayer__Ogyb9c$lambda$17;
                            sn.z VideoPlayer__Ogyb9c$lambda$7;
                            sn.z VideoPlayer__Ogyb9c$lambda$11;
                            u2.m mVar2 = (u2.m) obj;
                            switch (i51) {
                                case 0:
                                    VideoPlayer__Ogyb9c$lambda$17 = VideoPlayerKt.VideoPlayer__Ogyb9c$lambda$17(tVar, uri, j4, aVar9, aVar7, aVar8, z14, z15, z17, f11, z16, i34, i11, i12, i13, mVar2, ((Integer) obj2).intValue());
                                    return VideoPlayer__Ogyb9c$lambda$17;
                                case 1:
                                    VideoPlayer__Ogyb9c$lambda$7 = VideoPlayerKt.VideoPlayer__Ogyb9c$lambda$7(tVar, uri, j4, aVar9, aVar7, aVar8, z14, z15, z17, f11, z16, i34, i11, i12, i13, mVar2, ((Integer) obj2).intValue());
                                    return VideoPlayer__Ogyb9c$lambda$7;
                                default:
                                    VideoPlayer__Ogyb9c$lambda$11 = VideoPlayerKt.VideoPlayer__Ogyb9c$lambda$11(tVar, uri, j4, aVar9, aVar7, aVar8, z14, z15, z17, f11, z16, i34, i11, i12, i13, mVar2, ((Integer) obj2).intValue());
                                    return VideoPlayer__Ogyb9c$lambda$11;
                            }
                        }
                    };
                    return;
                }
                return;
            }
            aVar5 = aVar2;
            i18 = i13 & 32;
            if (i18 != 0) {
            }
            i20 = i13 & 64;
            if (i20 != 0) {
            }
            i22 = i13 & 128;
            if (i22 != 0) {
            }
            i24 = i13 & RpcError.MAX_MESSAGE_BYTES;
            if (i24 != 0) {
            }
            i26 = i13 & 512;
            if (i26 != 0) {
            }
            i28 = i13 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i28 != 0) {
            }
            i32 = i13 & 2048;
            if (i32 != 0) {
            }
            if ((i14 & 306783379) != 306783378) {
            }
            z13 = true;
            if (qVar5.O(i14 & 1, z13)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        aVar4 = aVar;
        i16 = i13 & 16;
        if (i16 == 0) {
        }
        aVar5 = aVar2;
        i18 = i13 & 32;
        if (i18 != 0) {
        }
        i20 = i13 & 64;
        if (i20 != 0) {
        }
        i22 = i13 & 128;
        if (i22 != 0) {
        }
        i24 = i13 & RpcError.MAX_MESSAGE_BYTES;
        if (i24 != 0) {
        }
        i26 = i13 & 512;
        if (i26 != 0) {
        }
        i28 = i13 & UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i28 != 0) {
        }
        i32 = i13 & 2048;
        if (i32 != 0) {
        }
        if ((i14 & 306783379) != 306783378) {
        }
        z13 = true;
        if (qVar5.O(i14 & 1, z13)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [c8.w, java.lang.Object] */
    public static final void VideoPlayerCacheProvider(ho.p pVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        u2.r1 r10;
        io.elevenlabs.readerapp.ui.screens.authenticated.collections.d dVar;
        d8.d dVar2;
        int i12;
        pVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(21060547);
        if ((i10 & 6) == 0) {
            if (qVar.h(pVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            if (((Boolean) qVar.j(i4.w1.f13252a)).booleanValue()) {
                qVar.X(349638839);
                pVar.invoke(qVar, Integer.valueOf(i11 & 14));
                qVar.p(false);
                r10 = qVar.r();
                if (r10 != null) {
                    dVar = new io.elevenlabs.readerapp.ui.screens.authenticated.collections.d(i10, 2, pVar);
                    r10.f34012d = dVar;
                }
                return;
            }
            qVar.X(349677279);
            qVar.p(false);
            Context context = (Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b);
            synchronized (lock) {
                try {
                    if (cacheInstance == null) {
                        d8.v vVar = new d8.v(new File(context.getCacheDir(), "exo_player"), new d8.r(), new b8.a(context));
                        a0.p pVar2 = new a0.p(13, false);
                        pVar2.f733b = vVar;
                        ka.j0 j0Var = new ka.j0(context, new c8.s(0));
                        ?? obj = new Object();
                        d8.d dVar3 = new d8.d();
                        dVar3.f7504a = vVar;
                        dVar3.f7506c = pVar2;
                        dVar3.f7507d = false;
                        dVar3.f7505b = obj;
                        dVar3.f7508e = j0Var;
                        dVar3.f7509f = 2;
                        cacheInstance = dVar3;
                    }
                    dVar2 = cacheInstance;
                    dVar2.getClass();
                } catch (Throwable th) {
                    throw th;
                }
            }
            u2.r.a(LocalCacheDataSource.a(dVar2), c3.k.d(1249104003, true, new v(pVar, 3), qVar), qVar, 56);
        } else {
            qVar.R();
        }
        r10 = qVar.r();
        if (r10 != null) {
            dVar = new io.elevenlabs.readerapp.ui.screens.authenticated.collections.d(i10, 3, pVar);
            r10.f34012d = dVar;
        }
    }

    public static final sn.z VideoPlayerCacheProvider$lambda$0(ho.p pVar, int i10, u2.m mVar, int i11) {
        VideoPlayerCacheProvider(pVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final sn.z VideoPlayerCacheProvider$lambda$2(ho.p pVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            pVar.invoke(qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z VideoPlayerCacheProvider$lambda$3(ho.p pVar, int i10, u2.m mVar, int i11) {
        VideoPlayerCacheProvider(pVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final sn.z VideoPlayer__Ogyb9c$lambda$11(i3.t tVar, Uri uri, long j4, ho.a aVar, ho.a aVar2, ho.a aVar3, boolean z6, boolean z10, boolean z11, Float f10, boolean z12, int i10, int i11, int i12, int i13, u2.m mVar, int i14) {
        m1885VideoPlayer_Ogyb9c(tVar, uri, j4, aVar, aVar2, aVar3, z6, z10, z11, f10, z12, i10, mVar, u2.r.M(i11 | 1), u2.r.M(i12), i13);
        return sn.z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [j8.p] */
    public static final u2.h0 VideoPlayer__Ogyb9c$lambda$12$0(Context context, Uri uri, d8.d dVar, Float f10, boolean z6, boolean z10, final ho.a aVar, final ho.a aVar2, final ho.a aVar3, final u2.z0 z0Var, u2.i0 i0Var) {
        j8.h hVar;
        j8.h hVar2;
        float f11;
        i0Var.getClass();
        g8.i0 a10 = new g8.p(context).a();
        w7.r0 b10 = w7.r0.b(uri);
        gh.q1 q1Var = new gh.q1(new z8.k(), 16);
        Object obj = new Object();
        tg.b0 b0Var = new tg.b0(13);
        b10.f36579b.getClass();
        b10.f36579b.getClass();
        w7.j0 j0Var = b10.f36579b.f36471c;
        if (j0Var == null) {
            hVar2 = j8.r.f18686a;
        } else {
            synchronized (obj) {
                try {
                    if (!j0Var.equals(null)) {
                        hVar = j8.i.b(j0Var);
                    } else {
                        hVar = null;
                    }
                    hVar.getClass();
                } catch (Throwable th) {
                    throw th;
                }
            }
            hVar2 = hVar;
        }
        r8.c1 c1Var = new r8.c1(b10, dVar, q1Var, hVar2, b0Var, 1048576, null);
        a10.B();
        List singletonList = Collections.singletonList(c1Var);
        a10.B();
        a10.B();
        a10.s(singletonList, -1, -9223372036854775807L, true);
        if (f10 != null) {
            a10.u(ig.f.H(new f8.d0(f10.floatValue() % 360.0f)));
        }
        a10.prepare();
        a10.f10736m.a(new w7.f1() { // from class: io.elevenlabs.ui.components.VideoPlayerKt$VideoPlayer$10$1$1$2
            @Override // w7.f1
            public void onPlaybackStateChanged(int playbackState) {
                if (playbackState != 1 && playbackState != 2) {
                    if (playbackState != 3) {
                        if (playbackState != 4) {
                            return;
                        }
                        aVar2.invoke();
                        return;
                    }
                    ho.a.this.invoke();
                    return;
                }
                aVar3.invoke();
            }

            @Override // w7.f1
            public void onPlayerError(w7.a1 error) {
                error.getClass();
                aVar2.invoke();
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onCues(y7.c cVar) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(w7.g1 g1Var, w7.g1 g1Var2, int i10) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onAudioAttributesChanged(w7.d dVar2) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i10) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(w7.d1 d1Var) {
            }

            @Override // w7.f1
            @Deprecated
            public /* bridge */ /* synthetic */ void onCues(List list) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onDeviceInfoChanged(w7.o oVar) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z11) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z11) {
            }

            @Override // w7.f1
            @Deprecated
            public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z11) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j4) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onMediaMetadataChanged(w7.u0 u0Var) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onMetadata(w7.w0 w0Var) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(w7.b1 b1Var) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onPlayerErrorChanged(w7.a1 a1Var) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(w7.u0 u0Var) {
            }

            @Override // w7.f1
            @Deprecated
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i10) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j4) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j4) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z11) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z11) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(w7.w1 w1Var) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onTracksChanged(w7.y1 y1Var) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onVideoSizeChanged(w7.f2 f2Var) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onVolumeChanged(float f12) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z11) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onEvents(w7.h1 h1Var, w7.e1 e1Var) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onMediaItemTransition(w7.r0 r0Var, int i10) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z11, int i10) {
            }

            @Override // w7.f1
            @Deprecated
            public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z11, int i10) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onTimelineChanged(w7.r1 r1Var, int i10) {
            }
        });
        if (z6) {
            f11 = 1.0f;
        } else {
            f11 = t2.u.P;
        }
        a10.setVolume(f11);
        a10.setPlayWhenReady(true);
        a10.setRepeatMode(z10 ? 1 : 0);
        z0Var.setValue(a10);
        return new u2.h0() { // from class: io.elevenlabs.ui.components.VideoPlayerKt$VideoPlayer__Ogyb9c$lambda$12$0$$inlined$onDispose$1
            @Override // u2.h0
            public void dispose() {
                ExoPlayer VideoPlayer__Ogyb9c$lambda$9;
                VideoPlayer__Ogyb9c$lambda$9 = VideoPlayerKt.VideoPlayer__Ogyb9c$lambda$9(u2.z0.this);
                if (VideoPlayer__Ogyb9c$lambda$9 != null) {
                    ((g8.i0) VideoPlayer__Ogyb9c$lambda$9).release();
                }
            }
        };
    }

    private static final float VideoPlayer__Ogyb9c$lambda$14$1(u2.w0 w0Var) {
        return ((u2.e1) w0Var).h();
    }

    public static final void VideoPlayer__Ogyb9c$lambda$14$2(u2.w0 w0Var, float f10) {
        ((u2.e1) w0Var).i(f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [io.elevenlabs.ui.components.VideoPlayerKt$VideoPlayer$12$1$1$listener$1, java.lang.Object] */
    public static final u2.h0 VideoPlayer__Ogyb9c$lambda$14$3$0(final ExoPlayer exoPlayer, final u2.w0 w0Var, u2.i0 i0Var) {
        int i10;
        i0Var.getClass();
        final ?? r42 = new w7.f1() { // from class: io.elevenlabs.ui.components.VideoPlayerKt$VideoPlayer$12$1$1$listener$1
            @Override // w7.f1
            public void onVideoSizeChanged(w7.f2 videoSize) {
                int i11;
                videoSize.getClass();
                int i12 = videoSize.f36336a;
                if (i12 > 0 && (i11 = videoSize.f36337b) > 0) {
                    VideoPlayerKt.VideoPlayer__Ogyb9c$lambda$14$2(u2.w0.this, i12 / i11);
                }
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onCues(y7.c cVar) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(w7.g1 g1Var, w7.g1 g1Var2, int i11) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onAudioAttributesChanged(w7.d dVar) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i11) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(w7.d1 d1Var) {
            }

            @Override // w7.f1
            @Deprecated
            public /* bridge */ /* synthetic */ void onCues(List list) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onDeviceInfoChanged(w7.o oVar) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z6) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z6) {
            }

            @Override // w7.f1
            @Deprecated
            public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z6) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j4) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onMediaMetadataChanged(w7.u0 u0Var) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onMetadata(w7.w0 w0Var2) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(w7.b1 b1Var) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onPlaybackStateChanged(int i11) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i11) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onPlayerError(w7.a1 a1Var) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onPlayerErrorChanged(w7.a1 a1Var) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(w7.u0 u0Var) {
            }

            @Override // w7.f1
            @Deprecated
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i11) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i11) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j4) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j4) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z6) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z6) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(w7.w1 w1Var) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onTracksChanged(w7.y1 y1Var) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onVolumeChanged(float f10) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i11, boolean z6) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onEvents(w7.h1 h1Var, w7.e1 e1Var) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onMediaItemTransition(w7.r0 r0Var, int i11) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z6, int i11) {
            }

            @Override // w7.f1
            @Deprecated
            public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z6, int i11) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i11, int i12) {
            }

            @Override // w7.f1
            public /* bridge */ /* synthetic */ void onTimelineChanged(w7.r1 r1Var, int i11) {
            }
        };
        ((g8.i0) exoPlayer).f10736m.a(r42);
        g8.i0 i0Var2 = (g8.i0) exoPlayer;
        i0Var2.B();
        w7.f2 f2Var = i0Var2.f10735l0;
        f2Var.getClass();
        int i11 = f2Var.f36336a;
        if (i11 > 0 && (i10 = f2Var.f36337b) > 0) {
            VideoPlayer__Ogyb9c$lambda$14$2(w0Var, i11 / i10);
        }
        return new u2.h0() { // from class: io.elevenlabs.ui.components.VideoPlayerKt$VideoPlayer__Ogyb9c$lambda$14$3$0$$inlined$onDispose$1
            @Override // u2.h0
            public void dispose() {
                ((g8.i0) ExoPlayer.this).removeListener(r42);
            }
        };
    }

    public static final sn.z VideoPlayer__Ogyb9c$lambda$14$4(long j4, ExoPlayer exoPlayer, int i10, u2.w0 w0Var, r1.u uVar, u2.m mVar, int i11) {
        boolean z6;
        i3.t l4;
        int i12;
        uVar.getClass();
        if ((i11 & 6) == 0) {
            if (((u2.q) mVar).f(uVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            float VideoPlayer__Ogyb9c$lambda$14$1 = VideoPlayer__Ogyb9c$lambda$14$1(w0Var);
            i3.q qVar2 = i3.q.f13017a;
            if (VideoPlayer__Ogyb9c$lambda$14$1 > t2.u.P) {
                r1.v vVar = (r1.v) uVar;
                if (vVar.d() / vVar.c() > VideoPlayer__Ogyb9c$lambda$14$1(w0Var)) {
                    l4 = r1.p2.l(qVar2, vVar.d(), vVar.d() / VideoPlayer__Ogyb9c$lambda$14$1(w0Var));
                } else {
                    l4 = r1.p2.l(qVar2, vVar.c() * VideoPlayer__Ogyb9c$lambda$14$1(w0Var), vVar.c());
                }
            } else {
                r1.v vVar2 = (r1.v) uVar;
                l4 = r1.p2.l(qVar2, vVar2.d(), vVar2.c());
            }
            rd.c1.f(exoPlayer, l1.n.h(l4, j4, p3.h0.f26395b), i10, qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final la.e0 VideoPlayer__Ogyb9c$lambda$15$0(Context context, boolean z6, long j4, u2.z0 z0Var, Context context2) {
        SurfaceView surfaceView;
        context2.getClass();
        la.e0 e0Var = new la.e0(context);
        if (VideoPlayer__Ogyb9c$lambda$9(z0Var) != null) {
            e0Var.setPlayer(VideoPlayer__Ogyb9c$lambda$9(z0Var));
        }
        int i10 = 0;
        e0Var.setUseController(false);
        if (z6) {
            i10 = 4;
        }
        e0Var.setResizeMode(i10);
        if (!z6) {
            View videoSurfaceView = e0Var.getVideoSurfaceView();
            if (videoSurfaceView instanceof SurfaceView) {
                surfaceView = (SurfaceView) videoSurfaceView;
            } else {
                surfaceView = null;
            }
            if (surfaceView != null) {
                surfaceView.setZOrderOnTop(true);
                surfaceView.getHolder().setFormat(-3);
            }
        }
        int G = p3.h0.G(j4);
        e0Var.setShutterBackgroundColor(G);
        e0Var.setBackgroundColor(G);
        return e0Var;
    }

    public static final sn.z VideoPlayer__Ogyb9c$lambda$16$0(boolean z6, u2.z0 z0Var, la.e0 e0Var) {
        int i10;
        e0Var.getClass();
        e0Var.setPlayer(VideoPlayer__Ogyb9c$lambda$9(z0Var));
        if (z6) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        e0Var.setResizeMode(i10);
        return sn.z.f31622a;
    }

    public static final sn.z VideoPlayer__Ogyb9c$lambda$17(i3.t tVar, Uri uri, long j4, ho.a aVar, ho.a aVar2, ho.a aVar3, boolean z6, boolean z10, boolean z11, Float f10, boolean z12, int i10, int i11, int i12, int i13, u2.m mVar, int i14) {
        m1885VideoPlayer_Ogyb9c(tVar, uri, j4, aVar, aVar2, aVar3, z6, z10, z11, f10, z12, i10, mVar, u2.r.M(i11 | 1), u2.r.M(i12), i13);
        return sn.z.f31622a;
    }

    public static final sn.z VideoPlayer__Ogyb9c$lambda$3(i3.t tVar, int i10, long j4, ho.a aVar, ho.a aVar2, ho.a aVar3, boolean z6, boolean z10, boolean z11, Float f10, boolean z12, int i11, int i12, int i13, int i14, u2.m mVar, int i15) {
        m1884VideoPlayer_Ogyb9c(tVar, i10, j4, aVar, aVar2, aVar3, z6, z10, z11, f10, z12, i11, mVar, u2.r.M(i12 | 1), u2.r.M(i13), i14);
        return sn.z.f31622a;
    }

    public static final sn.z VideoPlayer__Ogyb9c$lambda$7(i3.t tVar, Uri uri, long j4, ho.a aVar, ho.a aVar2, ho.a aVar3, boolean z6, boolean z10, boolean z11, Float f10, boolean z12, int i10, int i11, int i12, int i13, u2.m mVar, int i14) {
        m1885VideoPlayer_Ogyb9c(tVar, uri, j4, aVar, aVar2, aVar3, z6, z10, z11, f10, z12, i10, mVar, u2.r.M(i11 | 1), u2.r.M(i12), i13);
        return sn.z.f31622a;
    }

    public static final ExoPlayer VideoPlayer__Ogyb9c$lambda$9(u2.z0 z0Var) {
        return (ExoPlayer) z0Var.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* renamed from: VideoPlayer-_Ogyb9c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1884VideoPlayer_Ogyb9c(final i3.t tVar, int i10, final long j4, ho.a aVar, ho.a aVar2, ho.a aVar3, boolean z6, boolean z10, boolean z11, Float f10, boolean z12, int i11, u2.m mVar, final int i12, final int i13, final int i14) {
        int i15;
        int i16;
        long j10;
        ho.a aVar4;
        int i17;
        ho.a aVar5;
        int i18;
        ho.a aVar6;
        int i19;
        boolean z13;
        int i20;
        boolean z14;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        u2.q qVar;
        final boolean z15;
        final boolean z16;
        final boolean z17;
        final boolean z18;
        ho.a aVar7;
        final ho.a aVar8;
        final Float f11;
        final int i30;
        final ho.a aVar9;
        u2.r1 r10;
        int i31;
        int i32;
        ho.a aVar10;
        int i33;
        ho.a aVar11;
        int i34;
        boolean z19;
        boolean z20;
        Float f12;
        tVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-510212775);
        if ((i12 & 6) == 0) {
            i15 = (qVar2.f(tVar) ? 4 : 2) | i12;
        } else {
            i15 = i12;
        }
        if ((i12 & 48) == 0) {
            i16 = i10;
            i15 |= qVar2.d(i16) ? 32 : 16;
        } else {
            i16 = i10;
        }
        if ((i12 & 384) == 0) {
            j10 = j4;
            i15 |= qVar2.e(j10) ? RpcError.MAX_MESSAGE_BYTES : 128;
        } else {
            j10 = j4;
        }
        int i35 = i14 & 8;
        if (i35 != 0) {
            i15 |= 3072;
        } else if ((i12 & 3072) == 0) {
            aVar4 = aVar;
            i15 |= qVar2.h(aVar4) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            i17 = i14 & 16;
            if (i17 == 0) {
                i15 |= 24576;
            } else if ((i12 & 24576) == 0) {
                aVar5 = aVar2;
                i15 |= qVar2.h(aVar5) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
                i18 = i14 & 32;
                if (i18 != 0) {
                    i15 |= 196608;
                    aVar6 = aVar3;
                } else {
                    aVar6 = aVar3;
                    if ((i12 & 196608) == 0) {
                        i15 |= qVar2.h(aVar6) ? 131072 : 65536;
                    }
                }
                i19 = i14 & 64;
                if (i19 != 0) {
                    i15 |= 1572864;
                    z13 = z6;
                } else {
                    z13 = z6;
                    if ((i12 & 1572864) == 0) {
                        i15 |= qVar2.g(z13) ? 1048576 : 524288;
                    }
                }
                i20 = i14 & 128;
                if (i20 != 0) {
                    i15 |= 12582912;
                    z14 = z10;
                } else {
                    z14 = z10;
                    if ((i12 & 12582912) == 0) {
                        i15 |= qVar2.g(z14) ? 8388608 : 4194304;
                    }
                }
                i21 = i15;
                i22 = i14 & RpcError.MAX_MESSAGE_BYTES;
                if (i22 != 0) {
                    i21 |= 100663296;
                } else if ((i12 & 100663296) == 0) {
                    i23 = i22;
                    i21 |= qVar2.g(z11) ? 67108864 : 33554432;
                    i24 = i14 & 512;
                    if (i24 == 0) {
                        i21 |= 805306368;
                    } else if ((i12 & 805306368) == 0) {
                        i25 = i24;
                        i21 |= qVar2.f(f10) ? 536870912 : 268435456;
                        i26 = i14 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                        if (i26 != 0) {
                            i28 = i13 | 6;
                            i27 = i26;
                        } else if ((i13 & 6) == 0) {
                            i27 = i26;
                            i28 = i13 | (qVar2.g(z12) ? 4 : 2);
                        } else {
                            i27 = i26;
                            i28 = i13;
                        }
                        i29 = i14 & 2048;
                        if (i29 != 0) {
                            i28 |= 48;
                        } else if ((i13 & 48) == 0) {
                            i28 |= qVar2.d(i11) ? 32 : 16;
                        }
                        if (qVar2.O(i21 & 1, (i21 & 306783379) == 306783378 || (i28 & 19) != 18)) {
                            Object obj = u2.l.f33918a;
                            if (i35 != 0) {
                                Object L = qVar2.L();
                                if (L == obj) {
                                    L = new t2(5);
                                    qVar2.h0(L);
                                }
                                aVar7 = (ho.a) L;
                                i31 = i29;
                            } else {
                                i31 = i29;
                                aVar7 = aVar4;
                            }
                            if (i17 != 0) {
                                Object L2 = qVar2.L();
                                if (L2 == obj) {
                                    L2 = new t2(6);
                                    qVar2.h0(L2);
                                }
                                aVar10 = (ho.a) L2;
                                i32 = 1;
                            } else {
                                i32 = 1;
                                aVar10 = aVar5;
                            }
                            if (i18 != 0) {
                                Object L3 = qVar2.L();
                                if (L3 == obj) {
                                    L3 = new t2(7);
                                    qVar2.h0(L3);
                                }
                                int i36 = i21;
                                aVar11 = (ho.a) L3;
                                i33 = i36;
                            } else {
                                i33 = i21;
                                aVar11 = aVar6;
                            }
                            int i37 = i23;
                            boolean z21 = i19 != 0 ? false : z13;
                            int i38 = i25;
                            boolean z22 = i20 != 0 ? false : z14;
                            if (i37 != 0) {
                                i34 = i27;
                                z19 = false;
                            } else {
                                i34 = i27;
                                z19 = z11;
                            }
                            if (i38 != 0) {
                                f12 = null;
                                z20 = false;
                            } else {
                                z20 = false;
                                f12 = f10;
                            }
                            boolean z23 = i34 != 0 ? z20 : z12;
                            int i39 = i31 != 0 ? i32 : i11;
                            Uri build = new Uri.Builder().scheme("android.resource").path(String.valueOf(i16)).build();
                            build.getClass();
                            qVar = qVar2;
                            m1885VideoPlayer_Ogyb9c(tVar, build, j10, aVar7, aVar10, aVar11, z21, z22, z19, f12, z23, i39, qVar, i33 & 2147483534, i28 & 126, 0);
                            aVar8 = aVar10;
                            aVar9 = aVar11;
                            z17 = z21;
                            z18 = z22;
                            z15 = z19;
                            f11 = f12;
                            z16 = z23;
                            i30 = i39;
                        } else {
                            qVar = qVar2;
                            qVar.R();
                            z15 = z11;
                            z16 = z12;
                            z17 = z13;
                            z18 = z14;
                            aVar7 = aVar4;
                            aVar8 = aVar5;
                            f11 = f10;
                            i30 = i11;
                            aVar9 = aVar6;
                        }
                        r10 = qVar.r();
                        if (r10 != null) {
                            final int i40 = i16;
                            final ho.a aVar12 = aVar7;
                            r10.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.z2
                                @Override // ho.p
                                public final Object invoke(Object obj2, Object obj3) {
                                    sn.z VideoPlayer__Ogyb9c$lambda$3;
                                    int intValue = ((Integer) obj3).intValue();
                                    VideoPlayer__Ogyb9c$lambda$3 = VideoPlayerKt.VideoPlayer__Ogyb9c$lambda$3(i3.t.this, i40, j4, aVar12, aVar8, aVar9, z17, z18, z15, f11, z16, i30, i12, i13, i14, (u2.m) obj2, intValue);
                                    return VideoPlayer__Ogyb9c$lambda$3;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i25 = i24;
                    i26 = i14 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                    if (i26 != 0) {
                    }
                    i29 = i14 & 2048;
                    if (i29 != 0) {
                    }
                    if (qVar2.O(i21 & 1, (i21 & 306783379) == 306783378 || (i28 & 19) != 18)) {
                    }
                    r10 = qVar.r();
                    if (r10 != null) {
                    }
                }
                i23 = i22;
                i24 = i14 & 512;
                if (i24 == 0) {
                }
                i25 = i24;
                i26 = i14 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i26 != 0) {
                }
                i29 = i14 & 2048;
                if (i29 != 0) {
                }
                if (qVar2.O(i21 & 1, (i21 & 306783379) == 306783378 || (i28 & 19) != 18)) {
                }
                r10 = qVar.r();
                if (r10 != null) {
                }
            }
            aVar5 = aVar2;
            i18 = i14 & 32;
            if (i18 != 0) {
            }
            i19 = i14 & 64;
            if (i19 != 0) {
            }
            i20 = i14 & 128;
            if (i20 != 0) {
            }
            i21 = i15;
            i22 = i14 & RpcError.MAX_MESSAGE_BYTES;
            if (i22 != 0) {
            }
            i23 = i22;
            i24 = i14 & 512;
            if (i24 == 0) {
            }
            i25 = i24;
            i26 = i14 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i26 != 0) {
            }
            i29 = i14 & 2048;
            if (i29 != 0) {
            }
            if (qVar2.O(i21 & 1, (i21 & 306783379) == 306783378 || (i28 & 19) != 18)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        aVar4 = aVar;
        i17 = i14 & 16;
        if (i17 == 0) {
        }
        aVar5 = aVar2;
        i18 = i14 & 32;
        if (i18 != 0) {
        }
        i19 = i14 & 64;
        if (i19 != 0) {
        }
        i20 = i14 & 128;
        if (i20 != 0) {
        }
        i21 = i15;
        i22 = i14 & RpcError.MAX_MESSAGE_BYTES;
        if (i22 != 0) {
        }
        i23 = i22;
        i24 = i14 & 512;
        if (i24 == 0) {
        }
        i25 = i24;
        i26 = i14 & UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i26 != 0) {
        }
        i29 = i14 & 2048;
        if (i29 != 0) {
        }
        if (qVar2.O(i21 & 1, (i21 & 306783379) == 306783378 || (i28 & 19) != 18)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }
}
