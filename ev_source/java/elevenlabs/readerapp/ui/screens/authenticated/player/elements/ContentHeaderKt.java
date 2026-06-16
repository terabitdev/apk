package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import io.elevenlabs.domain.model.PlayerFontFamily;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.UserConfig;
import io.elevenlabs.readerapp.ui.formatter.DateFormatterKt;
import io.elevenlabs.readerapp.ui.previews.ReadsFactoryKt;
import io.elevenlabs.readerapp.ui.previews.UserConfigFactoryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.j1;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.elevenlabs.ui.format.DomainFormatterKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsTypographyKt;
import io.livekit.android.rpc.RpcError;
import ir.z1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import q2.j7;
import r1.p2;
import r1.u0;
import s4.y0;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a7\u0010\b\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000b\u001a\u000f\u0010\u000e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lir/z1;", "Lio/elevenlabs/domain/model/ReadMeta;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;", "config", "Lkotlin/Function0;", "Lsn/z;", "onTitleClick", "ContentHeader", "(Lir/z1;Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;Lho/a;Lu2/m;II)V", "Preview_ContentHeader_AllData", "(Lu2/m;I)V", "Preview_ContentHeader_NoAuthor", "Preview_ContentHeader_NoUrl", "Preview_ContentHeader_Font", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ContentHeaderKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayerFontFamily.values().length];
            try {
                iArr[PlayerFontFamily.LIBRE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerFontFamily.OPEN_DYSLEXIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayerFontFamily.INTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x005f  */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContentHeader(final z1 z1Var, final UserConfig.PlayerConfig playerConfig, ho.a aVar, u2.m mVar, final int i10, final int i11) {
        int i12;
        ho.a aVar2;
        int i13;
        boolean z6;
        final ho.a aVar3;
        u2.q qVar;
        r1 r10;
        ho.p pVar;
        final ho.a aVar4;
        w4.u libre;
        ?? r22;
        String formatDomain;
        int i14;
        int i15;
        z1Var.getClass();
        playerConfig.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1891825707);
        if ((i10 & 6) == 0) {
            if (qVar2.h(z1Var)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(playerConfig)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            aVar2 = aVar;
            if (qVar2.h(aVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar2.O(i12 & 1, z6)) {
                Object obj = u2.l.f33918a;
                if (i16 != 0) {
                    Object L = qVar2.L();
                    if (L == obj) {
                        L = new c(3);
                        qVar2.h0(L);
                    }
                    aVar4 = (ho.a) L;
                } else {
                    aVar4 = aVar2;
                }
                Object L2 = qVar2.L();
                if (L2 == obj) {
                    L2 = new o(9);
                    qVar2.h0(L2);
                }
                ReadMeta readMeta = (ReadMeta) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L2, qVar2, (i12 & 14) | 48).getValue();
                if (readMeta == null) {
                    r10 = qVar2.r();
                    if (r10 != null) {
                        final int i17 = 0;
                        pVar = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.h
                            @Override // ho.p
                            public final Object invoke(Object obj2, Object obj3) {
                                sn.z ContentHeader$lambda$2;
                                sn.z ContentHeader$lambda$4;
                                switch (i17) {
                                    case 0:
                                        int intValue = ((Integer) obj3).intValue();
                                        ContentHeader$lambda$2 = ContentHeaderKt.ContentHeader$lambda$2(z1Var, playerConfig, aVar4, i10, i11, (u2.m) obj2, intValue);
                                        return ContentHeader$lambda$2;
                                    default:
                                        int intValue2 = ((Integer) obj3).intValue();
                                        ContentHeader$lambda$4 = ContentHeaderKt.ContentHeader$lambda$4(z1Var, playerConfig, aVar4, i10, i11, (u2.m) obj2, intValue2);
                                        return ContentHeader$lambda$4;
                                }
                            }
                        };
                        r10.f34012d = pVar;
                        return;
                    }
                    return;
                }
                ho.a aVar5 = aVar4;
                u0 u0Var = r1.j.f29228a;
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i18 = ElevenLabsTheme.$stable;
                r1.x a10 = r1.w.a(r1.j.g(elevenLabsTheme.getSpacings(qVar2, i18).m2355getX3D9Ej5fM()), i3.d.B0, qVar2, 0);
                int hashCode = Long.hashCode(qVar2.T);
                c3.o l4 = qVar2.l();
                i3.q qVar3 = i3.q.f13017a;
                i3.t c5 = i3.a.c(qVar3, qVar2);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                u2.r.J(h4.g.f11907f, a10, qVar2);
                u2.r.J(h4.g.f11906e, l4, qVar2);
                u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
                u2.r.F(h4.g.f11909h, qVar2);
                u2.r.J(h4.g.f11905d, c5, qVar2);
                int i19 = WhenMappings.$EnumSwitchMapping$0[playerConfig.getFontFamily().ordinal()];
                if (i19 != 1) {
                    if (i19 != 2) {
                        if (i19 == 3) {
                            libre = ElevenLabsTypographyKt.getInter();
                        } else {
                            c6.p();
                            return;
                        }
                    } else {
                        libre = ElevenLabsTypographyKt.getOpenDyslexic();
                    }
                } else {
                    libre = ElevenLabsTypographyKt.getLibre();
                }
                w4.u uVar = libre;
                ButtonContainerKt.m1780ButtonContainer83mGB3Q(readMeta.getTitle(), aVar5, null, 0L, false, 0, null, false, null, c3.k.d(1609201083, true, new defpackage.b(readMeta, uVar, 10), qVar2), qVar2, ((i12 >> 3) & 112) | 805306368, 508);
                String author = readMeta.getAuthor();
                String url = readMeta.getUrl();
                if (url == null) {
                    qVar2.X(-1849458700);
                    r22 = 0;
                    qVar2.p(false);
                    formatDomain = null;
                } else {
                    r22 = 0;
                    qVar2.X(-1029491283);
                    formatDomain = DomainFormatterKt.formatDomain(url, qVar2, 0);
                    qVar2.p(false);
                }
                String publicationDate = readMeta.getPublicationDate();
                if (publicationDate == null) {
                    qVar2.X(-1029488661);
                    publicationDate = DateFormatterKt.formatDate(readMeta.getAddedAt(), qVar2, r22);
                } else {
                    qVar2.X(-1029489808);
                }
                qVar2.p(r22);
                boolean f10 = qVar2.f(author) | qVar2.f(formatDomain) | qVar2.f(publicationDate);
                Object L3 = qVar2.L();
                if (f10 || L3 == obj) {
                    L3 = tn.o.E0(tn.n.F0(new String[]{author, formatDomain, publicationDate}), " • ", null, null, null, 62);
                    qVar2.h0(L3);
                }
                j7.d((String) L3, null, ib.i.w(elevenLabsTheme, qVar2, i18), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, y0.a(elevenLabsTheme.getTypo(qVar2, i18).getBodyXSmall500(), 0L, 0L, null, uVar, null, 0L, 0, 0L, null, null, 16777183), qVar2, 0, 0, 131066);
                u2.q qVar4 = qVar2;
                DividerKt.m1827DivideriJQMabo(p2.e(qVar3, 1.0f), elevenLabsTheme.getColor(qVar4, i18).getDivider().m2058getLightLine0d7_KjU(), qVar4, 6, 0);
                qVar4.p(true);
                aVar3 = aVar5;
                qVar = qVar4;
            } else {
                qVar2.R();
                aVar3 = aVar2;
                qVar = qVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                final int i20 = 1;
                pVar = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.h
                    @Override // ho.p
                    public final Object invoke(Object obj2, Object obj3) {
                        sn.z ContentHeader$lambda$2;
                        sn.z ContentHeader$lambda$4;
                        switch (i20) {
                            case 0:
                                int intValue = ((Integer) obj3).intValue();
                                ContentHeader$lambda$2 = ContentHeaderKt.ContentHeader$lambda$2(z1Var, playerConfig, aVar3, i10, i11, (u2.m) obj2, intValue);
                                return ContentHeader$lambda$2;
                            default:
                                int intValue2 = ((Integer) obj3).intValue();
                                ContentHeader$lambda$4 = ContentHeaderKt.ContentHeader$lambda$4(z1Var, playerConfig, aVar3, i10, i11, (u2.m) obj2, intValue2);
                                return ContentHeader$lambda$4;
                        }
                    }
                };
                r10.f34012d = pVar;
                return;
            }
            return;
        }
        aVar2 = aVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z ContentHeader$lambda$2(z1 z1Var, UserConfig.PlayerConfig playerConfig, ho.a aVar, int i10, int i11, u2.m mVar, int i12) {
        ContentHeader(z1Var, playerConfig, aVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final sn.z ContentHeader$lambda$3$0(ReadMeta readMeta, w4.u uVar, r1.s sVar, u2.m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            j7.d(readMeta.getTitle(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, y0.a(ElevenLabsTheme.INSTANCE.getTypo(qVar, ElevenLabsTheme.$stable).getTitleLarge700Inter(), 0L, 0L, null, uVar, null, 0L, 0, 0L, null, null, 16777183), qVar, 0, 0, 131070);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ContentHeader$lambda$4(z1 z1Var, UserConfig.PlayerConfig playerConfig, ho.a aVar, int i10, int i11, u2.m mVar, int i12) {
        ContentHeader(z1Var, playerConfig, aVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_ContentHeader_AllData(u2.m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1224958148);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            copy = r5.copy((r84 & 1) != 0 ? r5.articleImageUrl : null, (r84 & 2) != 0 ? r5.author : null, (r84 & 4) != 0 ? r5.chapters : null, (r84 & 8) != 0 ? r5.charCount : 0L, (r84 & 16) != 0 ? r5.createdAt : null, (r84 & 32) != 0 ? r5.updatedAt : null, (r84 & 64) != 0 ? r5.addedAt : null, (r84 & 128) != 0 ? r5.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r5.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r5.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r5.source : null, (r84 & 2048) != 0 ? r5.title : null, (r84 & 4096) != 0 ? r5.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r5.url : null, (r84 & 16384) != 0 ? r5.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r5.originalFileType : null, (r84 & 65536) != 0 ? r5.hasOriginalAudio : false, (r84 & 131072) != 0 ? r5.matureContent : false, (r84 & 262144) != 0 ? r5.origin : null, (r84 & 524288) != 0 ? r5.contentType : null, (r84 & 1048576) != 0 ? r5.genre : null, (r84 & 2097152) != 0 ? r5.isBookType : false, (r84 & 4194304) != 0 ? r5.fromUserImport : false, (r84 & 8388608) != 0 ? r5.rating : null, (r84 & 16777216) != 0 ? r5.userRating : null, (r84 & 33554432) != 0 ? r5.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r5.creationStatus : null, (r84 & 134217728) != 0 ? r5.creationProgress : null, (r84 & 268435456) != 0 ? r5.isArchived : false, (r84 & 536870912) != 0 ? r5.markedAsUnread : false, (r84 & 1073741824) != 0 ? r5.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r5.publicationDate : "2025-05-22", (r85 & 1) != 0 ? r5.language : null, (r85 & 2) != 0 ? r5.publisherProfileId : null, (r85 & 4) != 0 ? r5.canDelete : false, (r85 & 8) != 0 ? r5.androidProductId : null, (r85 & 16) != 0 ? r5.isPaid : false, (r85 & 32) != 0 ? r5.offlineReadData : null, (r85 & 64) != 0 ? r5.previewAudio : null, (r85 & 128) != 0 ? r5.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r5.voiceSelectionConfig : null, (r85 & 512) != 0 ? r5.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r5.displayMode : null, (r85 & 2048) != 0 ? r5.inUserLibrary : false, (r85 & 4096) != 0 ? r5.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r5.audioType : null, (r85 & 16384) != 0 ? r5.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r5.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r5.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r5.audioDurationSeconds : null, (r85 & 262144) != 0 ? r5.audioTypes : null, (r85 & 524288) != 0 ? r5.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r5.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r5.coverImageUrls : null, (r85 & 4194304) != 0 ? r5.coverAspectRatio : null, (r85 & 8388608) != 0 ? ((ReadMeta) tn.o.w0(ReadsFactoryKt.stubReadMetaList$default(0, null, 3, null))).blurPlaceholder : null);
            ContentHeader(ir.r.c(copy), UserConfigFactoryKt.stubPlayerConfig(), null, qVar, 0, 4);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 15);
        }
    }

    public static final sn.z Preview_ContentHeader_AllData$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ContentHeader_AllData(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ContentHeader_Font(u2.m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-13709916);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            copy = r5.copy((r84 & 1) != 0 ? r5.articleImageUrl : null, (r84 & 2) != 0 ? r5.author : null, (r84 & 4) != 0 ? r5.chapters : null, (r84 & 8) != 0 ? r5.charCount : 0L, (r84 & 16) != 0 ? r5.createdAt : null, (r84 & 32) != 0 ? r5.updatedAt : null, (r84 & 64) != 0 ? r5.addedAt : null, (r84 & 128) != 0 ? r5.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r5.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r5.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r5.source : null, (r84 & 2048) != 0 ? r5.title : null, (r84 & 4096) != 0 ? r5.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r5.url : null, (r84 & 16384) != 0 ? r5.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r5.originalFileType : null, (r84 & 65536) != 0 ? r5.hasOriginalAudio : false, (r84 & 131072) != 0 ? r5.matureContent : false, (r84 & 262144) != 0 ? r5.origin : null, (r84 & 524288) != 0 ? r5.contentType : null, (r84 & 1048576) != 0 ? r5.genre : null, (r84 & 2097152) != 0 ? r5.isBookType : false, (r84 & 4194304) != 0 ? r5.fromUserImport : false, (r84 & 8388608) != 0 ? r5.rating : null, (r84 & 16777216) != 0 ? r5.userRating : null, (r84 & 33554432) != 0 ? r5.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r5.creationStatus : null, (r84 & 134217728) != 0 ? r5.creationProgress : null, (r84 & 268435456) != 0 ? r5.isArchived : false, (r84 & 536870912) != 0 ? r5.markedAsUnread : false, (r84 & 1073741824) != 0 ? r5.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r5.publicationDate : null, (r85 & 1) != 0 ? r5.language : null, (r85 & 2) != 0 ? r5.publisherProfileId : null, (r85 & 4) != 0 ? r5.canDelete : false, (r85 & 8) != 0 ? r5.androidProductId : null, (r85 & 16) != 0 ? r5.isPaid : false, (r85 & 32) != 0 ? r5.offlineReadData : null, (r85 & 64) != 0 ? r5.previewAudio : null, (r85 & 128) != 0 ? r5.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r5.voiceSelectionConfig : null, (r85 & 512) != 0 ? r5.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r5.displayMode : null, (r85 & 2048) != 0 ? r5.inUserLibrary : false, (r85 & 4096) != 0 ? r5.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r5.audioType : null, (r85 & 16384) != 0 ? r5.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r5.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r5.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r5.audioDurationSeconds : null, (r85 & 262144) != 0 ? r5.audioTypes : null, (r85 & 524288) != 0 ? r5.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r5.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r5.coverImageUrls : null, (r85 & 4194304) != 0 ? r5.coverAspectRatio : null, (r85 & 8388608) != 0 ? ((ReadMeta) tn.o.w0(ReadsFactoryKt.stubReadMetaList$default(0, null, 3, null))).blurPlaceholder : null);
            ContentHeader(ir.r.c(copy), UserConfig.PlayerConfig.copy$default(UserConfigFactoryKt.stubPlayerConfig(), 0L, PlayerFontFamily.INTER, null, null, null, 29, null), null, qVar, 0, 4);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 14);
        }
    }

    public static final sn.z Preview_ContentHeader_Font$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ContentHeader_Font(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ContentHeader_NoAuthor(u2.m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-453916185);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            copy = r5.copy((r84 & 1) != 0 ? r5.articleImageUrl : null, (r84 & 2) != 0 ? r5.author : null, (r84 & 4) != 0 ? r5.chapters : null, (r84 & 8) != 0 ? r5.charCount : 0L, (r84 & 16) != 0 ? r5.createdAt : null, (r84 & 32) != 0 ? r5.updatedAt : null, (r84 & 64) != 0 ? r5.addedAt : null, (r84 & 128) != 0 ? r5.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r5.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r5.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r5.source : null, (r84 & 2048) != 0 ? r5.title : null, (r84 & 4096) != 0 ? r5.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r5.url : null, (r84 & 16384) != 0 ? r5.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r5.originalFileType : null, (r84 & 65536) != 0 ? r5.hasOriginalAudio : false, (r84 & 131072) != 0 ? r5.matureContent : false, (r84 & 262144) != 0 ? r5.origin : null, (r84 & 524288) != 0 ? r5.contentType : null, (r84 & 1048576) != 0 ? r5.genre : null, (r84 & 2097152) != 0 ? r5.isBookType : false, (r84 & 4194304) != 0 ? r5.fromUserImport : false, (r84 & 8388608) != 0 ? r5.rating : null, (r84 & 16777216) != 0 ? r5.userRating : null, (r84 & 33554432) != 0 ? r5.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r5.creationStatus : null, (r84 & 134217728) != 0 ? r5.creationProgress : null, (r84 & 268435456) != 0 ? r5.isArchived : false, (r84 & 536870912) != 0 ? r5.markedAsUnread : false, (r84 & 1073741824) != 0 ? r5.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r5.publicationDate : null, (r85 & 1) != 0 ? r5.language : null, (r85 & 2) != 0 ? r5.publisherProfileId : null, (r85 & 4) != 0 ? r5.canDelete : false, (r85 & 8) != 0 ? r5.androidProductId : null, (r85 & 16) != 0 ? r5.isPaid : false, (r85 & 32) != 0 ? r5.offlineReadData : null, (r85 & 64) != 0 ? r5.previewAudio : null, (r85 & 128) != 0 ? r5.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r5.voiceSelectionConfig : null, (r85 & 512) != 0 ? r5.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r5.displayMode : null, (r85 & 2048) != 0 ? r5.inUserLibrary : false, (r85 & 4096) != 0 ? r5.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r5.audioType : null, (r85 & 16384) != 0 ? r5.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r5.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r5.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r5.audioDurationSeconds : null, (r85 & 262144) != 0 ? r5.audioTypes : null, (r85 & 524288) != 0 ? r5.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r5.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r5.coverImageUrls : null, (r85 & 4194304) != 0 ? r5.coverAspectRatio : null, (r85 & 8388608) != 0 ? ((ReadMeta) tn.o.w0(ReadsFactoryKt.stubReadMetaList$default(0, null, 3, null))).blurPlaceholder : null);
            ContentHeader(ir.r.c(copy), UserConfigFactoryKt.stubPlayerConfig(), null, qVar, 0, 4);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 13);
        }
    }

    public static final sn.z Preview_ContentHeader_NoAuthor$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ContentHeader_NoAuthor(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ContentHeader_NoUrl(u2.m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-209750623);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            copy = r5.copy((r84 & 1) != 0 ? r5.articleImageUrl : null, (r84 & 2) != 0 ? r5.author : null, (r84 & 4) != 0 ? r5.chapters : null, (r84 & 8) != 0 ? r5.charCount : 0L, (r84 & 16) != 0 ? r5.createdAt : null, (r84 & 32) != 0 ? r5.updatedAt : null, (r84 & 64) != 0 ? r5.addedAt : null, (r84 & 128) != 0 ? r5.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r5.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r5.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r5.source : null, (r84 & 2048) != 0 ? r5.title : null, (r84 & 4096) != 0 ? r5.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r5.url : null, (r84 & 16384) != 0 ? r5.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r5.originalFileType : null, (r84 & 65536) != 0 ? r5.hasOriginalAudio : false, (r84 & 131072) != 0 ? r5.matureContent : false, (r84 & 262144) != 0 ? r5.origin : null, (r84 & 524288) != 0 ? r5.contentType : null, (r84 & 1048576) != 0 ? r5.genre : null, (r84 & 2097152) != 0 ? r5.isBookType : false, (r84 & 4194304) != 0 ? r5.fromUserImport : false, (r84 & 8388608) != 0 ? r5.rating : null, (r84 & 16777216) != 0 ? r5.userRating : null, (r84 & 33554432) != 0 ? r5.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r5.creationStatus : null, (r84 & 134217728) != 0 ? r5.creationProgress : null, (r84 & 268435456) != 0 ? r5.isArchived : false, (r84 & 536870912) != 0 ? r5.markedAsUnread : false, (r84 & 1073741824) != 0 ? r5.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r5.publicationDate : null, (r85 & 1) != 0 ? r5.language : null, (r85 & 2) != 0 ? r5.publisherProfileId : null, (r85 & 4) != 0 ? r5.canDelete : false, (r85 & 8) != 0 ? r5.androidProductId : null, (r85 & 16) != 0 ? r5.isPaid : false, (r85 & 32) != 0 ? r5.offlineReadData : null, (r85 & 64) != 0 ? r5.previewAudio : null, (r85 & 128) != 0 ? r5.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r5.voiceSelectionConfig : null, (r85 & 512) != 0 ? r5.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r5.displayMode : null, (r85 & 2048) != 0 ? r5.inUserLibrary : false, (r85 & 4096) != 0 ? r5.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r5.audioType : null, (r85 & 16384) != 0 ? r5.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r5.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r5.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r5.audioDurationSeconds : null, (r85 & 262144) != 0 ? r5.audioTypes : null, (r85 & 524288) != 0 ? r5.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r5.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r5.coverImageUrls : null, (r85 & 4194304) != 0 ? r5.coverAspectRatio : null, (r85 & 8388608) != 0 ? ((ReadMeta) tn.o.w0(ReadsFactoryKt.stubReadMetaList$default(0, null, 3, null))).blurPlaceholder : null);
            ContentHeader(ir.r.c(copy), UserConfigFactoryKt.stubPlayerConfig(), null, qVar, 0, 4);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 12);
        }
    }

    public static final sn.z Preview_ContentHeader_NoUrl$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ContentHeader_NoUrl(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final ReadMeta ContentHeader$lambda$1$0(ReadMeta readMeta) {
        return readMeta;
    }
}
