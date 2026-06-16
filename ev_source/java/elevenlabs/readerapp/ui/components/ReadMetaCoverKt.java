package io.elevenlabs.readerapp.ui.components;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.CoverImageSize;
import io.elevenlabs.domain.model.OfflineReadData;
import io.elevenlabs.domain.model.OfflineReadStatus;
import io.elevenlabs.domain.model.ReadCreationStatus;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.readerapp.ui.resources.ReadCoverFallbackResourceKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.LoaderKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.theme.ReaderColors;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.y2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/elevenlabs/domain/model/ReadMeta;", "meta", "Li3/t;", "modifier", "Lkotlin/Function0;", "Lsn/z;", "cover", "ReadMetaCover", "(Lio/elevenlabs/domain/model/ReadMeta;Li3/t;Lho/p;Lu2/m;II)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadMetaCoverKt {
    /* JADX WARN: Removed duplicated region for block: B:110:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReadMetaCover(ReadMeta readMeta, i3.t tVar, ho.p pVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        ho.p pVar2;
        int i15;
        boolean z6;
        i3.t tVar3;
        ho.p pVar3;
        r1 r10;
        ho.p pVar4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        h4.d dVar;
        h4.e eVar;
        h4.e eVar2;
        ReadCreationStatus readCreationStatus;
        u2.q qVar;
        boolean z15;
        ho.p pVar5;
        boolean z16;
        Integer num;
        int i16;
        readMeta.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(699652878);
        if ((i10 & 6) == 0) {
            if (qVar2.h(readMeta)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                pVar2 = pVar;
                if (qVar2.h(pVar2)) {
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
                if (qVar2.O(i12 & 1, z6)) {
                    i3.t tVar4 = i3.q.f13017a;
                    if (i17 != 0) {
                        tVar2 = tVar4;
                    }
                    if (i14 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar2;
                    }
                    if (readMeta.getCreationStatus() == ReadCreationStatus.Failed) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ReadCreationStatus creationStatus = readMeta.getCreationStatus();
                    ReadCreationStatus readCreationStatus2 = ReadCreationStatus.Pending;
                    if (creationStatus != readCreationStatus2 && readMeta.getCreationStatus() != ReadCreationStatus.Creating) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    OfflineReadData offlineReadData = readMeta.getOfflineReadData();
                    if (offlineReadData != null && offlineReadData.getStatus() == OfflineReadStatus.DOWNLOADING) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (offlineReadData != null && offlineReadData.getStatus() == OfflineReadStatus.ERROR) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z11 && !z10 && !z12 && !z13) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    i3.l lVar = i3.d.f12997a;
                    f4.f1 d10 = r1.p.d(lVar, false);
                    int hashCode = Long.hashCode(qVar2.T);
                    c3.o l4 = qVar2.l();
                    i3.t c5 = i3.a.c(tVar2, qVar2);
                    h4.h.f11920i.getClass();
                    h4.f fVar = h4.g.f11903b;
                    qVar2.b0();
                    if (qVar2.S) {
                        qVar2.k(fVar);
                    } else {
                        qVar2.k0();
                    }
                    h4.e eVar3 = h4.g.f11907f;
                    u2.r.J(eVar3, d10, qVar2);
                    h4.e eVar4 = h4.g.f11906e;
                    u2.r.J(eVar4, l4, qVar2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    h4.e eVar5 = h4.g.f11908g;
                    u2.r.y(qVar2, valueOf, eVar5);
                    h4.d dVar2 = h4.g.f11909h;
                    u2.r.F(dVar2, qVar2);
                    int i18 = i12;
                    h4.e eVar6 = h4.g.f11905d;
                    u2.r.J(eVar6, c5, qVar2);
                    p3.w0 w0Var = p3.h0.f26395b;
                    i3.t tVar5 = tVar2;
                    if (z14) {
                        tVar4 = m3.h.b(tVar4, 6, w0Var);
                    }
                    f4.f1 d11 = r1.p.d(lVar, false);
                    int hashCode2 = Long.hashCode(qVar2.T);
                    c3.o l7 = qVar2.l();
                    i3.t c10 = i3.a.c(tVar4, qVar2);
                    qVar2.b0();
                    if (qVar2.S) {
                        qVar2.k(fVar);
                    } else {
                        qVar2.k0();
                    }
                    u2.r.J(eVar3, d11, qVar2);
                    u2.r.J(eVar4, l7, qVar2);
                    defpackage.f.u(hashCode2, qVar2, eVar5, qVar2, dVar2);
                    u2.r.J(eVar6, c10, qVar2);
                    if (pVar4 != null) {
                        qVar2.X(201342297);
                        j0.c.q((i18 >> 6) & 14, pVar4, qVar2, false);
                        eVar = eVar5;
                        qVar = qVar2;
                        eVar2 = eVar4;
                        dVar = dVar2;
                        readCreationStatus = readCreationStatus2;
                    } else {
                        qVar2.X(201396485);
                        dVar = dVar2;
                        eVar = eVar5;
                        eVar2 = eVar4;
                        readCreationStatus = readCreationStatus2;
                        ReadRowKt.ReadCover(readMeta.isBookType(), readMeta.getTitle(), ReadMetaKt.coverImageUrl(readMeta, CoverImageSize.Thumbnail), ReadCoverFallbackResourceKt.readCoverFallbackResource(readMeta.getSource(), readMeta.getOriginalFileType()), qVar2, 0);
                        qVar = qVar2;
                        qVar.p(false);
                    }
                    qVar.p(true);
                    if (z14) {
                        qVar.X(1135124758);
                        i3.t a10 = r1.t.f29349a.a();
                        EchoTheme echoTheme = EchoTheme.INSTANCE;
                        int i19 = EchoTheme.$stable;
                        ho.p pVar6 = pVar4;
                        boolean z17 = z10;
                        i3.t h10 = l1.n.h(a10, p3.x.b(0.8f, echoTheme.getColors(qVar, i19).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable)), w0Var);
                        f4.f1 d12 = r1.p.d(i3.d.f13001e, false);
                        int hashCode3 = Long.hashCode(qVar.T);
                        c3.o l10 = qVar.l();
                        i3.t c11 = i3.a.c(h10, qVar);
                        qVar.b0();
                        if (qVar.S) {
                            qVar.k(fVar);
                        } else {
                            qVar.k0();
                        }
                        u2.r.J(eVar3, d12, qVar);
                        u2.r.J(eVar2, l10, qVar);
                        defpackage.f.u(hashCode3, qVar, eVar, qVar, dVar);
                        u2.r.J(eVar6, c11, qVar);
                        if (z13 || z17) {
                            pVar5 = pVar6;
                            z16 = false;
                            u2.q qVar3 = qVar;
                            z15 = true;
                            qVar3.X(-994094212);
                            y2.a(kd.a.M(R.drawable.triangle_exclamation, qVar3, 0), null, null, echoTheme.getColors(qVar3, i19).getIcon().getTertiary(qVar3, EchoThemeColors.Icon.$stable), qVar3, u3.c.$stable | 48, 4);
                            qVar2 = qVar3;
                            qVar2.p(false);
                        } else if (z12 && offlineReadData != null) {
                            qVar.X(-993778074);
                            int overallProgressPercent = offlineReadData.getOverallProgressPercent();
                            if (overallProgressPercent > 0) {
                                qVar.X(-993651873);
                                u2.q qVar4 = qVar;
                                z16 = false;
                                pVar5 = pVar6;
                                z15 = true;
                                j7.d(overallProgressPercent + Separators.PERCENT, null, echoTheme.getColors(qVar, i19).getText().getSecondary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i19).getSmRegular500(qVar, EchoThemeTypography.$stable), qVar4, 0, 0, 131066);
                                qVar2 = qVar4;
                                qVar2.p(false);
                            } else {
                                pVar5 = pVar6;
                                z16 = false;
                                qVar2 = qVar;
                                z15 = true;
                                LoaderKt.m1840LoadereopBjH0(null, ib.i.g(-993405764, i19, echoTheme, qVar2, qVar2).getSecondary(qVar2, EchoThemeColors.Text.$stable), ReaderColors.Transparent.INSTANCE.m2490getClear0d7_KjU(), null, qVar2, 0, 9);
                                qVar2.p(false);
                            }
                            qVar2.p(z16);
                        } else {
                            pVar5 = pVar6;
                            z16 = false;
                            qVar2 = qVar;
                            z15 = true;
                            qVar2.X(-993153641);
                            Object L = qVar2.L();
                            if (L == u2.l.f33918a) {
                                Float creationProgress = readMeta.getCreationProgress();
                                if (creationProgress != null) {
                                    L = Integer.valueOf((int) (creationProgress.floatValue() * 100));
                                } else {
                                    L = null;
                                }
                                qVar2.h0(L);
                            }
                            Integer num2 = (Integer) L;
                            if (num2 != null && readMeta.getCreationStatus() != readCreationStatus) {
                                num = num2;
                            } else {
                                num = null;
                            }
                            LoaderKt.m1840LoadereopBjH0(null, echoTheme.getColors(qVar2, i19).getText().getSecondary(qVar2, EchoThemeColors.Text.$stable), ReaderColors.Transparent.INSTANCE.m2490getClear0d7_KjU(), num, qVar2, 0, 1);
                            qVar2.p(false);
                        }
                        qVar2.p(z15);
                        qVar2.p(z16);
                    } else {
                        z15 = true;
                        qVar2 = qVar;
                        pVar5 = pVar4;
                        qVar2.X(1136789210);
                        qVar2.p(false);
                    }
                    qVar2.p(z15);
                    pVar3 = pVar5;
                    tVar3 = tVar5;
                } else {
                    qVar2.R();
                    tVar3 = tVar2;
                    pVar3 = pVar2;
                }
                r10 = qVar2.r();
                if (r10 != null) {
                    r10.f34012d = new fm.f(readMeta, tVar3, pVar3, i10, i11, 14, false);
                    return;
                }
                return;
            }
            pVar2 = pVar;
            if ((i12 & 147) != 146) {
            }
            if (qVar2.O(i12 & 1, z6)) {
            }
            r10 = qVar2.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        pVar2 = pVar;
        if ((i12 & 147) != 146) {
        }
        if (qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar2.r();
        if (r10 != null) {
        }
    }

    public static final sn.z ReadMetaCover$lambda$1(ReadMeta readMeta, i3.t tVar, ho.p pVar, int i10, int i11, u2.m mVar, int i12) {
        ReadMetaCover(readMeta, tVar, pVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}
