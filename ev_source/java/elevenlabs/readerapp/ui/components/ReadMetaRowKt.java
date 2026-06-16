package io.elevenlabs.readerapp.ui.components;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.domain.model.CoverImageSize;
import io.elevenlabs.domain.model.ListeningProgress;
import io.elevenlabs.domain.model.ListeningProgressKt;
import io.elevenlabs.domain.model.OfflineReadData;
import io.elevenlabs.domain.model.OfflineReadStatus;
import io.elevenlabs.domain.model.Rating;
import io.elevenlabs.domain.model.ReadCreationStatus;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.domain.model.ReadSource;
import io.elevenlabs.domain.model.SampleConfig;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.explore.BookCoverSize;
import io.elevenlabs.readerapp.ui.components.explore.ExploreBookCoverKt;
import io.elevenlabs.readerapp.ui.formatter.DateFormatterKt;
import io.elevenlabs.readerapp.ui.formatter.RateFormatterKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.format.DomainFormatterKt;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u000f\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0013\u001a\u000f\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/domain/model/ReadMeta;", "meta", "Li3/t;", "modifier", "Lsn/z;", "ReadMetaRow", "(Lio/elevenlabs/domain/model/ReadMeta;Li3/t;Lu2/m;II)V", "", "orderLabel", "", "markedUnread", "showAddedDate", "PublicReadMetaRow", "(Lio/elevenlabs/domain/model/ReadMeta;Li3/t;Ljava/lang/String;ZZLu2/m;II)V", "ReadMetaImageBox", "(Lio/elevenlabs/domain/model/ReadMeta;Lu2/m;I)V", "getErrorString", "(Lio/elevenlabs/domain/model/ReadMeta;Lu2/m;I)Ljava/lang/String;", "Preview_ReadMetaRow", "(Lu2/m;I)V", "Preview_ReadMetaRow_Downloading", "Preview_ReadMetaRow_ExpiringSoon", "Preview_ReadMetaRow_LongTitle", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadMetaRowKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadSource.values().length];
            try {
                iArr[ReadSource.File.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void Preview_ReadMetaRow(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1880981014);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ReadMetaRowKt.INSTANCE.m1079getLambda$1811222960$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 18);
        }
    }

    public static final sn.z Preview_ReadMetaRow$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReadMetaRow(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadMetaRow_Downloading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1058077211);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ReadMetaRowKt.INSTANCE.getLambda$403310923$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 17);
        }
    }

    public static final sn.z Preview_ReadMetaRow_Downloading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReadMetaRow_Downloading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadMetaRow_ExpiringSoon(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1275247764);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ReadMetaRowKt.INSTANCE.getLambda$1078111430$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 19);
        }
    }

    public static final sn.z Preview_ReadMetaRow_ExpiringSoon$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReadMetaRow_ExpiringSoon(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadMetaRow_LongTitle(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1696121209);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ReadMetaRowKt.INSTANCE.getLambda$1536680813$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 20);
        }
    }

    public static final sn.z Preview_ReadMetaRow_LongTitle$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReadMetaRow_LongTitle(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PublicReadMetaRow(ReadMeta readMeta, i3.t tVar, String str, boolean z6, boolean z10, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        String str2;
        int i15;
        int i16;
        boolean z11;
        int i17;
        int i18;
        boolean z12;
        int i19;
        boolean z13;
        u2.q qVar;
        i3.t tVar3;
        String str3;
        boolean z14;
        boolean z15;
        r1 r10;
        i3.t tVar4;
        String str4;
        boolean z16;
        String str5;
        Object obj;
        boolean z17;
        int i20;
        readMeta.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-36028469);
        if ((i10 & 6) == 0) {
            if (qVar2.h(readMeta)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 != 0) {
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
                str2 = str;
                if (qVar2.f(str2)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                i16 = i11 & 8;
                if (i16 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    z11 = z6;
                    if (qVar2.g(z11)) {
                        i17 = 2048;
                    } else {
                        i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i12 |= i17;
                    i18 = i11 & 16;
                    if (i18 == 0) {
                        i12 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        z12 = z10;
                        if (qVar2.g(z12)) {
                            i19 = 16384;
                        } else {
                            i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i12 |= i19;
                        if ((i12 & 9363) != 9362) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (qVar2.O(i12 & 1, z13)) {
                            if (i21 != 0) {
                                tVar4 = i3.q.f13017a;
                            } else {
                                tVar4 = tVar2;
                            }
                            String str6 = null;
                            if (i14 != 0) {
                                str4 = null;
                            } else {
                                str4 = str2;
                            }
                            if (i16 != 0) {
                                z16 = false;
                            } else {
                                z16 = z11;
                            }
                            if (i18 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            Rating rating = readMeta.getRating();
                            if (rating == null) {
                                qVar2.X(417923688);
                            } else {
                                qVar2.X(-263613255);
                                str6 = RateFormatterKt.formatRating(rating, qVar2, 0);
                            }
                            qVar2.p(false);
                            String str7 = str6;
                            String formatDate = DateFormatterKt.formatDate(readMeta.getAddedAt(), qVar2, 0);
                            boolean f10 = qVar2.f(str7);
                            Object L = qVar2.L();
                            Object obj2 = u2.l.f33918a;
                            if (!f10 && L != obj2) {
                                obj = obj2;
                                str5 = str4;
                            } else {
                                un.b o6 = ig.f.o();
                                if (str4 != null) {
                                    str5 = str4;
                                    o6.add(new CaptionItem(str4, null, null, 6, null));
                                } else {
                                    str5 = str4;
                                }
                                if (z15) {
                                    o6.add(new CaptionItem(formatDate, null, null, 6, null));
                                }
                                if (str7 != null) {
                                    obj = obj2;
                                    o6.add(new CaptionItem(str7, null, null, 6, null));
                                } else {
                                    obj = obj2;
                                }
                                L = ig.f.i(o6);
                                qVar2.h0(L);
                            }
                            List list = (List) L;
                            boolean f11 = qVar2.f(readMeta.getReadId()) | qVar2.e(readMeta.getLastListenedCharOffset()) | qVar2.f(readMeta.getLastListenedAudioSeconds());
                            Object L2 = qVar2.L();
                            if (f11 || L2 == obj) {
                                L2 = ListeningProgressKt.getListeningProgress(readMeta);
                                qVar2.h0(L2);
                            }
                            ListeningProgress listeningProgress = (ListeningProgress) L2;
                            String title = readMeta.getTitle();
                            String author = readMeta.getAuthor();
                            String description = readMeta.getDescription();
                            i3.t e10 = p2.e(tVar4, 1.0f);
                            if (readMeta.getCompletedAt() != null) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            qVar = qVar2;
                            ReadRowKt.ReadRow(title, author, description, e10, list, listeningProgress, z16, z17, ReadMetaKt.isAvailableOffline(readMeta), getErrorString(readMeta, qVar2, i12 & 14), null, c3.k.d(-1363091604, true, new fm.n(1, readMeta), qVar2), qVar, (i12 << 9) & 3670016, 48, UserMetadata.MAX_ATTRIBUTE_SIZE);
                            tVar3 = tVar4;
                            z14 = z16;
                            str3 = str5;
                        } else {
                            qVar = qVar2;
                            qVar.R();
                            tVar3 = tVar2;
                            str3 = str2;
                            z14 = z11;
                            z15 = z12;
                        }
                        r10 = qVar.r();
                        if (r10 != null) {
                            r10.f34012d = new e0(readMeta, tVar3, str3, z14, z15, i10, i11, 0);
                            return;
                        }
                        return;
                    }
                    z12 = z10;
                    if ((i12 & 9363) != 9362) {
                    }
                    if (qVar2.O(i12 & 1, z13)) {
                    }
                    r10 = qVar.r();
                    if (r10 != null) {
                    }
                }
                z11 = z6;
                i18 = i11 & 16;
                if (i18 == 0) {
                }
                z12 = z10;
                if ((i12 & 9363) != 9362) {
                }
                if (qVar2.O(i12 & 1, z13)) {
                }
                r10 = qVar.r();
                if (r10 != null) {
                }
            }
            str2 = str;
            i16 = i11 & 8;
            if (i16 != 0) {
            }
            z11 = z6;
            i18 = i11 & 16;
            if (i18 == 0) {
            }
            z12 = z10;
            if ((i12 & 9363) != 9362) {
            }
            if (qVar2.O(i12 & 1, z13)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        str2 = str;
        i16 = i11 & 8;
        if (i16 != 0) {
        }
        z11 = z6;
        i18 = i11 & 16;
        if (i18 == 0) {
        }
        z12 = z10;
        if ((i12 & 9363) != 9362) {
        }
        if (qVar2.O(i12 & 1, z13)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z PublicReadMetaRow$lambda$2(ReadMeta readMeta, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadMetaImageBox(readMeta, qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z PublicReadMetaRow$lambda$3(ReadMeta readMeta, i3.t tVar, String str, boolean z6, boolean z10, int i10, int i11, u2.m mVar, int i12) {
        PublicReadMetaRow(readMeta, tVar, str, z6, z10, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void ReadMetaImageBox(ReadMeta readMeta, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        u2.q qVar;
        int i12;
        readMeta.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(835951118);
        if ((i10 & 6) == 0) {
            if (qVar2.h(readMeta)) {
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
        if (qVar2.O(i11 & 1, z6)) {
            String coverImageUrl = ReadMetaKt.coverImageUrl(readMeta, CoverImageSize.Medium);
            qVar = qVar2;
            BookCoverSize bookCoverSize = BookCoverSize.Medium;
            long j4 = p3.x.f26437l;
            ExploreBookCoverKt.m1163ExploreBookCoverB29P9lA(coverImageUrl, bookCoverSize, null, t2.u.P, false, false, j4, j4, null, null, null, false, readMeta.getBlurPlaceholder(), readMeta.getCoverAspectRatio(), false, i3.d.f13001e, qVar, 14180400, 196608, 20268);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new f0(readMeta, i10, 0);
        }
    }

    public static final sn.z ReadMetaImageBox$lambda$0(ReadMeta readMeta, int i10, u2.m mVar, int i11) {
        ReadMetaImageBox(readMeta, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReadMetaRow(ReadMeta readMeta, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        i3.t tVar3;
        r1 r10;
        i3.t tVar4;
        boolean z10;
        boolean z11;
        int i14;
        c3.j jVar;
        int i15;
        int i16;
        readMeta.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-2019937305);
        if ((i10 & 6) == 0) {
            if (qVar.h(readMeta)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i10 | i16;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            boolean z12 = true;
            if ((i12 & 19) == 18) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                if (i17 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                String R = kj.c.R(qVar, R.string.read_details_sample);
                boolean f10 = qVar.f(readMeta.getSampleConfig()) | qVar.f(R);
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (f10 || L == eVar) {
                    un.b o6 = ig.f.o();
                    SampleConfig sampleConfig = readMeta.getSampleConfig();
                    if (sampleConfig != null && sampleConfig.isSample()) {
                        o6.add(new CaptionItem(R, Integer.valueOf(io.elevenlabs.ui.R.drawable.newspaper_1), null, null));
                    }
                    L = ig.f.i(o6);
                    qVar.h0(L);
                }
                List list = (List) L;
                boolean f11 = qVar.f(readMeta.getReadId()) | qVar.e(readMeta.getLastListenedCharOffset()) | qVar.f(readMeta.getLastListenedAudioSeconds());
                Object L2 = qVar.L();
                if (f11 || L2 == eVar) {
                    L2 = ListeningProgressKt.getListeningProgress(readMeta);
                    qVar.h0(L2);
                }
                ListeningProgress listeningProgress = (ListeningProgress) L2;
                OfflineReadData offlineReadData = readMeta.getOfflineReadData();
                if (offlineReadData != null && OfflineReadData.isExpiringSoon$default(offlineReadData, 0L, 1, null)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                String R2 = kj.c.R(qVar, R.string.read_list_row_chapters_expiring_soon);
                boolean z13 = z10;
                String title = readMeta.getTitle();
                String author = readMeta.getAuthor();
                if (author == null) {
                    qVar.X(835485741);
                    String url = readMeta.getUrl();
                    if (url == null) {
                        qVar.X(835485740);
                        qVar.p(false);
                        author = null;
                    } else {
                        qVar.X(165498485);
                        author = DomainFormatterKt.formatDomain(url, qVar, 0);
                        qVar.p(false);
                    }
                } else {
                    qVar.X(165497710);
                }
                qVar.p(false);
                if (author == null) {
                    qVar.X(835514478);
                    String originalFileType = readMeta.getOriginalFileType();
                    if (kotlin.jvm.internal.m.c(originalFileType, "application/pdf")) {
                        qVar.X(165501144);
                        author = kj.c.R(qVar, R.string.read_mimetype_pdf_import);
                        qVar.p(false);
                    } else if (kotlin.jvm.internal.m.c(originalFileType, "text/plain")) {
                        qVar.X(165503634);
                        author = kj.c.R(qVar, R.string.read_mimetype_text);
                        qVar.p(false);
                    } else {
                        qVar.X(835712134);
                        ReadSource source = readMeta.getSource();
                        if (source == null) {
                            i15 = -1;
                        } else {
                            i15 = WhenMappings.$EnumSwitchMapping$0[source.ordinal()];
                        }
                        if (i15 == 1) {
                            qVar.X(165507481);
                            author = kj.c.R(qVar, R.string.read_mimetype_file_import);
                            qVar.p(false);
                        } else {
                            qVar.X(835837590);
                            qVar.p(false);
                            author = null;
                        }
                        qVar.p(false);
                    }
                    qVar.p(false);
                } else {
                    qVar.X(165498079);
                    qVar.p(false);
                }
                String description = readMeta.getDescription();
                boolean markedAsUnread = readMeta.getMarkedAsUnread();
                if (readMeta.getCompletedAt() != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean isAvailableOffline = ReadMetaKt.isAvailableOffline(readMeta);
                String errorString = getErrorString(readMeta, qVar, i12 & 14);
                if (z13) {
                    qVar.X(836264833);
                    i14 = i12;
                    z12 = true;
                    jVar = c3.k.d(-313341209, true, new id.b(R2, 1, (byte) 0), qVar);
                    qVar.p(false);
                } else {
                    i14 = i12;
                    qVar.X(836327391);
                    qVar.p(false);
                    jVar = null;
                }
                ReadRowKt.ReadRow(title, author, description, tVar4, list, listeningProgress, markedAsUnread, z11, isAvailableOffline, errorString, jVar, c3.k.d(2017403046, z12, new fm.n(2, readMeta), qVar), qVar, (i14 << 6) & 7168, 48, 0);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new g0(readMeta, tVar3, i10, i11, 0);
                return;
            }
            return;
        }
        tVar2 = tVar;
        boolean z122 = true;
        if ((i12 & 19) == 18) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z ReadMetaRow$lambda$2(String str, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ExpiryBadgeKt.ExpiryBadge(str, null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadMetaRow$lambda$3(ReadMeta readMeta, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadMetaImageBox(readMeta, qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadMetaRow$lambda$4(ReadMeta readMeta, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        ReadMetaRow(readMeta, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final String getErrorString(ReadMeta readMeta, u2.m mVar, int i10) {
        OfflineReadStatus offlineReadStatus;
        readMeta.getClass();
        ReadCreationStatus creationStatus = readMeta.getCreationStatus();
        ReadCreationStatus readCreationStatus = ReadCreationStatus.Failed;
        if (creationStatus == readCreationStatus && readMeta.getSource() == ReadSource.Podcast) {
            u2.q qVar = (u2.q) mVar;
            qVar.X(400041597);
            String R = kj.c.R(qVar, R.string.genfm_read_row_podcast_failed_description);
            qVar.p(false);
            return R;
        }
        if (readMeta.getCreationStatus() == readCreationStatus) {
            u2.q qVar2 = (u2.q) mVar;
            qVar2.X(400182089);
            String R2 = kj.c.R(qVar2, R.string.library_document_import_error);
            qVar2.p(false);
            return R2;
        }
        OfflineReadData offlineReadData = readMeta.getOfflineReadData();
        OfflineReadStatus offlineReadStatus2 = null;
        if (offlineReadData != null) {
            offlineReadStatus = offlineReadData.getStatus();
        } else {
            offlineReadStatus = null;
        }
        if (offlineReadStatus == OfflineReadStatus.EXPIRED) {
            u2.q qVar3 = (u2.q) mVar;
            qVar3.X(400320287);
            String R3 = kj.c.R(qVar3, R.string.read_list_row_download_expired_subtitle);
            qVar3.p(false);
            return R3;
        }
        OfflineReadData offlineReadData2 = readMeta.getOfflineReadData();
        if (offlineReadData2 != null) {
            offlineReadStatus2 = offlineReadData2.getStatus();
        }
        if (offlineReadStatus2 == OfflineReadStatus.ERROR) {
            u2.q qVar4 = (u2.q) mVar;
            qVar4.X(400466049);
            String R4 = kj.c.R(qVar4, R.string.read_list_row_download_error_subtitle);
            qVar4.p(false);
            return R4;
        }
        u2.q qVar5 = (u2.q) mVar;
        qVar5.X(400547517);
        qVar5.p(false);
        return "";
    }
}
