package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import a2.n2;
import android.app.Activity;
import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenNames;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.j1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import i1.y0;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.ExplorePricingType;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.ListeningProgress;
import io.elevenlabs.domain.model.ListeningProgressKt;
import io.elevenlabs.domain.model.MetaItem;
import io.elevenlabs.domain.model.MoneyPrice;
import io.elevenlabs.domain.model.PaymentConfig;
import io.elevenlabs.domain.model.Rating;
import io.elevenlabs.domain.model.RawOneTimeProduct;
import io.elevenlabs.domain.model.ReadDetailsAuthorSection;
import io.elevenlabs.domain.model.ReadDetailsResponse;
import io.elevenlabs.domain.model.ReadDetailsSection;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.SizeableHeaderImage;
import io.elevenlabs.domain.model.Tag;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.FlatCarouselSectionKt;
import io.elevenlabs.readerapp.ui.components.MediaHeaderSectionKt;
import io.elevenlabs.readerapp.ui.components.MetaStatKeys;
import io.elevenlabs.readerapp.ui.components.ReadMetaStatsRowKt;
import io.elevenlabs.readerapp.ui.components.ReadPricingRowKt;
import io.elevenlabs.readerapp.ui.components.ReadPricingUltraRowStyle;
import io.elevenlabs.readerapp.ui.components.ReadSectionKt;
import io.elevenlabs.readerapp.ui.components.explore.LocalExplorePricesKt;
import io.elevenlabs.readerapp.ui.formatter.MinutesFormatterKt;
import io.elevenlabs.readerapp.ui.formatter.MoneyPriceFormatterKt;
import io.elevenlabs.readerapp.ui.formatter.RateFormatterKt;
import io.elevenlabs.readerapp.ui.formatter.WordCountToLengthFormatterKt;
import io.elevenlabs.readerapp.ui.previews.ReadDetailsFactoryKt;
import io.elevenlabs.readerapp.ui.previews.ReadsFactoryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CreateCollectionSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.g1;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.MoreActionsSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.RateTitleSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.composables.AuthorSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.composables.ChaptersSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.composables.DetailsSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.composables.ReadsListSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.composables.TitleDescriptionSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ButtonLayoutState;
import io.elevenlabs.readerapp.ui.screens.authenticated.report.ReportProblemBottomSheetKt;
import io.elevenlabs.ui.components.EchoButtonKt;
import io.elevenlabs.ui.components.EchoButtonSize;
import io.elevenlabs.ui.components.EchoButtonVariant;
import io.elevenlabs.ui.components.EchoIconButtonKt;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.FullScreenLoaderKt;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonSize;
import io.elevenlabs.ui.components.FullWidthButtonVariant;
import io.elevenlabs.ui.components.animations.AnimatedVisibilityContainersKt;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.echo.components.EchoBackButtonKt;
import io.elevenlabs.ui.echo.components.EchoToastKt;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.elevenlabs.ui.extensions.ContextExtensionsKt;
import io.elevenlabs.ui.extensions.GlassModifiersKt;
import io.elevenlabs.ui.extensions.GlassState;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import q2.j7;
import r1.c3;
import r1.d2;
import r1.i1;
import r1.i2;
import r1.k2;
import r1.l2;
import r1.m1;
import r1.p2;
import r1.u0;
import rd.c1;
import u2.f1;
import u2.r1;
import u2.x0;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b(\u001a\u009f\u0001\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a±\u0001\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032 \b\u0002\u0010\u0015\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\t\u0012\u0004\u0012\u00020\u00040\t2\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\t2\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\tH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001aO\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a/\u0010$\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010#\u001a\u00020\u0019H\u0003¢\u0006\u0004\b$\u0010%\u001aë\u0002\u0010J\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020 2\u0006\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010 2\u0006\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020 2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00101\u001a\u0004\u0018\u0001002\b\u00103\u001a\u0004\u0018\u0001022\b\u00104\u001a\u0004\u0018\u00010\u00002\b\u00105\u001a\u0004\u0018\u00010\u00002\u0006\u00106\u001a\u00020 2\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u000208\u0018\u0001072\b\u0010:\u001a\u0004\u0018\u00010\u00002\b\u0010;\u001a\u0004\u0018\u00010\u00002\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u00040\t2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\t2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00040\t2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010G\u001a\u00020F2\b\b\u0002\u0010#\u001a\u00020\u0019H\u0003¢\u0006\u0004\bH\u0010I\u001aÓ\u0001\u0010M\u001a\u00020\u00042\u0006\u0010(\u001a\u00020 2\u0006\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010 2\u0006\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020 2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u0010K\u001a\u0004\u0018\u00010\u00002\b\u0010L\u001a\u0004\u0018\u00010\u00002\b\u00104\u001a\u0004\u0018\u00010\u00002\b\u00105\u001a\u0004\u0018\u00010\u00002\u0006\u00106\u001a\u00020 2\b\u0010;\u001a\u0004\u0018\u00010\u00002\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00040\t2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010#\u001a\u00020\u0019H\u0003¢\u0006\u0004\bM\u0010N\u001aW\u0010P\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00002\u0006\u0010O\u001a\u00020 2\b\u00105\u001a\u0004\u0018\u00010\u00002\u0006\u00106\u001a\u00020 2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010#\u001a\u00020\u0019H\u0003¢\u0006\u0004\bP\u0010Q\u001a\u0097\u0001\u0010V\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010\u00002\u0006\u0010T\u001a\u00020\u00002\u0006\u0010U\u001a\u00020 2\b\u00105\u001a\u0004\u0018\u00010\u00002\u0006\u00106\u001a\u00020 2\u0006\u0010-\u001a\u00020 2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00040\t2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\bV\u0010W\u001a\u0081\u0001\u0010[\u001a\u00020\u00042\u0006\u0010X\u001a\u00020 2\b\u0010Y\u001a\u0004\u0018\u00010\u00002\u0006\u0010T\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020 2\b\u00105\u001a\u0004\u0018\u00010\u00002\u0006\u00106\u001a\u00020 2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00040\t2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b[\u0010\\\u001aG\u0010]\u001a\u00020\u00042\b\u00105\u001a\u0004\u0018\u00010\u00002\u0006\u00106\u001a\u00020 2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010#\u001a\u00020\u0019H\u0003¢\u0006\u0004\b]\u0010^\u001a5\u0010_\u001a\u00020\u00042\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010#\u001a\u00020\u0019H\u0003¢\u0006\u0004\b_\u0010`\u001a'\u0010e\u001a\u00028\u0000\"\u0004\b\u0000\u0010a2\u0006\u0010b\u001a\u00028\u00002\b\b\u0002\u0010d\u001a\u00020cH\u0003¢\u0006\u0004\be\u0010f\u001a#\u0010l\u001a\u00020k2\b\b\u0002\u0010h\u001a\u00020g2\b\b\u0002\u0010j\u001a\u00020iH\u0002¢\u0006\u0004\bl\u0010m\u001a\u001d\u0010p\u001a\b\u0012\u0004\u0012\u00020o0n2\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\bp\u0010q\u001a\u000f\u0010r\u001a\u00020\u0004H\u0007¢\u0006\u0004\br\u0010s\u001a\u000f\u0010t\u001a\u00020\u0004H\u0007¢\u0006\u0004\bt\u0010s\u001a\u000f\u0010u\u001a\u00020\u0004H\u0007¢\u0006\u0004\bu\u0010s\u001a\u000f\u0010v\u001a\u00020\u0004H\u0007¢\u0006\u0004\bv\u0010s\u001a\u000f\u0010w\u001a\u00020\u0004H\u0007¢\u0006\u0004\bw\u0010s\u001a\u000f\u0010x\u001a\u00020\u0004H\u0007¢\u0006\u0004\bx\u0010s\u001a\u000f\u0010y\u001a\u00020\u0004H\u0007¢\u0006\u0004\by\u0010s\u001a\u000f\u0010z\u001a\u00020\u0004H\u0007¢\u0006\u0004\bz\u0010s\u001a\u000f\u0010{\u001a\u00020\u0004H\u0007¢\u0006\u0004\b{\u0010s\u001a\u000f\u0010|\u001a\u00020\u0004H\u0007¢\u0006\u0004\b|\u0010s\u001a\u000f\u0010}\u001a\u00020\u0004H\u0007¢\u0006\u0004\b}\u0010s\u001a\u000f\u0010~\u001a\u00020\u0004H\u0007¢\u0006\u0004\b~\u0010s\u001a\u000f\u0010\u007f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u007f\u0010s\u001a\u0011\u0010\u0080\u0001\u001a\u00020\u0004H\u0007¢\u0006\u0005\b\u0080\u0001\u0010s\u001a\u0011\u0010\u0081\u0001\u001a\u00020\u0004H\u0007¢\u0006\u0005\b\u0081\u0001\u0010s\u001a\u0011\u0010\u0082\u0001\u001a\u00020\u0004H\u0007¢\u0006\u0005\b\u0082\u0001\u0010s\u001a\u0011\u0010\u0083\u0001\u001a\u00020\u0004H\u0007¢\u0006\u0005\b\u0083\u0001\u0010s\u001a\u0011\u0010\u0084\u0001\u001a\u00020\u0004H\u0007¢\u0006\u0005\b\u0084\u0001\u0010s\u001a\u0011\u0010\u0085\u0001\u001a\u00020\u0004H\u0007¢\u0006\u0005\b\u0085\u0001\u0010s\u001a\u0011\u0010\u0086\u0001\u001a\u00020\u0004H\u0007¢\u0006\u0005\b\u0086\u0001\u0010s\u001a\u0011\u0010\u0087\u0001\u001a\u00020\u0004H\u0007¢\u0006\u0005\b\u0087\u0001\u0010s\u001a\u0011\u0010\u0088\u0001\u001a\u00020\u0004H\u0007¢\u0006\u0005\b\u0088\u0001\u0010s\u001a\u0011\u0010\u0089\u0001\u001a\u00020\u0004H\u0007¢\u0006\u0005\b\u0089\u0001\u0010s\u001a\u0011\u0010\u008a\u0001\u001a\u00020\u0004H\u0007¢\u0006\u0005\b\u008a\u0001\u0010s\u001a\u0011\u0010\u008b\u0001\u001a\u00020\u0004H\u0007¢\u0006\u0005\b\u008b\u0001\u0010s\u001a\u0011\u0010\u008c\u0001\u001a\u00020\u0004H\u0007¢\u0006\u0005\b\u008c\u0001\u0010s\u001a\u0011\u0010\u008d\u0001\u001a\u00020\u0004H\u0007¢\u0006\u0005\b\u008d\u0001\u0010s\u001a\u0011\u0010\u008e\u0001\u001a\u00020\u0004H\u0007¢\u0006\u0005\b\u008e\u0001\u0010s\u001a\u0011\u0010\u008f\u0001\u001a\u00020\u0004H\u0007¢\u0006\u0005\b\u008f\u0001\u0010s¨\u0006\u0097\u0001²\u0006\u0011\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\u0011\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010\u0092\u0001\u001a\u00020 8\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010\u0093\u0001\u001a\u00020 8\n@\nX\u008a\u008e\u0002²\u0006\u0011\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010\u0095\u0001\u001a\u00020g8\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010\u0096\u0001\u001a\u00020g8\n@\nX\u008a\u008e\u0002"}, d2 = {"", "readId", "code", "Lkotlin/Function0;", "Lsn/z;", "onGoBack", "Lkotlin/Function2;", "Lio/elevenlabs/domain/Analytics$Event$PlayerActivationSource;", "onNavigateToPlayer", "Lkotlin/Function1;", "onNavigateToAuthorProfile", "onNavigateToLink", "onNavigateToReadDetails", "onRequestStartSelectiveStackPopping", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/ReadDetailsViewModel;", "vm", "ReadDetailsScreen", "(Ljava/lang/String;Ljava/lang/String;Lho/a;Lho/p;Lho/l;Lho/l;Lho/l;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/ReadDetailsViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/ReadDetailsState;", RemoteConfigConstants.ResponseFieldKey.STATE, "miniPlayer", "action", "onShowAddToCollectionSheet", "ReadDetailsScreenUi", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/ReadDetailsState;Lho/p;Lho/l;Lho/a;Lho/l;Lho/l;Lho/l;Lho/l;Lu2/m;II)V", "Li3/t;", "buttonModifier", "onShare", "onToggleReadLater", "onMoreActions", "ReadDetailsHeaderActions", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/ReadDetailsState;Li3/t;Lho/l;Lho/a;Lho/a;Lu2/m;I)V", "", "inReadLater", "onClick", "modifier", "ReadLaterToggleButton", "(ZLho/a;Li3/t;Lu2/m;II)V", "Lio/elevenlabs/domain/model/ReadDetailsResponse;", "readDetails", "isInLibrary", "Lio/elevenlabs/domain/model/ExplorePricingType;", "pricingType", "isFreeUser", "isEligibleForTrial", "isLoadingAction", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/PurchaseState;", FirebaseAnalytics.Event.PURCHASE, "Lio/elevenlabs/domain/model/PaymentConfig;", "paymentConfig", "Lio/elevenlabs/domain/model/ReadMeta;", "readMeta", "previewUrl", "sampleReadId", "isPlayingPreview", "", "Lio/elevenlabs/domain/model/MoneyPrice;", "localizedPrices", "playingCarouselPreviewReadId", "disabledReason", "onTogglePreview", "Lio/elevenlabs/domain/model/ExploreRead;", "onCarouselPreviewClick", "onSampleButtonClick", "onPlayButtonClick", "onReportProblemClick", "onRateTitleClick", "Landroid/app/Activity;", "onPurchaseClick", "onTryUltraClick", "Lh5/f;", "headerPadding", "ReadDetailsContent-n2tekjI", "(Lio/elevenlabs/domain/model/ReadDetailsResponse;ZLio/elevenlabs/domain/model/ExplorePricingType;Ljava/lang/Boolean;ZZLio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/PurchaseState;Lio/elevenlabs/domain/model/PaymentConfig;Lio/elevenlabs/domain/model/ReadMeta;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/String;Ljava/lang/String;Lho/a;Lho/l;Lho/a;Lho/a;Lho/l;Lho/l;Lho/a;Lho/a;Lho/l;Lho/a;Lho/p;FLi3/t;Lu2/m;IIII)V", "ReadDetailsContent", "fallbackFormattedPrice", "zeroPriceFormatted", "ReadDetailsBottomActions", "(ZLio/elevenlabs/domain/model/ExplorePricingType;Ljava/lang/Boolean;ZZLio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/PurchaseState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lho/a;Lho/a;Lho/a;Lho/l;Lho/a;Li3/t;Lu2/m;III)V", "hasPreview", "DisabledReasonLayout", "(Ljava/lang/String;ZLjava/lang/String;ZLho/a;Lho/a;Li3/t;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/ButtonLayoutState;", "displayPrice", "tryUltraLabel", "isPurchaseLoading", "SingleRowLayout", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/details/ButtonLayoutState;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZLho/a;Lho/a;Lho/a;Lho/l;Lho/a;Lu2/m;II)V", "showPreviewButton", "formattedPrice", "isLoading", "PurchaseOrUltraLayout", "(ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLho/a;Lho/a;Lho/l;Lho/a;Lu2/m;I)V", "PreviewButton", "(Ljava/lang/String;ZLho/a;Lho/a;Li3/t;Lu2/m;II)V", "ReadActionsSection", "(Lho/a;Lho/a;Li3/t;Lu2/m;II)V", TokenNames.T, "value", "", "delayMillis", "rememberDebouncedValue", "(Ljava/lang/Object;JLu2/m;II)Ljava/lang/Object;", "", "durationMillis", "", "stagger", "Li1/m0;", "crossfadeWithStagger", "(IF)Li1/m0;", "", "Lio/elevenlabs/domain/model/MetaItem;", "computeFallbackMetaItems", "(Lio/elevenlabs/domain/model/ReadMeta;Lu2/m;I)Ljava/util/List;", "Preview_ReadDetailsScreen_idle", "(Lu2/m;I)V", "Preview_ReadDetailsScreen_loading", "Preview_ReadDetailsScreen_error", "Preview_ReadDetailsScreen_add_to_library", "Preview_ReadDetailsScreen_delete_and_listen", "Preview_ReadDetailsScreen_listen_only", "Preview_ReadDetailsScreen_read_later_quick_add", "Preview_ReadDetailsScreen_read_later_quick_remove", "Preview_ReadDetailsScreen_added_toast", "Preview_ReadDetailsScreen_metadata_article", "Preview_ReadDetailsScreen_metadata_markdown", "Preview_ReadDetailsScreen_metadata_book", "Preview_ReadDetailsScreen_add_to_library_loading", "Preview_ReadDetailsScreen_author_profile_loading", "Preview_ReadDetailsScreen_author_profile", "Preview_ReadDetailsScreen_preview_and_purchase", "Preview_ReadDetailsScreen_purchase_loading", "Preview_ReadDetailsScreen_price_loading", "Preview_ReadDetailsScreen_ultra_book_upgrade", "Preview_ReadDetailsScreen_ultra_book_trial", "Preview_ReadDetailsScreen_ultra_subscriber_ultra_book", "Preview_ReadDetailsScreen_ultra_subscriber_ultra_purchasable_book", "Preview_ReadDetailsScreen_purchase_or_ultra_upgrade", "Preview_ReadDetailsScreen_purchase_or_ultra_trial", "Preview_ReadDetailsScreen_purchase_or_ultra_loading", "Preview_ReadDetailsScreen_with_audio_preview_playing", "Preview_ReadDetailsScreen_region_disabled", "Preview_ReadDetailsScreen_region_disabled_no_preview", "Preview_ReadDetailsScreen_region_disabled_with_sample", "addToCollectionReadId", "createCollectionForReadId", "showReportProblemSheet", "showMoreActionsSheet", "linkToShare", "headerHeight", "miniPlayerHeight", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ReadDetailsScreenKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonLayoutState.MainButtonType.values().length];
            try {
                iArr[ButtonLayoutState.MainButtonType.Play.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonLayoutState.MainButtonType.Purchase.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonLayoutState.MainButtonType.TryUltra.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonLayoutState.MainButtonType.PurchaseOrUltra.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void DisabledReasonLayout(String str, boolean z6, String str2, boolean z10, ho.a aVar, ho.a aVar2, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z11;
        r1 r10;
        int i14;
        float f10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2034589651);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.g(z6)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i10 & 384) == 0) {
            if (qVar.f(str2)) {
                i18 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.g(z10)) {
                i17 = 2048;
            } else {
                i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i17;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.h(aVar)) {
                i16 = 16384;
            } else {
                i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i16;
        }
        if ((196608 & i10) == 0) {
            if (qVar.h(aVar2)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i12 |= i15;
        }
        int i21 = i11 & 64;
        if (i21 != 0) {
            i12 |= 1572864;
        } else if ((1572864 & i10) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i12 |= i13;
            if ((599187 & i12) == 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!qVar.O(i12 & 1, z11)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i21 != 0) {
                    tVar2 = qVar2;
                }
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i22 = EchoTheme.$stable;
                i3.t I = r1.d.I(r1.d.G(tVar2, echoTheme.getSpacings(qVar, i22).getX5(), t2.u.P, 2), t2.u.P, t2.u.P, t2.u.P, echoTheme.getSpacings(qVar, i22).getX4(), 7);
                u0 u0Var = r1.j.f29228a;
                r1.x a10 = r1.w.a(ib.i.m(echoTheme, qVar, i22), i3.d.B0, qVar, 0);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c5 = i3.a.c(I, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                u2.r.J(h4.g.f11907f, a10, qVar);
                u2.r.J(h4.g.f11906e, l4, qVar);
                u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                u2.r.F(h4.g.f11909h, qVar);
                u2.r.J(h4.g.f11905d, c5, qVar);
                if (z6) {
                    qVar.X(1667640737);
                    i3.t e10 = p2.e(qVar2, 1.0f);
                    int i23 = i12 >> 6;
                    int i24 = (i23 & 14) | 24576 | (i23 & 112) | (i23 & 896) | (i23 & 7168);
                    i14 = i22;
                    f10 = t2.u.P;
                    PreviewButton(str2, z10, aVar, aVar2, e10, qVar, i24, 0);
                    qVar.p(false);
                } else {
                    i14 = i22;
                    f10 = t2.u.P;
                    qVar.X(1667940569);
                    qVar.p(false);
                }
                j7.d(str, r1.d.G(p2.e(qVar2, 1.0f), f10, echoTheme.getSpacings(qVar, i14).getX2(), 1), echoTheme.getColors(qVar, i14).getText().getSecondary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i14).getSmRegular400(qVar, EchoThemeTypography.$stable), qVar, i12 & 14, 0, 130040);
                qVar = qVar;
                qVar.p(true);
            } else {
                qVar.R();
            }
            i3.t tVar3 = tVar2;
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new q(str, z6, str2, z10, aVar, aVar2, tVar3, i10, i11);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((599187 & i12) == 599186) {
        }
        if (!qVar.O(i12 & 1, z11)) {
        }
        i3.t tVar32 = tVar2;
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z DisabledReasonLayout$lambda$1(String str, boolean z6, String str2, boolean z10, ho.a aVar, ho.a aVar2, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        DisabledReasonLayout(str, z6, str2, z10, aVar, aVar2, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void PreviewButton(String str, boolean z6, ho.a aVar, ho.a aVar2, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        ho.a aVar3;
        ho.a aVar4;
        i3.t tVar2;
        int i13;
        boolean z10;
        u2.q qVar;
        r1 r10;
        i3.t tVar3;
        int i14;
        int i15;
        int i16;
        ho.a aVar5;
        int i17;
        int i18;
        int i19;
        int i20;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-290303386);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.g(z6)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i10 & 384) == 0) {
            aVar3 = aVar;
            if (qVar2.h(aVar3)) {
                i18 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        } else {
            aVar3 = aVar;
        }
        if ((i10 & 3072) == 0) {
            aVar4 = aVar2;
            if (qVar2.h(aVar4)) {
                i17 = 2048;
            } else {
                i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i17;
        } else {
            aVar4 = aVar2;
        }
        int i21 = i11 & 16;
        if (i21 != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i13;
            boolean z11 = false;
            if ((i12 & 9363) == 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!qVar2.O(i12 & 1, z10)) {
                if (i21 != 0) {
                    tVar3 = i3.q.f13017a;
                } else {
                    tVar3 = tVar2;
                }
                if (str != null) {
                    z11 = true;
                }
                if (z11) {
                    i14 = R.string.read_details_sample;
                } else {
                    i14 = R.string.explore_read_preview;
                }
                String R = kj.c.R(qVar2, i14);
                boolean z12 = z11;
                FullWidthButtonVariant fullWidthButtonVariant = FullWidthButtonVariant.Border;
                FullWidthButtonSize fullWidthButtonSize = FullWidthButtonSize.Large;
                if (z12) {
                    i15 = io.elevenlabs.ui.R.drawable.play_round;
                } else if (z6) {
                    i15 = io.elevenlabs.ui.R.drawable.pause_round;
                } else {
                    i15 = io.elevenlabs.ui.R.drawable.volume_full;
                }
                if (z12) {
                    i16 = i15;
                    aVar5 = aVar4;
                } else {
                    i16 = i15;
                    aVar5 = aVar3;
                }
                qVar = qVar2;
                FullWidthButtonKt.EchoThemeFullWidthButton(R, aVar5, tVar3, fullWidthButtonSize, fullWidthButtonVariant, Integer.valueOf(i16), false, false, false, qVar, ((i12 >> 6) & 896) | 27648, 448);
                tVar2 = tVar3;
            } else {
                qVar = qVar2;
                qVar.R();
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.j(str, z6, aVar3, aVar4, tVar2, i10, i11);
                return;
            }
            return;
        }
        tVar2 = tVar;
        boolean z112 = false;
        if ((i12 & 9363) == 9362) {
        }
        if (!qVar2.O(i12 & 1, z10)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z PreviewButton$lambda$0(String str, boolean z6, ho.a aVar, ho.a aVar2, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        PreviewButton(str, z6, aVar, aVar2, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_add_to_library(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1049657931);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, ReadDetailsFactoryKt.stubReadDetailsResponse$default("Free Book to Add", wq.u.R(7, "Lorem ipsum. "), null, false, false, false, null, false, 252, null), null, false, false, null, false, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134217562, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new m0(12);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.reads.m0(i10, 21);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_add_to_library$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_add_to_library$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_add_to_library(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_add_to_library_loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(885615150);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, ReadDetailsFactoryKt.stubReadDetailsResponse$default("Adding to Library", wq.u.R(7, "Lorem ipsum. "), null, false, false, false, null, false, 252, null), null, false, true, null, false, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134217562, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new t(5);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u(i10, 5);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_add_to_library_loading$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_add_to_library_loading$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_add_to_library_loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_added_toast(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(855050352);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, ReadDetailsFactoryKt.stubReadDetailsResponse$default("I can't let Ammaar down", wq.u.R(7, "Lorem ipsum. "), null, false, false, false, null, false, 252, null), null, false, false, null, true, null, null, false, null, null, null, null, false, null, null, false, true, false, null, null, false, null, false, false, 133693306, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new m0(28);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.reads.m0(i10, 27);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_added_toast$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_added_toast$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_added_toast(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_author_profile(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-752905045);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, ReadDetailsFactoryKt.stubReadDetailsResponse$default("I can't let Ammaar down", wq.u.R(7, "Lorem ipsum. "), null, true, false, false, null, false, 244, null), null, false, false, null, true, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134217594, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new m0(8);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.reads.m0(i10, 19);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_author_profile$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_author_profile$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_author_profile(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_author_profile_loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(869276814);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, ReadDetailsFactoryKt.stubReadDetailsResponse$default("I can't let Ammaar down", wq.u.R(7, "Lorem ipsum. "), null, false, false, false, null, false, 244, null), null, true, false, null, true, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134217578, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new t(7);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u(i10, 4);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_author_profile_loading$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_author_profile_loading$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_author_profile_loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_delete_and_listen(u2.m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(514265973);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsResponse stubReadDetailsResponse$default = ReadDetailsFactoryKt.stubReadDetailsResponse$default("Book in Library", wq.u.R(7, "Lorem ipsum. "), null, false, false, false, "http://elevenlabs.io/app", false, 188, null);
            copy = r24.copy((r84 & 1) != 0 ? r24.articleImageUrl : null, (r84 & 2) != 0 ? r24.author : null, (r84 & 4) != 0 ? r24.chapters : null, (r84 & 8) != 0 ? r24.charCount : 0L, (r84 & 16) != 0 ? r24.createdAt : null, (r84 & 32) != 0 ? r24.updatedAt : null, (r84 & 64) != 0 ? r24.addedAt : null, (r84 & 128) != 0 ? r24.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r24.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r24.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r24.source : null, (r84 & 2048) != 0 ? r24.title : null, (r84 & 4096) != 0 ? r24.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r24.url : null, (r84 & 16384) != 0 ? r24.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r24.originalFileType : null, (r84 & 65536) != 0 ? r24.hasOriginalAudio : false, (r84 & 131072) != 0 ? r24.matureContent : false, (r84 & 262144) != 0 ? r24.origin : null, (r84 & 524288) != 0 ? r24.contentType : null, (r84 & 1048576) != 0 ? r24.genre : null, (r84 & 2097152) != 0 ? r24.isBookType : false, (r84 & 4194304) != 0 ? r24.fromUserImport : false, (r84 & 8388608) != 0 ? r24.rating : null, (r84 & 16777216) != 0 ? r24.userRating : null, (r84 & 33554432) != 0 ? r24.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r24.creationStatus : null, (r84 & 134217728) != 0 ? r24.creationProgress : null, (r84 & 268435456) != 0 ? r24.isArchived : false, (r84 & 536870912) != 0 ? r24.markedAsUnread : false, (r84 & 1073741824) != 0 ? r24.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r24.publicationDate : null, (r85 & 1) != 0 ? r24.language : null, (r85 & 2) != 0 ? r24.publisherProfileId : null, (r85 & 4) != 0 ? r24.canDelete : true, (r85 & 8) != 0 ? r24.androidProductId : null, (r85 & 16) != 0 ? r24.isPaid : false, (r85 & 32) != 0 ? r24.offlineReadData : null, (r85 & 64) != 0 ? r24.previewAudio : null, (r85 & 128) != 0 ? r24.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r24.voiceSelectionConfig : null, (r85 & 512) != 0 ? r24.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r24.displayMode : null, (r85 & 2048) != 0 ? r24.inUserLibrary : false, (r85 & 4096) != 0 ? r24.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r24.audioType : null, (r85 & 16384) != 0 ? r24.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r24.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r24.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r24.audioDurationSeconds : null, (r85 & 262144) != 0 ? r24.audioTypes : null, (r85 & 524288) != 0 ? r24.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r24.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r24.coverImageUrls : null, (r85 & 4194304) != 0 ? r24.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, stubReadDetailsResponse$default, copy, false, false, null, true, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134217586, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new m0(9);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.reads.m0(i10, 20);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_delete_and_listen$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_delete_and_listen$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_delete_and_listen(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_error(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(323704208);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState(null, false, null, null, false, false, "Some error", false, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134217663, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new t(15);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u(i10, 11);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_error$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_error$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_error(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_idle(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-38168468);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState(null, false, null, null, false, false, null, false, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134217727, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new t(2);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u(i10, 1);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_idle$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_idle$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_idle(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_listen_only(u2.m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1124708852);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsResponse stubReadDetailsResponse$default = ReadDetailsFactoryKt.stubReadDetailsResponse$default("Book Already in Library", wq.u.R(7, "Lorem ipsum. "), null, false, false, false, null, false, 252, null);
            copy = r24.copy((r84 & 1) != 0 ? r24.articleImageUrl : null, (r84 & 2) != 0 ? r24.author : null, (r84 & 4) != 0 ? r24.chapters : null, (r84 & 8) != 0 ? r24.charCount : 0L, (r84 & 16) != 0 ? r24.createdAt : null, (r84 & 32) != 0 ? r24.updatedAt : null, (r84 & 64) != 0 ? r24.addedAt : null, (r84 & 128) != 0 ? r24.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r24.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r24.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r24.source : null, (r84 & 2048) != 0 ? r24.title : null, (r84 & 4096) != 0 ? r24.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r24.url : null, (r84 & 16384) != 0 ? r24.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r24.originalFileType : null, (r84 & 65536) != 0 ? r24.hasOriginalAudio : false, (r84 & 131072) != 0 ? r24.matureContent : false, (r84 & 262144) != 0 ? r24.origin : null, (r84 & 524288) != 0 ? r24.contentType : null, (r84 & 1048576) != 0 ? r24.genre : null, (r84 & 2097152) != 0 ? r24.isBookType : false, (r84 & 4194304) != 0 ? r24.fromUserImport : false, (r84 & 8388608) != 0 ? r24.rating : null, (r84 & 16777216) != 0 ? r24.userRating : null, (r84 & 33554432) != 0 ? r24.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r24.creationStatus : null, (r84 & 134217728) != 0 ? r24.creationProgress : null, (r84 & 268435456) != 0 ? r24.isArchived : false, (r84 & 536870912) != 0 ? r24.markedAsUnread : false, (r84 & 1073741824) != 0 ? r24.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r24.publicationDate : null, (r85 & 1) != 0 ? r24.language : null, (r85 & 2) != 0 ? r24.publisherProfileId : null, (r85 & 4) != 0 ? r24.canDelete : false, (r85 & 8) != 0 ? r24.androidProductId : null, (r85 & 16) != 0 ? r24.isPaid : false, (r85 & 32) != 0 ? r24.offlineReadData : null, (r85 & 64) != 0 ? r24.previewAudio : null, (r85 & 128) != 0 ? r24.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r24.voiceSelectionConfig : null, (r85 & 512) != 0 ? r24.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r24.displayMode : null, (r85 & 2048) != 0 ? r24.inUserLibrary : false, (r85 & 4096) != 0 ? r24.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r24.audioType : null, (r85 & 16384) != 0 ? r24.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r24.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r24.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r24.audioDurationSeconds : null, (r85 & 262144) != 0 ? r24.audioTypes : null, (r85 & 524288) != 0 ? r24.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r24.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r24.coverImageUrls : null, (r85 & 4194304) != 0 ? r24.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, stubReadDetailsResponse$default, copy, false, false, null, true, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134217586, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new m0(13);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.reads.m0(i10, 22);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_listen_only$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_listen_only$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_listen_only(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1000612132);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState(null, false, null, null, true, false, null, false, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134217711, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new t(0);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u(i10, 0);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_loading$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_loading$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_metadata_article(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1564561126);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, ReadDetailsFactoryKt.stubReadDetailsResponse$default("Metadata for Article", wq.u.R(7, "Lorem ipsum. "), null, false, false, false, null, false, 252, null), null, false, false, null, true, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134217594, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new t(8);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u(i10, 6);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_metadata_article$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_metadata_article$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_metadata_article(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_metadata_book(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(868833279);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, ReadDetailsFactoryKt.stubReadDetailsResponse$default("Metadata for Book", wq.u.R(7, "Lorem ipsum. "), null, false, false, false, null, false, 252, null), null, false, false, null, true, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134217594, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new m0(15);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.reads.m0(i10, 23);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_metadata_book$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_metadata_book$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_metadata_book(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_metadata_markdown(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-555062727);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, ReadDetailsFactoryKt.stubReadDetailsResponse$default("Metadata for Article", "Lorem ipsum. [With clickable link](https://example.com)", null, false, false, false, null, false, 252, null), null, false, false, null, true, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134217594, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new t(13);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u(i10, 12);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_metadata_markdown$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_metadata_markdown$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_metadata_markdown(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_preview_and_purchase(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1192851648);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, ReadDetailsFactoryKt.stubReadDetailsResponse$default("Paid Book with Preview", wq.u.R(7, "Lorem ipsum. "), null, false, false, true, null, true, 92, null), null, false, false, null, false, ExplorePricingType.Paid, null, false, ReadDetailsFactoryKt.stubPurchaseState$default(false, false, 3, null), null, "https://example.com/test.mp3", null, false, null, null, false, false, false, null, null, false, null, false, false, 134207098, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new t(9);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u(i10, 7);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_preview_and_purchase$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_preview_and_purchase$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_preview_and_purchase(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_price_loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-745983342);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, ReadDetailsFactoryKt.stubReadDetailsResponse$default("Paid Book (price loading)", wq.u.R(7, "Lorem ipsum. "), null, false, false, false, null, true, 124, null), null, false, false, null, false, ExplorePricingType.Paid, null, false, ReadDetailsFactoryKt.stubPurchaseState$default(false, true, 1, null), null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134215290, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new t(17);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u(i10, 13);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_price_loading$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_price_loading$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_price_loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_purchase_loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-921465342);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, ReadDetailsFactoryKt.stubReadDetailsResponse$default("Processing Purchase", wq.u.R(7, "Lorem ipsum. "), null, false, false, true, null, true, 92, null), null, false, false, null, false, ExplorePricingType.Paid, null, false, ReadDetailsFactoryKt.stubPurchaseState$default(true, false, 2, null), null, "https://example.com/test.mp3", null, false, null, null, false, false, false, null, null, false, null, false, false, 134207098, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new t(19);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u(i10, 14);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_purchase_loading$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_purchase_loading$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_purchase_loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_purchase_or_ultra_loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1724586221);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, ReadDetailsFactoryKt.stubReadDetailsResponse$default("Ultra Book Purchasing", wq.u.R(7, "Lorem ipsum. "), null, false, false, true, null, true, 92, null), null, false, false, null, false, ExplorePricingType.Ultra, Boolean.TRUE, false, ReadDetailsFactoryKt.stubPurchaseState$default(true, false, 2, null), ReadDetailsFactoryKt.stubUltraPurchasablePaymentConfig(), "https://example.com/test.mp3", null, false, null, null, false, false, false, null, null, false, null, false, false, 134202490, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new t(4);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u(i10, 3);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_purchase_or_ultra_loading$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_purchase_or_ultra_loading$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_purchase_or_ultra_loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_purchase_or_ultra_trial(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-578156525);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, ReadDetailsFactoryKt.stubReadDetailsResponse$default("Ultra Book with Purchase Option (Trial)", wq.u.R(7, "Lorem ipsum. "), null, false, false, true, null, true, 92, null), null, false, false, null, false, ExplorePricingType.Ultra, Boolean.TRUE, true, ReadDetailsFactoryKt.stubPurchaseState$default(false, false, 3, null), ReadDetailsFactoryKt.stubUltraPurchasablePaymentConfig(), "https://example.com/test.mp3", null, false, null, null, false, false, false, null, null, false, null, false, false, 134201466, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new m0(7);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.reads.m0(i10, 18);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_purchase_or_ultra_trial$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_purchase_or_ultra_trial$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_purchase_or_ultra_trial(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_purchase_or_ultra_upgrade(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1129270259);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, ReadDetailsFactoryKt.stubReadDetailsResponse$default("Ultra Book with Purchase Option (Upgrade)", wq.u.R(7, "Lorem ipsum. "), null, false, false, true, null, true, 92, null), null, false, false, null, false, ExplorePricingType.Ultra, Boolean.TRUE, false, ReadDetailsFactoryKt.stubPurchaseState$default(false, false, 3, null), ReadDetailsFactoryKt.stubUltraPurchasablePaymentConfig(), "https://example.com/test.mp3", null, false, null, null, false, false, false, null, null, false, null, false, false, 134201466, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new t(22);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.reads.m0(i10, 16);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_purchase_or_ultra_upgrade$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_purchase_or_ultra_upgrade$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_purchase_or_ultra_upgrade(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_read_later_quick_add(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1885958957);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, ReadDetailsFactoryKt.stubReadDetailsResponse$default("Non-shareable read", wq.u.R(7, "Lorem ipsum. "), null, false, false, false, null, false, 252, null), null, false, false, null, false, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, true, 33554426, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new m0(29);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.reads.m0(i10, 29);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_read_later_quick_add$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_read_later_quick_add$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_read_later_quick_add(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_read_later_quick_remove(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1811207462);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, ReadDetailsFactoryKt.stubReadDetailsResponse$default("Saved for later", wq.u.R(7, "Lorem ipsum. "), null, false, false, false, null, false, 252, null), null, false, false, null, false, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, true, true, 33554426, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new t(14);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u(i10, 10);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_read_later_quick_remove$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_read_later_quick_remove$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_read_later_quick_remove(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_region_disabled(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-74806063);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, ReadDetailsFactoryKt.stubReadDetailsResponse$default("Region-restricted book", wq.u.R(7, "Lorem ipsum. "), null, false, false, true, null, true, 92, null), null, false, false, null, false, ExplorePricingType.Paid, null, false, null, null, "https://example.com/test.mp3", null, false, null, null, false, false, false, null, null, false, "This audiobook is not available in your region", false, false, 117431930, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new m0(24);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.reads.m0(i10, 26);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_region_disabled$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_region_disabled$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_region_disabled(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_region_disabled_no_preview(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1667158178);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, ReadDetailsFactoryKt.stubReadDetailsResponse$default("Region-restricted book", wq.u.R(7, "Lorem ipsum. "), null, false, false, false, null, true, 124, null), null, false, false, null, false, ExplorePricingType.Paid, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, "This audiobook is not available in your region", false, false, 117440122, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new t(11);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u(i10, 9);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_region_disabled_no_preview$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_region_disabled_no_preview$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_region_disabled_no_preview(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_region_disabled_with_sample(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1751112013);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, ReadDetailsFactoryKt.stubReadDetailsResponse$default("Region-restricted book", wq.u.R(7, "Lorem ipsum. "), null, false, false, false, null, true, 124, null), null, false, false, null, false, ExplorePricingType.Paid, null, false, null, null, null, "sample_id", false, null, null, false, false, false, null, null, false, "This audiobook is not available in your region", false, false, 117423738, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new m0(16);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.reads.m0(i10, 24);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_region_disabled_with_sample$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_region_disabled_with_sample$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_region_disabled_with_sample(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_ultra_book_trial(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-699598547);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, ReadDetailsFactoryKt.stubReadDetailsResponse$default("Ultra Book (Trial)", wq.u.R(7, "Lorem ipsum. "), null, false, false, false, null, false, 252, null), null, false, false, null, false, ExplorePricingType.Ultra, Boolean.TRUE, true, null, ReadDetailsFactoryKt.stubUltraPaymentConfig("$0.00"), null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134211706, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new t(3);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u(i10, 2);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_ultra_book_trial$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_ultra_book_trial$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_ultra_book_trial(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_ultra_book_upgrade(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1870936409);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, ReadDetailsFactoryKt.stubReadDetailsResponse$default("Ultra Book (Upgrade)", wq.u.R(7, "Lorem ipsum. "), null, false, false, false, null, false, 252, null), null, false, false, null, false, ExplorePricingType.Ultra, Boolean.TRUE, false, null, ReadDetailsFactoryKt.stubUltraPaymentConfig$default(null, 1, null), null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134211706, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new m0(6);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.reads.m0(i10, 17);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_ultra_book_upgrade$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_ultra_book_upgrade$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_ultra_book_upgrade(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_ultra_subscriber_ultra_book(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1541391336);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, ReadDetailsFactoryKt.stubReadDetailsResponse$default("Ultra Book (Subscribed)", wq.u.R(7, "Lorem ipsum. "), null, false, false, false, null, false, 252, null), null, false, false, null, false, ExplorePricingType.Ultra, Boolean.FALSE, false, null, ReadDetailsFactoryKt.stubUltraPaymentConfig$default(null, 1, null), null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134212730, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new t(10);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u(i10, 8);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_ultra_subscriber_ultra_book$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_ultra_subscriber_ultra_book$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_ultra_subscriber_ultra_book(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_ultra_subscriber_ultra_purchasable_book(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-480713577);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, ReadDetailsFactoryKt.stubReadDetailsResponse$default("Ultra Book with Purchase Option (Subscribed)", wq.u.R(7, "Lorem ipsum. "), null, false, false, false, null, true, 124, null), null, false, false, null, false, ExplorePricingType.Ultra, Boolean.FALSE, false, null, ReadDetailsFactoryKt.stubUltraPurchasablePaymentConfig(), null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134212730, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new m0(21);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.reads.m0(i10, 25);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_ultra_subscriber_ultra_purchasable_book$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_ultra_subscriber_ultra_purchasable_book$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_ultra_subscriber_ultra_purchasable_book(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadDetailsScreen_with_audio_preview_playing(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1261385739);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsState readDetailsState = new ReadDetailsState("abc", false, ReadDetailsFactoryKt.stubReadDetailsResponse$default("Paid book", wq.u.R(7, "Lorem ipsum. "), null, false, false, true, null, true, 92, null), null, false, false, null, false, ExplorePricingType.Paid, null, false, ReadDetailsFactoryKt.stubPurchaseState$default(false, false, 3, null), null, "https://example.com/test.mp3", null, true, null, null, false, false, false, null, null, false, null, false, false, 134174330, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new m0(25);
                qVar.h0(L);
            }
            ReadDetailsScreenUi(readDetailsState, null, (ho.l) L, null, null, null, null, null, qVar, 384, 250);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.reads.m0(i10, 28);
        }
    }

    public static final sn.z Preview_ReadDetailsScreen_with_audio_preview_playing$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReadDetailsScreen_with_audio_preview_playing$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadDetailsScreen_with_audio_preview_playing(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final void PurchaseOrUltraLayout(final boolean z6, final String str, final String str2, final boolean z10, final String str3, final boolean z11, final ho.a aVar, final ho.a aVar2, ho.l lVar, final ho.a aVar3, u2.m mVar, final int i10) {
        int i11;
        ho.a aVar4;
        boolean z12;
        ho.l lVar2;
        u2.q qVar;
        h4.e eVar;
        h4.e eVar2;
        int i12;
        u2.q qVar2;
        h4.e eVar3;
        int i13;
        h4.e eVar4;
        boolean z13;
        String str4;
        boolean z14;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(942759214);
        if ((i10 & 6) == 0) {
            if (qVar3.g(z6)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i11 = i23 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar3.f(str)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i11 |= i22;
        }
        if ((i10 & 384) == 0) {
            if (qVar3.f(str2)) {
                i21 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i21 = 128;
            }
            i11 |= i21;
        }
        if ((i10 & 3072) == 0) {
            if (qVar3.g(z10)) {
                i20 = 2048;
            } else {
                i20 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i20;
        }
        if ((i10 & 24576) == 0) {
            if (qVar3.f(str3)) {
                i19 = 16384;
            } else {
                i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i19;
        }
        if ((196608 & i10) == 0) {
            if (qVar3.g(z11)) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i11 |= i18;
        }
        if ((1572864 & i10) == 0) {
            aVar4 = aVar;
            if (qVar3.h(aVar4)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i11 |= i17;
        } else {
            aVar4 = aVar;
        }
        if ((12582912 & i10) == 0) {
            if (qVar3.h(aVar2)) {
                i16 = 8388608;
            } else {
                i16 = 4194304;
            }
            i11 |= i16;
        }
        if ((100663296 & i10) == 0) {
            if (qVar3.h(lVar)) {
                i15 = 67108864;
            } else {
                i15 = 33554432;
            }
            i11 |= i15;
        }
        if ((805306368 & i10) == 0) {
            if (qVar3.h(aVar3)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i11 |= i14;
        }
        int i24 = i11;
        if ((i24 & 306783379) != 306783378) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (qVar3.O(i24 & 1, z12)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i25 = EchoTheme.$stable;
            float x52 = echoTheme.getSpacings(qVar3, i25).getX5();
            i3.q qVar4 = i3.q.f13017a;
            i3.t I = r1.d.I(r1.d.G(qVar4, x52, t2.u.P, 2), t2.u.P, t2.u.P, t2.u.P, echoTheme.getSpacings(qVar3, i25).getX4(), 7);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar3, 0);
            int hashCode = Long.hashCode(qVar3.T);
            c3.o l4 = qVar3.l();
            i3.t c5 = i3.a.c(I, qVar3);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar);
            } else {
                qVar3.k0();
            }
            h4.e eVar5 = h4.g.f11907f;
            u2.r.J(eVar5, a10, qVar3);
            h4.e eVar6 = h4.g.f11906e;
            u2.r.J(eVar6, l4, qVar3);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar7 = h4.g.f11908g;
            u2.r.y(qVar3, valueOf, eVar7);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar3);
            h4.e eVar8 = h4.g.f11905d;
            u2.r.J(eVar8, c5, qVar3);
            if (z6) {
                qVar3.X(1204622039);
                int i26 = i24 >> 12;
                qVar2 = qVar3;
                i12 = i25;
                eVar2 = eVar5;
                eVar = eVar6;
                eVar3 = eVar8;
                eVar4 = eVar7;
                PreviewButton(str3, z11, aVar4, aVar2, p2.e(qVar4, 1.0f), qVar2, (i26 & 14) | 24576 | (i26 & 112) | (i26 & 896) | (i26 & 7168), 0);
                ib.i.o(echoTheme, qVar2, i12, qVar4, qVar2);
                i13 = 0;
                qVar2.p(false);
            } else {
                eVar = eVar6;
                eVar2 = eVar5;
                i12 = i25;
                qVar2 = qVar3;
                eVar3 = eVar8;
                i13 = 0;
                eVar4 = eVar7;
                qVar2.X(1204978570);
                qVar2.p(false);
            }
            i3.t t10 = r1.d.t(qVar4, i1.f29224a);
            k2 a11 = i2.a(ib.i.m(echoTheme, qVar2, i12), i3.d.f13004y0, qVar2, i13);
            int hashCode2 = Long.hashCode(qVar2.T);
            c3.o l7 = qVar2.l();
            i3.t c10 = i3.a.c(t10, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(eVar2, a11, qVar2);
            u2.r.J(eVar, l7, qVar2);
            defpackage.f.u(hashCode2, qVar2, eVar4, qVar2, dVar);
            u2.r.J(eVar3, c10, qVar2);
            Context context = (Context) qVar2.j(AndroidCompositionLocals_androidKt.f2291b);
            int i27 = io.elevenlabs.ui.R.drawable.add_to_basket;
            int i28 = R.string.read_details_purchase_action;
            if (str == null) {
                qVar2.X(2111011422);
                str4 = kj.c.R(qVar2, R.string.explore_book_paid);
                z13 = false;
                qVar2.p(false);
            } else {
                z13 = false;
                qVar2.X(2111010864);
                qVar2.p(false);
                str4 = str;
            }
            String Q = kj.c.Q(i28, new Object[]{str4}, qVar2);
            EchoButtonVariant echoButtonVariant = EchoButtonVariant.Primary;
            EchoButtonSize echoButtonSize = EchoButtonSize.Medium;
            boolean z15 = !z10;
            boolean h10 = qVar2.h(context);
            if ((i24 & 234881024) == 67108864) {
                z14 = true;
            } else {
                z14 = z13;
            }
            boolean z16 = h10 | z14;
            Object L = qVar2.L();
            if (!z16 && L != u2.l.f33918a) {
                lVar2 = lVar;
            } else {
                lVar2 = lVar;
                L = new z(context, lVar2, 3);
                qVar2.h0(L);
            }
            u2.q qVar5 = qVar2;
            EchoIconButtonKt.EchoIconButton(i27, (ho.a) L, null, Q, echoButtonVariant, echoButtonSize, z15, z10, false, qVar5, (29360128 & (i24 << 12)) | 221184, 260);
            FullWidthButtonVariant fullWidthButtonVariant = FullWidthButtonVariant.Primary;
            FullWidthButtonSize fullWidthButtonSize = FullWidthButtonSize.Large;
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            FullWidthButtonKt.EchoThemeFullWidthButton(str2, aVar3, i4.i0.x(p2.c(new m1(1.0f, true), 1.0f), "reader-details-try-ultra"), fullWidthButtonSize, fullWidthButtonVariant, null, false, false, false, qVar5, ((i24 >> 6) & 14) | 27648 | ((i24 >> 24) & 112), 480);
            qVar = qVar5;
            qVar.p(true);
            qVar.p(true);
        } else {
            lVar2 = lVar;
            qVar = qVar3;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            final ho.l lVar3 = lVar2;
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.e0
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z PurchaseOrUltraLayout$lambda$1;
                    int intValue = ((Integer) obj2).intValue();
                    PurchaseOrUltraLayout$lambda$1 = ReadDetailsScreenKt.PurchaseOrUltraLayout$lambda$1(z6, str, str2, z10, str3, z11, aVar, aVar2, lVar3, aVar3, i10, (u2.m) obj, intValue);
                    return PurchaseOrUltraLayout$lambda$1;
                }
            };
        }
    }

    public static final sn.z PurchaseOrUltraLayout$lambda$0$0$0$0(Context context, ho.l lVar) {
        Activity findActivity = ContextExtensionsKt.findActivity(context);
        if (findActivity != null) {
            lVar.invoke(findActivity);
        }
        return sn.z.f31622a;
    }

    public static final sn.z PurchaseOrUltraLayout$lambda$1(boolean z6, String str, String str2, boolean z10, String str3, boolean z11, ho.a aVar, ho.a aVar2, ho.l lVar, ho.a aVar3, int i10, u2.m mVar, int i11) {
        PurchaseOrUltraLayout(z6, str, str2, z10, str3, z11, aVar, aVar2, lVar, aVar3, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ReadActionsSection(ho.a aVar, ho.a aVar2, i3.t tVar, u2.m mVar, int i10, int i11) {
        ho.a aVar3;
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        u2.q qVar;
        i3.t tVar3;
        r1 r10;
        i3.t tVar4;
        int i14;
        int i15;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-994063233);
        if ((i10 & 6) == 0) {
            aVar3 = aVar;
            if (qVar2.h(aVar3)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            aVar3 = aVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(aVar2)) {
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
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
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
                if (i16 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                i3.t e10 = p2.e(tVar4, 1.0f);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i17 = EchoTheme.$stable;
                i3.t G = r1.d.G(e10, echoTheme.getSpacings(qVar2, i17).getX5(), t2.u.P, 2);
                u0 u0Var = r1.j.f29228a;
                r1.x a10 = r1.w.a(ib.i.m(echoTheme, qVar2, i17), i3.d.C0, qVar2, 48);
                int hashCode = Long.hashCode(qVar2.T);
                c3.o l4 = qVar2.l();
                i3.t c5 = i3.a.c(G, qVar2);
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
                String R = kj.c.R(qVar2, R.string.rating_title);
                EchoButtonVariant echoButtonVariant = EchoButtonVariant.Secondary;
                EchoButtonSize echoButtonSize = EchoButtonSize.Medium;
                i3.t tVar5 = tVar4;
                EchoButtonKt.m1835EchoButton562pCRU(R, aVar2, null, echoButtonVariant, echoButtonSize, null, false, true, null, false, false, qVar2, (i12 & 112) | 12610560, 0, 1892);
                EchoButtonKt.m1835EchoButton562pCRU(kj.c.R(qVar2, R.string.read_details_report_problem), aVar3, null, EchoButtonVariant.Ghost, echoButtonSize, null, false, true, null, false, false, qVar2, ((i12 << 3) & 112) | 12610560, 0, 1892);
                qVar = qVar2;
                qVar.p(true);
                tVar3 = tVar5;
            } else {
                qVar = qVar2;
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new im.c(aVar, aVar2, tVar3, i10, i11, 1);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z ReadActionsSection$lambda$1(ho.a aVar, ho.a aVar2, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        ReadActionsSection(aVar, aVar2, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    private static final void ReadDetailsBottomActions(final boolean z6, final ExplorePricingType explorePricingType, final Boolean bool, final boolean z10, final boolean z11, final PurchaseState purchaseState, final String str, final String str2, final String str3, final String str4, final boolean z12, final String str5, final ho.a aVar, final ho.a aVar2, final ho.a aVar3, final ho.l lVar, final ho.a aVar4, i3.t tVar, u2.m mVar, final int i10, final int i11, final int i12) {
        int i13;
        int i14;
        ho.a aVar5;
        Boolean bool2;
        final i3.t tVar2;
        ho.p pVar;
        r1 r1Var;
        ButtonLayoutState.MainButtonType mainButtonType;
        String R;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2143651430);
        if ((i10 & 6) == 0) {
            i13 = (qVar.g(z6) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            i13 |= qVar.d(explorePricingType.ordinal()) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i13 |= qVar.f(bool) ? 256 : 128;
        }
        int i15 = i10 & 3072;
        int i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i15 == 0) {
            i13 |= qVar.g(z10) ? 2048 : 1024;
        }
        int i17 = i10 & 24576;
        int i18 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i17 == 0) {
            i13 |= qVar.g(z11) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i13 |= qVar.h(purchaseState) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i13 |= qVar.f(str) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i13 |= qVar.f(str2) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i13 |= qVar.f(str3) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i13 |= qVar.f(str4) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i14 = (qVar.g(z12) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            i14 |= qVar.f(str5) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            aVar5 = aVar;
            i14 |= qVar.h(aVar5) ? 256 : 128;
        } else {
            aVar5 = aVar;
        }
        if ((i11 & 3072) == 0) {
            if (qVar.h(aVar2)) {
                i16 = 2048;
            }
            i14 |= i16;
        }
        if ((i11 & 24576) == 0) {
            if (qVar.h(aVar3)) {
                i18 = 16384;
            }
            i14 |= i18;
        }
        if ((i11 & 196608) == 0) {
            i14 |= qVar.h(lVar) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i14 |= qVar.h(aVar4) ? 1048576 : 524288;
        }
        int i19 = i12 & 131072;
        if (i19 != 0) {
            i14 |= 12582912;
        } else if ((i11 & 12582912) == 0) {
            i14 |= qVar.f(tVar) ? 8388608 : 4194304;
        }
        if (qVar.O(i13 & 1, ((i13 & 306783379) == 306783378 && (4793491 & i14) == 4793490) ? false : true)) {
            i3.t tVar3 = i19 != 0 ? i3.q.f13017a : tVar;
            boolean z13 = (str3 == null && str4 == null) ? false : true;
            if (str5 != null) {
                qVar.X(-348259317);
                int i20 = i14 >> 3;
                int i21 = (i20 & 14) | ((i13 >> 21) & 896) | ((i14 << 9) & 7168);
                int i22 = i14 << 6;
                DisabledReasonLayout(str5, z13, str4, z12, aVar5, aVar2, tVar3, qVar, i21 | (57344 & i22) | (i22 & 458752) | (i20 & 3670016), 0);
                qVar.p(false);
                r1 r10 = qVar.r();
                if (r10 != null) {
                    final int i23 = 0;
                    final i3.t tVar4 = tVar3;
                    pVar = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.c0
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            sn.z ReadDetailsBottomActions$lambda$0;
                            sn.z ReadDetailsBottomActions$lambda$3;
                            u2.m mVar2 = (u2.m) obj;
                            switch (i23) {
                                case 0:
                                    ReadDetailsBottomActions$lambda$0 = ReadDetailsScreenKt.ReadDetailsBottomActions$lambda$0(z6, explorePricingType, bool, z10, z11, purchaseState, str, str2, str3, str4, z12, str5, aVar, aVar2, aVar3, lVar, aVar4, tVar4, i10, i11, i12, mVar2, ((Integer) obj2).intValue());
                                    return ReadDetailsBottomActions$lambda$0;
                                default:
                                    ReadDetailsBottomActions$lambda$3 = ReadDetailsScreenKt.ReadDetailsBottomActions$lambda$3(z6, explorePricingType, bool, z10, z11, purchaseState, str, str2, str3, str4, z12, str5, aVar, aVar2, aVar3, lVar, aVar4, tVar4, i10, i11, i12, mVar2, ((Integer) obj2).intValue());
                                    return ReadDetailsBottomActions$lambda$3;
                            }
                        }
                    };
                    r1Var = r10;
                    r1Var.f34012d = pVar;
                }
                return;
            }
            bool2 = bool;
            qVar.X(-347904708);
            qVar.p(false);
            boolean z14 = !z6 && z13;
            if (z6) {
                mainButtonType = ButtonLayoutState.MainButtonType.Play;
            } else if (kotlin.jvm.internal.m.c(bool2, Boolean.FALSE) && explorePricingType == ExplorePricingType.Ultra) {
                mainButtonType = ButtonLayoutState.MainButtonType.Play;
            } else {
                Boolean bool3 = Boolean.TRUE;
                if (kotlin.jvm.internal.m.c(bool2, bool3) && explorePricingType == ExplorePricingType.Ultra && purchaseState != null) {
                    mainButtonType = ButtonLayoutState.MainButtonType.PurchaseOrUltra;
                } else if (kotlin.jvm.internal.m.c(bool2, bool3) && explorePricingType == ExplorePricingType.Ultra) {
                    mainButtonType = ButtonLayoutState.MainButtonType.TryUltra;
                } else if (purchaseState != null) {
                    mainButtonType = ButtonLayoutState.MainButtonType.Purchase;
                } else {
                    mainButtonType = ButtonLayoutState.MainButtonType.Play;
                }
            }
            ButtonLayoutState buttonLayoutState = (ButtonLayoutState) rememberDebouncedValue(new ButtonLayoutState(z14, mainButtonType), 0L, qVar, 0, 2);
            if (z10 && str2 != null) {
                qVar.X(-347011133);
                R = kj.c.Q(R.string.read_details_try_ultra_trial, new Object[]{str2}, qVar);
                qVar.p(false);
            } else {
                qVar.X(-346917761);
                R = kj.c.R(qVar, R.string.read_details_upgrade);
                qVar.p(false);
            }
            final String str6 = R;
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new t(6);
                qVar.h0(L);
            }
            qVar = qVar;
            i1.l.b(buttonLayoutState, tVar3, (ho.l) L, null, "button_layout_crossfade", null, c3.k.d(-1070780170, true, new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.d0
                @Override // ho.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    sn.z ReadDetailsBottomActions$lambda$2;
                    int intValue = ((Integer) obj4).intValue();
                    ReadDetailsBottomActions$lambda$2 = ReadDetailsScreenKt.ReadDetailsBottomActions$lambda$2(PurchaseState.this, str, str6, str4, z12, aVar, aVar2, lVar, aVar4, z11, aVar3, (i1.o) obj, (ButtonLayoutState) obj2, (u2.m) obj3, intValue);
                    return ReadDetailsBottomActions$lambda$2;
                }
            }, qVar), qVar, ((i14 >> 18) & 112) | 1597824, 40);
            tVar2 = tVar3;
        } else {
            bool2 = bool;
            qVar.R();
            tVar2 = tVar;
        }
        r1 r11 = qVar.r();
        if (r11 != null) {
            final int i24 = 1;
            final Boolean bool4 = bool2;
            pVar = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.c0
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z ReadDetailsBottomActions$lambda$0;
                    sn.z ReadDetailsBottomActions$lambda$3;
                    u2.m mVar2 = (u2.m) obj;
                    switch (i24) {
                        case 0:
                            ReadDetailsBottomActions$lambda$0 = ReadDetailsScreenKt.ReadDetailsBottomActions$lambda$0(z6, explorePricingType, bool4, z10, z11, purchaseState, str, str2, str3, str4, z12, str5, aVar, aVar2, aVar3, lVar, aVar4, tVar2, i10, i11, i12, mVar2, ((Integer) obj2).intValue());
                            return ReadDetailsBottomActions$lambda$0;
                        default:
                            ReadDetailsBottomActions$lambda$3 = ReadDetailsScreenKt.ReadDetailsBottomActions$lambda$3(z6, explorePricingType, bool4, z10, z11, purchaseState, str, str2, str3, str4, z12, str5, aVar, aVar2, aVar3, lVar, aVar4, tVar2, i10, i11, i12, mVar2, ((Integer) obj2).intValue());
                            return ReadDetailsBottomActions$lambda$3;
                    }
                }
            };
            r1Var = r11;
            r1Var.f34012d = pVar;
        }
    }

    public static final sn.z ReadDetailsBottomActions$lambda$0(boolean z6, ExplorePricingType explorePricingType, Boolean bool, boolean z10, boolean z11, PurchaseState purchaseState, String str, String str2, String str3, String str4, boolean z12, String str5, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.l lVar, ho.a aVar4, i3.t tVar, int i10, int i11, int i12, u2.m mVar, int i13) {
        ReadDetailsBottomActions(z6, explorePricingType, bool, z10, z11, purchaseState, str, str2, str3, str4, z12, str5, aVar, aVar2, aVar3, lVar, aVar4, tVar, mVar, u2.r.M(i10 | 1), u2.r.M(i11), i12);
        return sn.z.f31622a;
    }

    public static final i1.m0 ReadDetailsBottomActions$lambda$1$0(i1.q qVar) {
        qVar.getClass();
        return crossfadeWithStagger$default(0, t2.u.P, 3, null);
    }

    public static final sn.z ReadDetailsBottomActions$lambda$2(PurchaseState purchaseState, String str, String str2, String str3, boolean z6, ho.a aVar, ho.a aVar2, ho.l lVar, ho.a aVar3, boolean z10, ho.a aVar4, i1.o oVar, ButtonLayoutState buttonLayoutState, u2.m mVar, int i10) {
        String str4;
        String str5;
        boolean z11;
        boolean z12;
        RawOneTimeProduct product;
        MoneyPrice price;
        oVar.getClass();
        buttonLayoutState.getClass();
        if (purchaseState != null && (product = purchaseState.getProduct()) != null && (price = product.getPrice()) != null) {
            str4 = MoneyPriceFormatterKt.format(price);
        } else {
            str4 = null;
        }
        if (str4 == null) {
            if (purchaseState != null && purchaseState.isLoadingPurchase()) {
                str5 = null;
            } else {
                str5 = str;
            }
        } else {
            str5 = str4;
        }
        if (buttonLayoutState.getMainButtonType() == ButtonLayoutState.MainButtonType.PurchaseOrUltra) {
            u2.q qVar = (u2.q) mVar;
            qVar.X(-889628378);
            boolean showPreviewButton = buttonLayoutState.getShowPreviewButton();
            if (purchaseState != null && purchaseState.isLoading()) {
                z12 = true;
            } else {
                z12 = false;
            }
            PurchaseOrUltraLayout(showPreviewButton, str5, str2, z12, str3, z6, aVar, aVar2, lVar, aVar3, qVar, 0);
            qVar.p(false);
        } else {
            u2.q qVar2 = (u2.q) mVar;
            qVar2.X(-889042726);
            if (purchaseState != null && purchaseState.isLoading()) {
                z11 = true;
            } else {
                z11 = false;
            }
            SingleRowLayout(buttonLayoutState, str5, str2, z11, str3, z6, z10, aVar, aVar2, aVar4, lVar, aVar3, qVar2, (i10 >> 3) & 14, 0);
            qVar2.p(false);
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsBottomActions$lambda$3(boolean z6, ExplorePricingType explorePricingType, Boolean bool, boolean z10, boolean z11, PurchaseState purchaseState, String str, String str2, String str3, String str4, boolean z12, String str5, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.l lVar, ho.a aVar4, i3.t tVar, int i10, int i11, int i12, u2.m mVar, int i13) {
        ReadDetailsBottomActions(z6, explorePricingType, bool, z10, z11, purchaseState, str, str2, str3, str4, z12, str5, aVar, aVar2, aVar3, lVar, aVar4, tVar, mVar, u2.r.M(i10 | 1), u2.r.M(i11), i12);
        return sn.z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* renamed from: ReadDetailsContent-n2tekjI */
    private static final void m1715ReadDetailsContentn2tekjI(final ReadDetailsResponse readDetailsResponse, final boolean z6, final ExplorePricingType explorePricingType, final Boolean bool, final boolean z10, final boolean z11, final PurchaseState purchaseState, final PaymentConfig paymentConfig, final ReadMeta readMeta, final String str, final String str2, final boolean z12, final Map<String, MoneyPrice> map, final String str3, final String str4, final ho.a aVar, final ho.l lVar, final ho.a aVar2, final ho.a aVar3, final ho.l lVar2, final ho.l lVar3, final ho.a aVar4, final ho.a aVar5, final ho.l lVar4, final ho.a aVar6, final ho.p pVar, float f10, i3.t tVar, u2.m mVar, final int i10, final int i11, final int i12, final int i13) {
        int i14;
        int i15;
        int i16;
        u2.q qVar;
        final float f11;
        final i3.t tVar2;
        ?? r02;
        List<MetaItem> computeFallbackMetaItems;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-45584244);
        if ((i10 & 6) == 0) {
            i14 = (qVar2.h(readDetailsResponse) ? 4 : 2) | i10;
        } else {
            i14 = i10;
        }
        if ((i10 & 48) == 0) {
            i14 |= qVar2.g(z6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i14 |= qVar2.d(explorePricingType.ordinal()) ? 256 : 128;
        }
        int i17 = i10 & 3072;
        int i18 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i17 == 0) {
            i14 |= qVar2.f(bool) ? 2048 : 1024;
        }
        int i19 = i10 & 24576;
        int i20 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i19 == 0) {
            i14 |= qVar2.g(z10) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i14 |= qVar2.g(z11) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i14 |= qVar2.h(purchaseState) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i14 |= qVar2.h(paymentConfig) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i14 |= qVar2.h(readMeta) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i14 |= qVar2.f(str) ? 536870912 : 268435456;
        }
        int i21 = i14;
        if ((i11 & 6) == 0) {
            i15 = i11 | (qVar2.f(str2) ? 4 : 2);
        } else {
            i15 = i11;
        }
        if ((i11 & 48) == 0) {
            i15 |= qVar2.g(z12) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i15 |= qVar2.h(map) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i15 |= qVar2.f(str3) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i15 |= qVar2.f(str4) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i15 |= qVar2.h(aVar) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i15 |= qVar2.h(lVar) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i15 |= qVar2.h(aVar2) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i15 |= qVar2.h(aVar3) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i15 |= qVar2.h(lVar2) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i16 = i12 | (qVar2.h(lVar3) ? 4 : 2);
        } else {
            i16 = i12;
        }
        if ((i12 & 48) == 0) {
            i16 |= qVar2.h(aVar4) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i16 |= qVar2.h(aVar5) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            if (qVar2.h(lVar4)) {
                i18 = 2048;
            }
            i16 |= i18;
        }
        if ((i12 & 24576) == 0) {
            if (qVar2.h(aVar6)) {
                i20 = 16384;
            }
            i16 |= i20;
        }
        if ((i12 & 196608) == 0) {
            i16 |= qVar2.h(pVar) ? 131072 : 65536;
        }
        int i22 = i13 & 67108864;
        if (i22 != 0) {
            i16 |= 1572864;
        } else if ((i12 & 1572864) == 0) {
            i16 |= qVar2.c(f10) ? 1048576 : 524288;
        }
        int i23 = i13 & 134217728;
        if (i23 != 0) {
            i16 |= 12582912;
        } else if ((i12 & 12582912) == 0) {
            i16 |= qVar2.f(tVar) ? 8388608 : 4194304;
        }
        if (qVar2.O(i21 & 1, ((i21 & 306783379) == 306783378 && (i15 & 306783379) == 306783378 && (i16 & 4793491) == 4793490) ? false : true)) {
            final float f12 = i22 != 0 ? 0 : f10;
            i3.q qVar3 = i3.q.f13017a;
            i3.t tVar3 = i23 != 0 ? qVar3 : tVar;
            Object L = qVar2.L();
            if (L == u2.l.f33918a) {
                r02 = 0;
                L = com.google.android.gms.internal.play_billing.b.t(0, qVar2);
            } else {
                r02 = 0;
            }
            final x0 x0Var = (x0) L;
            final float rememberPxToDp = ComposeExtensionsKt.rememberPxToDp(ReadDetailsContent_n2tekjI$lambda$1(x0Var), (u2.m) qVar2, (int) r02);
            if (readMeta == null) {
                qVar2.X(-789359919);
                qVar2.p(r02);
                computeFallbackMetaItems = null;
            } else {
                qVar2.X(-789359918);
                computeFallbackMetaItems = computeFallbackMetaItems(readMeta, qVar2, r02);
                qVar2.p(r02);
            }
            if (computeFallbackMetaItems == null) {
                computeFallbackMetaItems = tn.t.f33547a;
            }
            final List<MetaItem> list = computeFallbackMetaItems;
            i3.t tVar4 = tVar3;
            final c3.j d10 = c3.k.d(2050097311, true, new h2.d(purchaseState, paymentConfig, explorePricingType, bool, 7), qVar2);
            i3.t d11 = p2.d(tVar4, 1.0f);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar2, 0);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c5 = i3.a.c(d11, qVar2);
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
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i24 = EchoTheme.$stable;
            EchoThemeColors.Background background = echoTheme.getColors(qVar2, i24).getBackground();
            int i25 = EchoThemeColors.Background.$stable;
            final long primary = background.getPrimary(qVar2, i25);
            float f13 = f12;
            u2.r.b(new fe.h0[]{LocalExplorePricesKt.getLocalExplorePrices().a(map), LocalExplorePricesKt.getLocalIsFreeUser().a(bool)}, c3.k.d(-1243984490, true, new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.v
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z ReadDetailsContent_n2tekjI$lambda$5$0;
                    int intValue = ((Integer) obj2).intValue();
                    ReadDetailsContent_n2tekjI$lambda$5$0 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$5$0(r1.z.f29398a, ReadDetailsResponse.this, rememberPxToDp, lVar2, f12, list, aVar4, aVar5, lVar3, lVar, str3, primary, d10, x0Var, pVar, (u2.m) obj, intValue);
                    return ReadDetailsContent_n2tekjI$lambda$5$0;
                }
            }, qVar2), qVar2, 56);
            int i26 = i15 >> 9;
            int i27 = ((i15 >> 3) & 14) | (i26 & 112) | (i26 & 896);
            int i28 = i15 >> 12;
            int i29 = i27 | (i28 & 7168) | (i28 & 57344);
            int i30 = i16 << 6;
            ReadDetailsBottomActions(z6, explorePricingType, bool, z10, z11, purchaseState, paymentConfig != null ? paymentConfig.getPriceFormatted() : null, paymentConfig != null ? paymentConfig.getZeroPriceFormatted() : null, str, str2, z12, str4, aVar, aVar2, aVar3, lVar4, aVar6, l1.n.h(p2.e(qVar3, 1.0f), ib.i.D(i24, i25, echoTheme, qVar2, qVar2), p3.h0.f26395b), qVar2, ((i21 >> 3) & 235405310) | ((i15 << 27) & 1879048192), i29 | (458752 & i30) | (i30 & 3670016), 0);
            qVar = qVar2;
            qVar.p(true);
            f11 = f13;
            tVar2 = tVar4;
        } else {
            qVar = qVar2;
            qVar.R();
            f11 = f10;
            tVar2 = tVar;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.w
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z ReadDetailsContent_n2tekjI$lambda$6;
                    int intValue = ((Integer) obj2).intValue();
                    ReadDetailsContent_n2tekjI$lambda$6 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$6(ReadDetailsResponse.this, z6, explorePricingType, bool, z10, z11, purchaseState, paymentConfig, readMeta, str, str2, z12, map, str3, str4, aVar, lVar, aVar2, aVar3, lVar2, lVar3, aVar4, aVar5, lVar4, aVar6, pVar, f11, tVar2, i10, i11, i12, i13, (u2.m) obj, intValue);
                    return ReadDetailsContent_n2tekjI$lambda$6;
                }
            };
        }
    }

    private static final int ReadDetailsContent_n2tekjI$lambda$1(x0 x0Var) {
        return ((f1) x0Var).h();
    }

    private static final void ReadDetailsContent_n2tekjI$lambda$2(x0 x0Var, int i10) {
        ((f1) x0Var).i(i10);
    }

    public static final sn.z ReadDetailsContent_n2tekjI$lambda$4(PurchaseState purchaseState, PaymentConfig paymentConfig, ExplorePricingType explorePricingType, Boolean bool, u2.m mVar, int i10) {
        boolean z6;
        MoneyPrice moneyPrice;
        boolean z10;
        String str;
        String str2;
        boolean z11;
        RawOneTimeProduct product;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String str3 = null;
            if (purchaseState != null && (product = purchaseState.getProduct()) != null) {
                moneyPrice = product.getPrice();
            } else {
                moneyPrice = null;
            }
            if (purchaseState != null && purchaseState.isLoadingPurchase()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (paymentConfig != null) {
                str = paymentConfig.getPriceFormatted();
            } else {
                str = null;
            }
            if (paymentConfig != null) {
                str2 = paymentConfig.getAndroidProductId();
            } else {
                str2 = null;
            }
            if (str2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (paymentConfig != null) {
                str3 = paymentConfig.getZeroPriceFormatted();
            }
            ReadPricingRowKt.m1089ReadPricingRowKNANIv4(explorePricingType, moneyPrice, z10, str, z11, null, bool, null, str3, ReadPricingUltraRowStyle.Full, null, 0L, qVar, 805306368, 0, 3232);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsContent_n2tekjI$lambda$5$0(r1.y yVar, final ReadDetailsResponse readDetailsResponse, float f10, final ho.l lVar, final float f11, final List list, final ho.a aVar, final ho.a aVar2, final ho.l lVar2, final ho.l lVar3, final String str, long j4, final ho.p pVar, x0 x0Var, ho.p pVar2, u2.m mVar, int i10) {
        boolean z6;
        i3.t c5;
        final boolean z10;
        int i11;
        Object obj;
        float f12;
        i3.l lVar4 = i3.d.f12997a;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            c5 = ((r1.z) yVar).c(qVar2, 1.0f, true);
            f4.f1 d10 = r1.p.d(lVar4, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c10 = i3.a.c(c5, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, d10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c10, qVar);
            List<ReadDetailsSection> sections = readDetailsResponse.getSections();
            if (sections == null || !sections.isEmpty()) {
                Iterator<T> it = sections.iterator();
                while (it.hasNext()) {
                    if (((ReadDetailsSection) it.next()) instanceof ReadDetailsSection.Meta) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            i3.t d11 = p2.d(qVar2, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i12 = EchoTheme.$stable;
            float x52 = echoTheme.getSpacings(qVar, i12).getX5() + f10;
            float x10 = echoTheme.getSpacings(qVar, i12).getX10();
            if (x52 < x10) {
                x52 = x10;
            }
            d2 f13 = r1.d.f(t2.u.P, t2.u.P, t2.u.P, x52, 7);
            boolean h10 = qVar.h(readDetailsResponse) | qVar.f(lVar) | qVar.c(f11) | qVar.g(z10) | qVar.h(list) | qVar.f(aVar) | qVar.f(aVar2) | qVar.f(lVar2) | qVar.f(lVar3) | qVar.f(str);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (h10 || L == eVar) {
                i11 = i12;
                f12 = t2.u.P;
                obj = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.f0
                    @Override // ho.l
                    public final Object invoke(Object obj2) {
                        sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0;
                        ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0(ReadDetailsResponse.this, pVar, z10, list, lVar, f11, aVar, aVar2, lVar2, lVar3, str, (t1.t) obj2);
                        return ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0;
                    }
                };
                qVar.h0(obj);
            } else {
                obj = L;
                i11 = i12;
                f12 = t2.u.P;
            }
            c1.c(d11, null, f13, false, null, null, null, false, null, (ho.l) obj, qVar, 6, 506);
            i3.l lVar5 = i3.d.Z;
            r1.t tVar = r1.t.f29349a;
            i3.t e10 = p2.e(tVar.b(qVar2, lVar5), 1.0f);
            float x82 = echoTheme.getSpacings(qVar, i11).getX8();
            if (f10 >= x82) {
                x82 = f10;
            }
            r1.p.a(l1.n.g(p2.f(e10, x82), p3.s.c(p3.t.Companion, new sn.k[]{new sn.k(Float.valueOf(f12), new p3.x(p3.x.b(f12, j4))), new sn.k(Float.valueOf(1.0f), new p3.x(j4))}), null, 6), qVar, 0);
            i3.t b10 = tVar.b(qVar2, lVar5);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new f(x0Var, 0);
                qVar.h0(L2);
            }
            i3.t q = f4.i0.q(b10, (ho.l) L2);
            f4.f1 d12 = r1.p.d(lVar4, false);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c11 = i3.a.c(q, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar2 = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar2);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, d12, qVar);
            u2.r.J(h4.g.f11906e, l7, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode2), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c11, qVar);
            j0.c.r(0, pVar2, qVar, true, true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0(ReadDetailsResponse readDetailsResponse, final ho.p pVar, final boolean z6, final List list, final ho.l lVar, final float f10, ho.a aVar, ho.a aVar2, ho.l lVar2, ho.l lVar3, String str, t1.t tVar) {
        tVar.getClass();
        int i10 = 0;
        for (Object obj : readDetailsResponse.getSections()) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                ReadDetailsSection readDetailsSection = (ReadDetailsSection) obj;
                if (i10 > 0) {
                    if (readDetailsSection instanceof ReadDetailsSection.Meta) {
                        t1.t.c(tVar, null, null, ComposableSingletons$ReadDetailsScreenKt.INSTANCE.getLambda$1691591402$app_productionRelease(), 3);
                    } else if (readDetailsSection instanceof ReadDetailsSection.TitleDescription) {
                        t1.t.c(tVar, null, null, ComposableSingletons$ReadDetailsScreenKt.INSTANCE.getLambda$2032918881$app_productionRelease(), 3);
                    } else if (readDetailsSection instanceof ReadDetailsSection.Author) {
                        t1.t.c(tVar, null, null, ComposableSingletons$ReadDetailsScreenKt.INSTANCE.getLambda$1806971362$app_productionRelease(), 3);
                    } else if (readDetailsSection instanceof ReadDetailsSection.Reads) {
                        t1.t.c(tVar, null, null, ComposableSingletons$ReadDetailsScreenKt.INSTANCE.getLambda$1581023843$app_productionRelease(), 3);
                    } else if (readDetailsSection instanceof ReadDetailsSection.ReadsV2) {
                        t1.t.c(tVar, null, null, ComposableSingletons$ReadDetailsScreenKt.INSTANCE.getLambda$1355076324$app_productionRelease(), 3);
                    } else if (readDetailsSection instanceof ReadDetailsSection.FlatCarousel) {
                        t1.t.c(tVar, null, null, ComposableSingletons$ReadDetailsScreenKt.INSTANCE.getLambda$1129128805$app_productionRelease(), 3);
                    } else {
                        t1.t.c(tVar, null, null, ComposableSingletons$ReadDetailsScreenKt.INSTANCE.getLambda$130181569$app_productionRelease(), 3);
                    }
                }
                if (readDetailsSection instanceof ReadDetailsSection.MediaHeader) {
                    final ReadDetailsSection.MediaHeader mediaHeader = (ReadDetailsSection.MediaHeader) readDetailsSection;
                    t1.t.c(tVar, null, null, new c3.j(new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.r
                        @Override // ho.q
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$0;
                            int intValue = ((Integer) obj4).intValue();
                            ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$0 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$0(ReadDetailsSection.MediaHeader.this, pVar, z6, list, lVar, f10, (t1.b) obj2, (u2.m) obj3, intValue);
                            return ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$0;
                        }
                    }, true, -1334662555), 3);
                } else if (readDetailsSection instanceof ReadDetailsSection.Meta) {
                    t1.t.c(tVar, null, null, new c3.j(new i((ReadDetailsSection.Meta) readDetailsSection, list, 1), true, 1102659996), 3);
                } else if (readDetailsSection instanceof ReadDetailsSection.TitleDescription) {
                    final ReadDetailsSection.TitleDescription titleDescription = (ReadDetailsSection.TitleDescription) readDetailsSection;
                    final int i12 = 1;
                    t1.t.c(tVar, null, null, new c3.j(new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.s
                        @Override // ho.q
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$10;
                            sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$2;
                            sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$3;
                            sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$6;
                            switch (i12) {
                                case 0:
                                    ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$10 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$10((ReadDetailsSection.Chapters) titleDescription, (t1.b) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                    return ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$10;
                                case 1:
                                    ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$2 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$2((ReadDetailsSection.TitleDescription) titleDescription, (t1.b) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                    return ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$2;
                                case 2:
                                    ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$3 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$3((ReadDetailsSection.Details) titleDescription, (t1.b) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                    return ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$3;
                                default:
                                    ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$6 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$6((ReadDetailsSection.FlatCarousel) titleDescription, (t1.b) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                    return ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$6;
                            }
                        }
                    }, true, -2081222819), 3);
                } else if (readDetailsSection instanceof ReadDetailsSection.Details) {
                    final ReadDetailsSection.Details details = (ReadDetailsSection.Details) readDetailsSection;
                    final int i13 = 2;
                    t1.t.c(tVar, null, null, new c3.j(new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.s
                        @Override // ho.q
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$10;
                            sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$2;
                            sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$3;
                            sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$6;
                            switch (i13) {
                                case 0:
                                    ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$10 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$10((ReadDetailsSection.Chapters) details, (t1.b) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                    return ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$10;
                                case 1:
                                    ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$2 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$2((ReadDetailsSection.TitleDescription) details, (t1.b) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                    return ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$2;
                                case 2:
                                    ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$3 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$3((ReadDetailsSection.Details) details, (t1.b) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                    return ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$3;
                                default:
                                    ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$6 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$6((ReadDetailsSection.FlatCarousel) details, (t1.b) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                    return ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$6;
                            }
                        }
                    }, true, -970138338), 3);
                } else {
                    if (readDetailsSection instanceof ReadDetailsSection.ReadActions) {
                        t1.t.c(tVar, null, null, new c3.j(new i(aVar, aVar2, 2), true, 140946143), 3);
                    } else if (readDetailsSection instanceof ReadDetailsSection.Author) {
                        t1.t.c(tVar, null, null, new c3.j(new i((ReadDetailsSection.Author) readDetailsSection, lVar, 3), true, 1252030624), 3);
                    } else if (readDetailsSection instanceof ReadDetailsSection.FlatCarousel) {
                        final ReadDetailsSection.FlatCarousel flatCarousel = (ReadDetailsSection.FlatCarousel) readDetailsSection;
                        final int i14 = 3;
                        t1.t.c(tVar, null, null, new c3.j(new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.s
                            @Override // ho.q
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$10;
                                sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$2;
                                sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$3;
                                sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$6;
                                switch (i14) {
                                    case 0:
                                        ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$10 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$10((ReadDetailsSection.Chapters) flatCarousel, (t1.b) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                        return ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$10;
                                    case 1:
                                        ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$2 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$2((ReadDetailsSection.TitleDescription) flatCarousel, (t1.b) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                        return ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$2;
                                    case 2:
                                        ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$3 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$3((ReadDetailsSection.Details) flatCarousel, (t1.b) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                        return ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$3;
                                    default:
                                        ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$6 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$6((ReadDetailsSection.FlatCarousel) flatCarousel, (t1.b) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                        return ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$6;
                                }
                            }
                        }, true, -1931852191), 3);
                    } else if (readDetailsSection instanceof ReadDetailsSection.Reads) {
                        t1.t.c(tVar, null, null, new c3.j(new n2((ReadDetailsSection.Reads) readDetailsSection, lVar2, lVar3, str, 11), true, -820767710), 3);
                    } else if (readDetailsSection instanceof ReadDetailsSection.ReadsV2) {
                        t1.t.c(tVar, null, null, new c3.j(new n2((ReadDetailsSection.ReadsV2) readDetailsSection, lVar2, lVar3, str, 12), true, 290316771), 3);
                    } else {
                        if (readDetailsSection instanceof ReadDetailsSection.Read) {
                            t1.t.c(tVar, null, null, new c3.j(new i((ReadDetailsSection.Read) readDetailsSection, lVar2, 4), true, 1401401252), 3);
                        } else if (readDetailsSection instanceof ReadDetailsSection.Chapters) {
                            final ReadDetailsSection.Chapters chapters = (ReadDetailsSection.Chapters) readDetailsSection;
                            final int i15 = 0;
                            t1.t.c(tVar, null, null, new c3.j(new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.s
                                @Override // ho.q
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$10;
                                    sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$2;
                                    sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$3;
                                    sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$6;
                                    switch (i15) {
                                        case 0:
                                            ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$10 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$10((ReadDetailsSection.Chapters) chapters, (t1.b) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$10;
                                        case 1:
                                            ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$2 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$2((ReadDetailsSection.TitleDescription) chapters, (t1.b) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$2;
                                        case 2:
                                            ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$3 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$3((ReadDetailsSection.Details) chapters, (t1.b) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$3;
                                        default:
                                            ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$6 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$6((ReadDetailsSection.FlatCarousel) chapters, (t1.b) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$6;
                                    }
                                }
                            }, true, -253270244), 3);
                        } else {
                            c6.p();
                            return null;
                        }
                        i10 = i11;
                    }
                    i10 = i11;
                }
                i10 = i11;
            } else {
                ig.f.U();
                throw null;
            }
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$0(ReadDetailsSection readDetailsSection, ho.p pVar, boolean z6, List list, ho.l lVar, final float f10, t1.b bVar, u2.m mVar, int i10) {
        boolean z10;
        ho.a aVar;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.q qVar2 = i3.q.f13017a;
            i3.t c5 = i3.a.c(qVar2, qVar);
            h4.h.f11920i.getClass();
            ho.a aVar2 = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(aVar2);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            ReadDetailsSection.MediaHeader mediaHeader = (ReadDetailsSection.MediaHeader) readDetailsSection;
            SizeableHeaderImage image = mediaHeader.getData().getImage();
            String title = mediaHeader.getData().getTitle();
            String author = mediaHeader.getData().getAuthor();
            List<Tag> tags = mediaHeader.getData().getTags();
            ArrayList arrayList = new ArrayList(tn.p.a0(tags, 10));
            for (Tag tag : tags) {
                arrayList.add(new io.elevenlabs.readerapp.ui.components.Tag(tag.getTitle(), tag.getIconUrl()));
            }
            String authorId = mediaHeader.getData().getAuthorId();
            if (authorId == null) {
                qVar.X(-494947027);
                qVar.p(false);
                aVar = null;
            } else {
                qVar.X(-494947026);
                boolean f11 = qVar.f(lVar) | qVar.f(authorId);
                Object L = qVar.L();
                if (f11 || L == u2.l.f33918a) {
                    L = new n(0, lVar, authorId);
                    qVar.h0(L);
                }
                aVar = (ho.a) L;
                qVar.p(false);
            }
            MediaHeaderSectionKt.MediaHeaderSection(title, null, image, arrayList, author, pVar, aVar, c3.k.d(1374872711, true, new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.o
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$0$0$2;
                    int intValue = ((Integer) obj2).intValue();
                    ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$0$0$2 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$0$0$2(f10, (u2.m) obj, intValue);
                    return ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$0$0$2;
                }
            }, qVar), qVar, 12779520, 2);
            if (!z6 && !list.isEmpty()) {
                qVar.X(-494460915);
                i3.t e10 = p2.e(qVar2, 1.0f);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i11 = EchoTheme.$stable;
                ReadMetaStatsRowKt.ReadMetaStatsRow(list, r1.d.G(r1.d.I(e10, t2.u.P, echoTheme.getSpacings(qVar, i11).getX5(), t2.u.P, t2.u.P, 13), echoTheme.getSpacings(qVar, i11).getX5(), t2.u.P, 2), null, qVar, 0, 4);
                qVar.p(false);
            } else {
                qVar.X(-493932365);
                qVar.p(false);
            }
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$0$0$1$0$0(ho.l lVar, String str) {
        lVar.invoke(str);
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$0$0$2(float f10, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            r1.d.g(p2.f(i3.q.f13017a, f10), qVar);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$1(ReadDetailsSection readDetailsSection, List list, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadMetaStatsRowKt.ReadMetaStatsRow(((ReadDetailsSection.Meta) readDetailsSection).getData().getItems(), r1.d.G(p2.e(i3.q.f13017a, 1.0f), EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX5(), t2.u.P, 2), list, qVar, 0, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$10(ReadDetailsSection readDetailsSection, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsSection.Chapters chapters = (ReadDetailsSection.Chapters) readDetailsSection;
            ChaptersSectionKt.ChaptersSection(chapters.getData().getTitle(), chapters.getData().getItems(), null, 0, qVar, 0, 12);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$2(ReadDetailsSection readDetailsSection, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsSection.TitleDescription titleDescription = (ReadDetailsSection.TitleDescription) readDetailsSection;
            TitleDescriptionSectionKt.TitleDescriptionSection(titleDescription.getData().getTitle(), titleDescription.getData().getDescription(), null, qVar, 0, 4);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$3(ReadDetailsSection readDetailsSection, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            DetailsSectionKt.DetailsSection(((ReadDetailsSection.Details) readDetailsSection).getData().getItems(), null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$4(ho.a aVar, ho.a aVar2, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadActionsSection(aVar, aVar2, null, qVar, 0, 4);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$5(ReadDetailsSection readDetailsSection, ho.l lVar, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsAuthorSection data = ((ReadDetailsSection.Author) readDetailsSection).getData();
            boolean f10 = qVar.f(lVar) | qVar.h(readDetailsSection);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new z(lVar, readDetailsSection, 2);
                qVar.h0(L);
            }
            AuthorSectionKt.AuthorSection(data, (ho.a) L, null, qVar, 0, 4);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$5$0$0(ho.l lVar, ReadDetailsSection readDetailsSection) {
        lVar.invoke(((ReadDetailsSection.Author) readDetailsSection).getData().getAuthorId());
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$6(ReadDetailsSection readDetailsSection, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            FlatCarouselSectionKt.FlatCarouselSection(((ReadDetailsSection.FlatCarousel) readDetailsSection).getData(), null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$7(ReadDetailsSection readDetailsSection, ho.l lVar, ho.l lVar2, String str, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsSection.Reads reads = (ReadDetailsSection.Reads) readDetailsSection;
            ReadsListSectionKt.ReadsListSection(reads.getData().getTitle(), reads.getData().getItems(), lVar, null, lVar2, str, qVar, 0, 8);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$8(ReadDetailsSection readDetailsSection, ho.l lVar, ho.l lVar2, String str, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsSection.ReadsV2 readsV2 = (ReadDetailsSection.ReadsV2) readDetailsSection;
            ReadsListSectionKt.ReadsV2ListSection(readsV2.getData().getTitle(), readsV2.getData().getItems(), lVar, null, lVar2, str, qVar, 0, 8);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$9(ReadDetailsSection readDetailsSection, ho.l lVar, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsSection.Read read = (ReadDetailsSection.Read) readDetailsSection;
            ReadSectionKt.ReadSection(read.getData().getRead(), read.getData().getOrderLabel(), null, lVar, qVar, 0, 4);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$2$0(x0 x0Var, h5.l lVar) {
        ReadDetailsContent_n2tekjI$lambda$2(x0Var, (int) (lVar.f12092a & 4294967295L));
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsContent_n2tekjI$lambda$6(ReadDetailsResponse readDetailsResponse, boolean z6, ExplorePricingType explorePricingType, Boolean bool, boolean z10, boolean z11, PurchaseState purchaseState, PaymentConfig paymentConfig, ReadMeta readMeta, String str, String str2, boolean z12, Map map, String str3, String str4, ho.a aVar, ho.l lVar, ho.a aVar2, ho.a aVar3, ho.l lVar2, ho.l lVar3, ho.a aVar4, ho.a aVar5, ho.l lVar4, ho.a aVar6, ho.p pVar, float f10, i3.t tVar, int i10, int i11, int i12, int i13, u2.m mVar, int i14) {
        m1715ReadDetailsContentn2tekjI(readDetailsResponse, z6, explorePricingType, bool, z10, z11, purchaseState, paymentConfig, readMeta, str, str2, z12, map, str3, str4, aVar, lVar, aVar2, aVar3, lVar2, lVar3, aVar4, aVar5, lVar4, aVar6, pVar, f10, tVar, mVar, u2.r.M(i10 | 1), u2.r.M(i11), u2.r.M(i12), i13);
        return sn.z.f31622a;
    }

    private static final void ReadDetailsHeaderActions(ReadDetailsState readDetailsState, i3.t tVar, ho.l lVar, ho.a aVar, ho.a aVar2, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        String str;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(963767537);
        if ((i10 & 6) == 0) {
            if (qVar.h(readDetailsState)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(tVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i13;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.h(aVar2)) {
                i12 = 16384;
            } else {
                i12 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i12;
        }
        if ((i11 & 9363) != 9362) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            ReadDetailsResponse readDetails = readDetailsState.getReadDetails();
            if (readDetails != null) {
                str = readDetails.getShareUrl();
            } else {
                str = null;
            }
            if (readDetailsState.getReadDetails() != null && readDetailsState.isReadLaterEnabled() && readDetailsState.getReadId() != null) {
                qVar.X(-257264118);
                ReadLaterToggleButton(readDetailsState.isInReadLater(), aVar, tVar, qVar, ((i11 >> 6) & 112) | ((i11 << 3) & 896), 0);
                qVar.p(false);
            } else if (str != null) {
                qVar.X(-257019249);
                int i17 = io.elevenlabs.ui.R.drawable.share_android;
                String R = kj.c.R(qVar, R.string.share_read_share);
                boolean z10 = true;
                EchoButtonVariant echoButtonVariant = EchoButtonVariant.GhostWhite;
                EchoButtonSize echoButtonSize = EchoButtonSize.Medium;
                if ((i11 & 896) != 256) {
                    z10 = false;
                }
                boolean f10 = qVar.f(str) | z10;
                Object L = qVar.L();
                if (f10 || L == u2.l.f33918a) {
                    L = new n(1, lVar, str);
                    qVar.h0(L);
                }
                EchoIconButtonKt.EchoIconButton(i17, (ho.a) L, tVar, R, echoButtonVariant, echoButtonSize, false, false, false, qVar, ((i11 << 3) & 896) | 221184, 448);
                qVar = qVar;
                qVar.p(false);
            } else {
                qVar.X(-256663183);
                qVar.p(false);
            }
            u2.q qVar2 = qVar;
            EchoIconButtonKt.EchoIconButton(io.elevenlabs.ui.R.drawable.more_dots, aVar2, tVar, kj.c.R(qVar, R.string.read_details_toolbar_action_more_actions_accessibility_label), EchoButtonVariant.GhostWhite, EchoButtonSize.Medium, false, false, false, qVar2, ((i11 >> 9) & 112) | 221184 | ((i11 << 3) & 896), 448);
            qVar = qVar2;
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.f(readDetailsState, tVar, lVar, aVar, aVar2, i10, 6);
        }
    }

    public static final sn.z ReadDetailsHeaderActions$lambda$0$0(ho.l lVar, String str) {
        lVar.invoke(str);
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsHeaderActions$lambda$1(ReadDetailsState readDetailsState, i3.t tVar, ho.l lVar, ho.a aVar, ho.a aVar2, int i10, u2.m mVar, int i11) {
        ReadDetailsHeaderActions(readDetailsState, tVar, lVar, aVar, aVar2, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0303  */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReadDetailsScreen(String str, String str2, ho.a aVar, ho.p pVar, ho.l lVar, ho.l lVar2, ho.l lVar3, ho.a aVar2, ReadDetailsViewModel readDetailsViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        ho.a aVar3;
        int i13;
        ReadDetailsViewModel readDetailsViewModel2;
        boolean z6;
        u2.q qVar;
        ReadDetailsViewModel readDetailsViewModel3;
        ho.a aVar4;
        ho.a aVar5;
        u2.q qVar2;
        ?? r92;
        int i14;
        final ReadDetailsViewModel readDetailsViewModel4;
        q7.c cVar;
        boolean z10;
        u2.q qVar3;
        ReadDetailsState readDetailsState;
        Object L;
        Object L2;
        String ReadDetailsScreen$lambda$2;
        final z0 z0Var;
        int i15;
        final z0 z0Var2;
        boolean z11;
        u2.q qVar4;
        u2.q qVar5;
        boolean h10;
        Object L3;
        Object L4;
        boolean h11;
        Object L5;
        boolean z12;
        boolean z13;
        boolean z14;
        Object L6;
        boolean z15;
        boolean z16;
        Object L7;
        boolean z17;
        boolean h12;
        Object L8;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        str.getClass();
        aVar.getClass();
        pVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        u2.q qVar6 = (u2.q) mVar;
        qVar6.Z(2101553069);
        if ((i10 & 6) == 0) {
            if (qVar6.f(str)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i12 = i23 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar6.f(str2)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i12 |= i22;
        }
        if ((i10 & 384) == 0) {
            if (qVar6.h(aVar)) {
                i21 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i21 = 128;
            }
            i12 |= i21;
        }
        if ((i10 & 3072) == 0) {
            if (qVar6.h(pVar)) {
                i20 = 2048;
            } else {
                i20 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i20;
        }
        if ((i10 & 24576) == 0) {
            if (qVar6.h(lVar)) {
                i19 = 16384;
            } else {
                i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i19;
        }
        if ((196608 & i10) == 0) {
            if (qVar6.h(lVar2)) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i12 |= i18;
        }
        if ((1572864 & i10) == 0) {
            if (qVar6.h(lVar3)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i12 |= i17;
        }
        int i24 = i11 & 128;
        if (i24 != 0) {
            i12 |= 12582912;
            aVar3 = aVar2;
        } else {
            aVar3 = aVar2;
            if ((i10 & 12582912) == 0) {
                if (qVar6.h(aVar3)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i12 |= i13;
            }
        }
        if ((i10 & 100663296) == 0) {
            if ((i11 & RpcError.MAX_MESSAGE_BYTES) == 0) {
                readDetailsViewModel2 = readDetailsViewModel;
                if (qVar6.h(readDetailsViewModel2)) {
                    i16 = 67108864;
                    i12 |= i16;
                }
            } else {
                readDetailsViewModel2 = readDetailsViewModel;
            }
            i16 = 33554432;
            i12 |= i16;
        } else {
            readDetailsViewModel2 = readDetailsViewModel;
        }
        if ((i12 & 38347923) != 38347922) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar6.O(i12 & 1, z6)) {
            qVar6.T();
            int i25 = i10 & 1;
            u2.e eVar = u2.l.f33918a;
            if (i25 != 0 && !qVar6.y()) {
                qVar6.R();
                if ((i11 & RpcError.MAX_MESSAGE_BYTES) != 0) {
                    i12 &= -234881025;
                }
                qVar3 = qVar6;
                i14 = i12;
                readDetailsViewModel4 = readDetailsViewModel2;
                aVar5 = aVar3;
                z10 = false;
            } else {
                if (i24 != 0) {
                    Object L9 = qVar6.L();
                    if (L9 == eVar) {
                        L9 = new j(2);
                        qVar6.h0(L9);
                    }
                    aVar5 = (ho.a) L9;
                } else {
                    aVar5 = aVar3;
                }
                if ((i11 & RpcError.MAX_MESSAGE_BYTES) != 0) {
                    androidx.lifecycle.r1 a10 = r7.a.a(qVar6);
                    if (a10 != null) {
                        pl.f o6 = tb.a.o(a10, qVar6);
                        if (a10 instanceof androidx.lifecycle.o) {
                            cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = q7.a.f28123b;
                        }
                        q7.c cVar2 = cVar;
                        z10 = false;
                        j1 j02 = gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(ReadDetailsViewModel.class), a10, null, o6, cVar2, qVar6);
                        qVar3 = qVar6;
                        i14 = i12 & (-234881025);
                        readDetailsViewModel4 = (ReadDetailsViewModel) j02;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                } else {
                    qVar2 = qVar6;
                    r92 = 0;
                    i14 = i12;
                    readDetailsViewModel4 = readDetailsViewModel;
                    qVar2.q();
                    readDetailsState = (ReadDetailsState) u2.r.o(readDetailsViewModel4.getStateFlow(), qVar2, r92).getValue();
                    L = qVar2.L();
                    if (L == eVar) {
                        L = u2.r.A(null);
                        qVar2.h0(L);
                    }
                    z0 z0Var3 = (z0) L;
                    L2 = qVar2.L();
                    if (L2 == eVar) {
                        L2 = u2.r.A(null);
                        qVar2.h0(L2);
                    }
                    z0 z0Var4 = (z0) L2;
                    ReadDetailsScreen$lambda$2 = ReadDetailsScreen$lambda$2(z0Var3);
                    if (ReadDetailsScreen$lambda$2 != null) {
                        qVar2.X(-370100316);
                        qVar2.p(r92);
                        z0Var2 = z0Var4;
                        i15 = i14;
                        z11 = r92;
                        z0Var = z0Var3;
                        qVar4 = qVar2;
                    } else {
                        qVar2.X(-370100315);
                        boolean h13 = qVar2.h(readDetailsViewModel4);
                        Object L10 = qVar2.L();
                        if (h13 || L10 == eVar) {
                            L10 = new z(readDetailsViewModel4, z0Var3, 0);
                            qVar2.h0(L10);
                        }
                        ho.a aVar6 = (ho.a) L10;
                        boolean f10 = qVar2.f(ReadDetailsScreen$lambda$2);
                        Object L11 = qVar2.L();
                        if (f10 || L11 == eVar) {
                            L11 = new z(ReadDetailsScreen$lambda$2, z0Var4, 1);
                            qVar2.h0(L11);
                        }
                        ho.a aVar7 = (ho.a) L11;
                        z0Var = z0Var3;
                        i15 = i14;
                        z0Var2 = z0Var4;
                        u2.q qVar7 = qVar2;
                        AddReadToCollectionScreenKt.AddReadToCollectionSheet(ReadDetailsScreen$lambda$2, aVar6, aVar7, null, qVar7, 0, 8);
                        u2.q qVar8 = qVar7;
                        z11 = false;
                        qVar8.p(false);
                        qVar4 = qVar8;
                    }
                    if (ReadDetailsScreen$lambda$5(z0Var2) != null) {
                        qVar4.X(-369769453);
                        qVar4.p(z11);
                        qVar5 = qVar4;
                    } else {
                        qVar4.X(-369769452);
                        ReadMeta readMeta = readDetailsState.getReadMeta();
                        Object L12 = qVar4.L();
                        if (L12 == eVar) {
                            L12 = new e(z0Var2, 5);
                            qVar4.h0(L12);
                        }
                        ho.a aVar8 = (ho.a) L12;
                        Object L13 = qVar4.L();
                        if (L13 == eVar) {
                            final int i26 = 0;
                            L13 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.a0
                                @Override // ho.l
                                public final Object invoke(Object obj) {
                                    sn.z ReadDetailsScreen$lambda$8$1$0;
                                    sn.z ReadDetailsScreen$lambda$11$0;
                                    switch (i26) {
                                        case 0:
                                            ReadDetailsScreen$lambda$8$1$0 = ReadDetailsScreenKt.ReadDetailsScreen$lambda$8$1$0(z0Var2, (String) obj);
                                            return ReadDetailsScreen$lambda$8$1$0;
                                        default:
                                            ReadDetailsScreen$lambda$11$0 = ReadDetailsScreenKt.ReadDetailsScreen$lambda$11$0(z0Var2, (String) obj);
                                            return ReadDetailsScreen$lambda$11$0;
                                    }
                                }
                            };
                            qVar4.h0(L13);
                        }
                        u2.q qVar9 = qVar4;
                        CreateCollectionSheetKt.CreateCollectionSheet(readMeta, aVar8, (ho.l) L13, null, qVar9, 432, 8);
                        u2.q qVar10 = qVar9;
                        qVar10.p(false);
                        qVar5 = qVar10;
                    }
                    c3.j d10 = c3.k.d(1102993837, true, new m(pVar, 1), qVar5);
                    h10 = qVar5.h(readDetailsViewModel4);
                    L3 = qVar5.L();
                    if (!h10 || L3 == eVar) {
                        final int i27 = 0;
                        L3 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.b0
                            @Override // ho.l
                            public final Object invoke(Object obj) {
                                sn.z ReadDetailsScreen$lambda$10$0;
                                u2.h0 ReadDetailsScreen$lambda$12$0;
                                switch (i27) {
                                    case 0:
                                        ReadDetailsScreen$lambda$10$0 = ReadDetailsScreenKt.ReadDetailsScreen$lambda$10$0(readDetailsViewModel4, (ho.l) obj);
                                        return ReadDetailsScreen$lambda$10$0;
                                    default:
                                        ReadDetailsScreen$lambda$12$0 = ReadDetailsScreenKt.ReadDetailsScreen$lambda$12$0(readDetailsViewModel4, (u2.i0) obj);
                                        return ReadDetailsScreen$lambda$12$0;
                                }
                            }
                        };
                        qVar5.h0(L3);
                    }
                    ho.l lVar4 = (ho.l) L3;
                    L4 = qVar5.L();
                    if (L4 == eVar) {
                        final int i28 = 1;
                        L4 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.a0
                            @Override // ho.l
                            public final Object invoke(Object obj) {
                                sn.z ReadDetailsScreen$lambda$8$1$0;
                                sn.z ReadDetailsScreen$lambda$11$0;
                                switch (i28) {
                                    case 0:
                                        ReadDetailsScreen$lambda$8$1$0 = ReadDetailsScreenKt.ReadDetailsScreen$lambda$8$1$0(z0Var, (String) obj);
                                        return ReadDetailsScreen$lambda$8$1$0;
                                    default:
                                        ReadDetailsScreen$lambda$11$0 = ReadDetailsScreenKt.ReadDetailsScreen$lambda$11$0(z0Var, (String) obj);
                                        return ReadDetailsScreen$lambda$11$0;
                                }
                            }
                        };
                        qVar5.h0(L4);
                    }
                    int i29 = i15 << 3;
                    u2.q qVar11 = qVar5;
                    ReadDetailsScreenUi(readDetailsState, d10, lVar4, aVar, lVar2, lVar, lVar3, (ho.l) L4, qVar11, (i29 & 458752) | (i29 & 7168) | 12582960 | ((i15 >> 3) & 57344) | (3670016 & i15), 0);
                    qVar = qVar11;
                    h11 = qVar.h(readDetailsViewModel4);
                    L5 = qVar.L();
                    if (!h11 || L5 == eVar) {
                        final int i30 = 1;
                        L5 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.b0
                            @Override // ho.l
                            public final Object invoke(Object obj) {
                                sn.z ReadDetailsScreen$lambda$10$0;
                                u2.h0 ReadDetailsScreen$lambda$12$0;
                                switch (i30) {
                                    case 0:
                                        ReadDetailsScreen$lambda$10$0 = ReadDetailsScreenKt.ReadDetailsScreen$lambda$10$0(readDetailsViewModel4, (ho.l) obj);
                                        return ReadDetailsScreen$lambda$10$0;
                                    default:
                                        ReadDetailsScreen$lambda$12$0 = ReadDetailsScreenKt.ReadDetailsScreen$lambda$12$0(readDetailsViewModel4, (u2.i0) obj);
                                        return ReadDetailsScreen$lambda$12$0;
                                }
                            }
                        };
                        qVar.h0(L5);
                    }
                    sn.z zVar = sn.z.f31622a;
                    u2.r.c(zVar, (ho.l) L5, qVar);
                    boolean h14 = qVar.h(readDetailsViewModel4);
                    if ((i15 & 14) != 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z18 = h14 | z12;
                    if ((i15 & 112) != 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z18 | z13;
                    L6 = qVar.L();
                    if (!z14 || L6 == eVar) {
                        L6 = new ReadDetailsScreenKt$ReadDetailsScreen$8$1(readDetailsViewModel4, str, str2, null);
                        qVar.h0(L6);
                    }
                    u2.r.g(str, str2, (ho.p) L6, qVar);
                    boolean h15 = qVar.h(readDetailsViewModel4);
                    if ((i15 & 7168) != 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = h15 | z15;
                    L7 = qVar.L();
                    if (!z16 || L7 == eVar) {
                        L7 = new ReadDetailsScreenKt$ReadDetailsScreen$9$1(readDetailsViewModel4, pVar, null);
                        qVar.h0(L7);
                    }
                    u2.r.f((ho.p) L7, zVar, qVar);
                    Boolean valueOf = Boolean.valueOf(readDetailsState.getShouldRequestStartSelectiveStackPopping());
                    boolean h16 = qVar.h(readDetailsState);
                    if ((i15 & 29360128) != 8388608) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    h12 = h16 | z17 | qVar.h(readDetailsViewModel4);
                    L8 = qVar.L();
                    if (!h12 || L8 == eVar) {
                        L8 = new ReadDetailsScreenKt$ReadDetailsScreen$10$1(readDetailsState, aVar5, readDetailsViewModel4, null);
                        qVar.h0(L8);
                    }
                    u2.r.f((ho.p) L8, valueOf, qVar);
                    readDetailsViewModel3 = readDetailsViewModel4;
                    aVar4 = aVar5;
                }
            }
            r92 = z10;
            qVar2 = qVar3;
            qVar2.q();
            readDetailsState = (ReadDetailsState) u2.r.o(readDetailsViewModel4.getStateFlow(), qVar2, r92).getValue();
            L = qVar2.L();
            if (L == eVar) {
            }
            z0 z0Var32 = (z0) L;
            L2 = qVar2.L();
            if (L2 == eVar) {
            }
            z0 z0Var42 = (z0) L2;
            ReadDetailsScreen$lambda$2 = ReadDetailsScreen$lambda$2(z0Var32);
            if (ReadDetailsScreen$lambda$2 != null) {
            }
            if (ReadDetailsScreen$lambda$5(z0Var2) != null) {
            }
            c3.j d102 = c3.k.d(1102993837, true, new m(pVar, 1), qVar5);
            h10 = qVar5.h(readDetailsViewModel4);
            L3 = qVar5.L();
            if (!h10) {
            }
            final int i272 = 0;
            L3 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.b0
                @Override // ho.l
                public final Object invoke(Object obj) {
                    sn.z ReadDetailsScreen$lambda$10$0;
                    u2.h0 ReadDetailsScreen$lambda$12$0;
                    switch (i272) {
                        case 0:
                            ReadDetailsScreen$lambda$10$0 = ReadDetailsScreenKt.ReadDetailsScreen$lambda$10$0(readDetailsViewModel4, (ho.l) obj);
                            return ReadDetailsScreen$lambda$10$0;
                        default:
                            ReadDetailsScreen$lambda$12$0 = ReadDetailsScreenKt.ReadDetailsScreen$lambda$12$0(readDetailsViewModel4, (u2.i0) obj);
                            return ReadDetailsScreen$lambda$12$0;
                    }
                }
            };
            qVar5.h0(L3);
            ho.l lVar42 = (ho.l) L3;
            L4 = qVar5.L();
            if (L4 == eVar) {
            }
            int i292 = i15 << 3;
            u2.q qVar112 = qVar5;
            ReadDetailsScreenUi(readDetailsState, d102, lVar42, aVar, lVar2, lVar, lVar3, (ho.l) L4, qVar112, (i292 & 458752) | (i292 & 7168) | 12582960 | ((i15 >> 3) & 57344) | (3670016 & i15), 0);
            qVar = qVar112;
            h11 = qVar.h(readDetailsViewModel4);
            L5 = qVar.L();
            if (!h11) {
            }
            final int i302 = 1;
            L5 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.b0
                @Override // ho.l
                public final Object invoke(Object obj) {
                    sn.z ReadDetailsScreen$lambda$10$0;
                    u2.h0 ReadDetailsScreen$lambda$12$0;
                    switch (i302) {
                        case 0:
                            ReadDetailsScreen$lambda$10$0 = ReadDetailsScreenKt.ReadDetailsScreen$lambda$10$0(readDetailsViewModel4, (ho.l) obj);
                            return ReadDetailsScreen$lambda$10$0;
                        default:
                            ReadDetailsScreen$lambda$12$0 = ReadDetailsScreenKt.ReadDetailsScreen$lambda$12$0(readDetailsViewModel4, (u2.i0) obj);
                            return ReadDetailsScreen$lambda$12$0;
                    }
                }
            };
            qVar.h0(L5);
            sn.z zVar2 = sn.z.f31622a;
            u2.r.c(zVar2, (ho.l) L5, qVar);
            boolean h142 = qVar.h(readDetailsViewModel4);
            if ((i15 & 14) != 4) {
            }
            boolean z182 = h142 | z12;
            if ((i15 & 112) != 32) {
            }
            z14 = z182 | z13;
            L6 = qVar.L();
            if (!z14) {
            }
            L6 = new ReadDetailsScreenKt$ReadDetailsScreen$8$1(readDetailsViewModel4, str, str2, null);
            qVar.h0(L6);
            u2.r.g(str, str2, (ho.p) L6, qVar);
            boolean h152 = qVar.h(readDetailsViewModel4);
            if ((i15 & 7168) != 2048) {
            }
            z16 = h152 | z15;
            L7 = qVar.L();
            if (!z16) {
            }
            L7 = new ReadDetailsScreenKt$ReadDetailsScreen$9$1(readDetailsViewModel4, pVar, null);
            qVar.h0(L7);
            u2.r.f((ho.p) L7, zVar2, qVar);
            Boolean valueOf2 = Boolean.valueOf(readDetailsState.getShouldRequestStartSelectiveStackPopping());
            boolean h162 = qVar.h(readDetailsState);
            if ((i15 & 29360128) != 8388608) {
            }
            h12 = h162 | z17 | qVar.h(readDetailsViewModel4);
            L8 = qVar.L();
            if (!h12) {
            }
            L8 = new ReadDetailsScreenKt$ReadDetailsScreen$10$1(readDetailsState, aVar5, readDetailsViewModel4, null);
            qVar.h0(L8);
            u2.r.f((ho.p) L8, valueOf2, qVar);
            readDetailsViewModel3 = readDetailsViewModel4;
            aVar4 = aVar5;
        } else {
            qVar = qVar6;
            qVar.R();
            readDetailsViewModel3 = readDetailsViewModel;
            aVar4 = aVar3;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.h(str, str2, aVar, pVar, lVar, lVar2, lVar3, aVar4, readDetailsViewModel3, i10, i11);
        }
    }

    public static final sn.z ReadDetailsScreen$lambda$10$0(ReadDetailsViewModel readDetailsViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(readDetailsViewModel);
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreen$lambda$11$0(z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        return sn.z.f31622a;
    }

    public static final u2.h0 ReadDetailsScreen$lambda$12$0(final ReadDetailsViewModel readDetailsViewModel, u2.i0 i0Var) {
        i0Var.getClass();
        return new u2.h0() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsScreenKt$ReadDetailsScreen$lambda$12$0$$inlined$onDispose$1
            @Override // u2.h0
            public void dispose() {
                ReadDetailsViewModel.this.stopAllPreviews();
            }
        };
    }

    public static final sn.z ReadDetailsScreen$lambda$16(String str, String str2, ho.a aVar, ho.p pVar, ho.l lVar, ho.l lVar2, ho.l lVar3, ho.a aVar2, ReadDetailsViewModel readDetailsViewModel, int i10, int i11, u2.m mVar, int i12) {
        ReadDetailsScreen(str, str2, aVar, pVar, lVar, lVar2, lVar3, aVar2, readDetailsViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    private static final String ReadDetailsScreen$lambda$2(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    private static final String ReadDetailsScreen$lambda$5(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z ReadDetailsScreen$lambda$7$0$0(ReadDetailsViewModel readDetailsViewModel, z0 z0Var) {
        z0Var.setValue(null);
        readDetailsViewModel.refreshReadLaterMembership();
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreen$lambda$7$1$0(String str, z0 z0Var) {
        z0Var.setValue(str);
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreen$lambda$8$0$0(z0 z0Var) {
        z0Var.setValue(null);
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreen$lambda$8$1$0(z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(null);
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreen$lambda$9(ho.p pVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            float x52 = echoTheme.getSpacings(qVar, i11).getX5();
            long primary = echoTheme.getColors(qVar, i11).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable);
            boolean f10 = qVar.f(pVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new j0(pVar, 6);
                qVar.h0(L);
            }
            MiniPlayerKt.m1520MiniPlayerGSIvlCE(x52, false, primary, (ho.l) L, null, qVar, 48, 16);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreen$lambda$9$0$0(ho.p pVar, String str) {
        str.getClass();
        pVar.invoke(str, Analytics.Event.PlayerActivationSource.Mini);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ReadDetailsScreenUi(final ReadDetailsState readDetailsState, ho.p pVar, ho.l lVar, ho.a aVar, ho.l lVar2, ho.l lVar3, ho.l lVar4, ho.l lVar5, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        ho.l lVar6;
        int i14;
        ho.a aVar2;
        int i15;
        ho.l lVar7;
        int i16;
        ho.l lVar8;
        int i17;
        ho.l lVar9;
        int i18;
        int i19;
        u2.q qVar;
        ho.p pVar2;
        ho.l lVar10;
        ho.l lVar11;
        ho.a aVar3;
        ho.l lVar12;
        ho.l lVar13;
        ho.l lVar14;
        r1 r10;
        ho.a aVar4;
        ho.l lVar15;
        ho.l lVar16;
        ho.l lVar17;
        final ho.l lVar18;
        GlassState glassState;
        u2.q qVar2;
        i3.q qVar3;
        EchoTheme echoTheme;
        int i20;
        u2.e eVar;
        int i21;
        z0 z0Var;
        ReadDetailsResponse readDetailsResponse;
        boolean f10;
        Object L;
        ho.l lVar19;
        boolean z6;
        z0 z0Var2;
        u2.q qVar4 = (u2.q) mVar;
        qVar4.Z(1558584607);
        if ((i10 & 6) == 0) {
            i12 = (qVar4.h(readDetailsState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i22 = i11 & 2;
        if (i22 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= qVar4.h(pVar) ? 32 : 16;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                lVar6 = lVar;
                i12 |= qVar4.h(lVar6) ? RpcError.MAX_MESSAGE_BYTES : 128;
                i14 = i11 & 8;
                if (i14 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    aVar2 = aVar;
                    i12 |= qVar4.h(aVar2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
                    i15 = i11 & 16;
                    if (i15 == 0) {
                        i12 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        lVar7 = lVar2;
                        i12 |= qVar4.h(lVar7) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        i16 = i11 & 32;
                        if (i16 != 0) {
                            i12 |= 196608;
                        } else if ((196608 & i10) == 0) {
                            lVar8 = lVar3;
                            i12 |= qVar4.h(lVar8) ? 131072 : 65536;
                            i17 = i11 & 64;
                            if (i17 == 0) {
                                i12 |= 1572864;
                                lVar9 = lVar4;
                            } else {
                                lVar9 = lVar4;
                                if ((i10 & 1572864) == 0) {
                                    i12 |= qVar4.h(lVar9) ? 1048576 : 524288;
                                }
                            }
                            int i23 = i12;
                            i18 = i11 & 128;
                            if (i18 == 0) {
                                i23 |= 12582912;
                            } else if ((i10 & 12582912) == 0) {
                                i23 |= qVar4.h(lVar5) ? 8388608 : 4194304;
                            }
                            i19 = i23;
                            if (!qVar4.O(i19 & 1, (i19 & 4793491) == 4793490)) {
                                ho.p m1714getLambda$962485959$app_productionRelease = i22 != 0 ? ComposableSingletons$ReadDetailsScreenKt.INSTANCE.m1714getLambda$962485959$app_productionRelease() : pVar;
                                u2.e eVar2 = u2.l.f33918a;
                                if (i13 != 0) {
                                    Object L2 = qVar4.L();
                                    if (L2 == eVar2) {
                                        L2 = new m0(14);
                                        qVar4.h0(L2);
                                    }
                                    lVar6 = (ho.l) L2;
                                }
                                if (i14 != 0) {
                                    Object L3 = qVar4.L();
                                    if (L3 == eVar2) {
                                        L3 = new j(0);
                                        qVar4.h0(L3);
                                    }
                                    aVar4 = (ho.a) L3;
                                } else {
                                    aVar4 = aVar2;
                                }
                                if (i15 != 0) {
                                    Object L4 = qVar4.L();
                                    if (L4 == eVar2) {
                                        L4 = new m0(17);
                                        qVar4.h0(L4);
                                    }
                                    lVar15 = (ho.l) L4;
                                } else {
                                    lVar15 = lVar7;
                                }
                                if (i16 != 0) {
                                    Object L5 = qVar4.L();
                                    if (L5 == eVar2) {
                                        L5 = new m0(18);
                                        qVar4.h0(L5);
                                    }
                                    lVar16 = (ho.l) L5;
                                } else {
                                    lVar16 = lVar8;
                                }
                                if (i17 != 0) {
                                    Object L6 = qVar4.L();
                                    if (L6 == eVar2) {
                                        L6 = new m0(19);
                                        qVar4.h0(L6);
                                    }
                                    lVar9 = (ho.l) L6;
                                }
                                ho.l lVar20 = lVar9;
                                if (i18 != 0) {
                                    Object L7 = qVar4.L();
                                    if (L7 == eVar2) {
                                        L7 = new m0(20);
                                        qVar4.h0(L7);
                                    }
                                    lVar17 = (ho.l) L7;
                                } else {
                                    lVar17 = lVar5;
                                }
                                Object L8 = qVar4.L();
                                if (L8 == eVar2) {
                                    L8 = u2.r.A(Boolean.FALSE);
                                    qVar4.h0(L8);
                                }
                                z0 z0Var3 = (z0) L8;
                                Object L9 = qVar4.L();
                                if (L9 == eVar2) {
                                    L9 = u2.r.A(Boolean.FALSE);
                                    qVar4.h0(L9);
                                }
                                final z0 z0Var4 = (z0) L9;
                                Object L10 = qVar4.L();
                                if (L10 == eVar2) {
                                    L10 = u2.r.A(null);
                                    qVar4.h0(L10);
                                }
                                z0 z0Var5 = (z0) L10;
                                String ReadDetailsScreenUi$lambda$13 = ReadDetailsScreenUi$lambda$13(z0Var5);
                                Object L11 = qVar4.L();
                                if (L11 == eVar2) {
                                    L11 = new e(z0Var5, 4);
                                    qVar4.h0(L11);
                                }
                                io.elevenlabs.readerapp.core.extensions.ComposeExtensionsKt.ShareLinkHandler(ReadDetailsScreenUi$lambda$13, (ho.a) L11, qVar4, 48);
                                Object[] objArr = new Object[0];
                                Object L12 = qVar4.L();
                                if (L12 == eVar2) {
                                    L12 = new j(1);
                                    qVar4.h0(L12);
                                }
                                x0 x0Var = (x0) f3.m.e(objArr, (ho.a) L12, qVar4, 48);
                                float rememberPxToDp = ComposeExtensionsKt.rememberPxToDp(ReadDetailsScreenUi$lambda$17(x0Var), (u2.m) qVar4, 0);
                                GlassState rememberGlassState = GlassModifiersKt.rememberGlassState(qVar4, 0);
                                i3.q qVar5 = i3.q.f13017a;
                                ho.l lVar21 = lVar15;
                                i3.t d10 = p2.d(qVar5, 1.0f);
                                EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                                ho.l lVar22 = lVar17;
                                int i24 = EchoTheme.$stable;
                                EchoThemeColors.Background background = echoTheme2.getColors(qVar4, i24).getBackground();
                                int i25 = EchoThemeColors.Background.$stable;
                                ho.a aVar5 = aVar4;
                                i3.t h10 = l1.n.h(d10, background.getPrimary(qVar4, i25), p3.h0.f26395b);
                                i3.l lVar23 = i3.d.f12997a;
                                f4.f1 d11 = r1.p.d(lVar23, false);
                                ho.l lVar24 = lVar6;
                                int hashCode = Long.hashCode(qVar4.T);
                                c3.o l4 = qVar4.l();
                                i3.t c5 = i3.a.c(h10, qVar4);
                                h4.h.f11920i.getClass();
                                h4.f fVar = h4.g.f11903b;
                                qVar4.b0();
                                if (qVar4.S) {
                                    qVar4.k(fVar);
                                } else {
                                    qVar4.k0();
                                }
                                h4.e eVar3 = h4.g.f11907f;
                                u2.r.J(eVar3, d11, qVar4);
                                h4.e eVar4 = h4.g.f11906e;
                                u2.r.J(eVar4, l4, qVar4);
                                Integer valueOf = Integer.valueOf(hashCode);
                                final z0 z0Var6 = z0Var5;
                                h4.e eVar5 = h4.g.f11908g;
                                u2.r.y(qVar4, valueOf, eVar5);
                                h4.d dVar = h4.g.f11909h;
                                u2.r.F(dVar, qVar4);
                                h4.e eVar6 = h4.g.f11905d;
                                u2.r.J(eVar6, c5, qVar4);
                                i3.t glassSource = GlassModifiersKt.glassSource(p2.d(qVar5, 1.0f), rememberGlassState);
                                f4.f1 d12 = r1.p.d(lVar23, false);
                                int hashCode2 = Long.hashCode(qVar4.T);
                                c3.o l7 = qVar4.l();
                                i3.t c10 = i3.a.c(glassSource, qVar4);
                                qVar4.b0();
                                if (qVar4.S) {
                                    qVar4.k(fVar);
                                } else {
                                    qVar4.k0();
                                }
                                u2.r.J(eVar3, d12, qVar4);
                                u2.r.J(eVar4, l7, qVar4);
                                defpackage.f.u(hashCode2, qVar4, eVar5, qVar4, dVar);
                                u2.r.J(eVar6, c10, qVar4);
                                if (readDetailsState.getErrorMessage() != null && readDetailsState.getReadDetails() == null) {
                                    qVar4.X(1632141204);
                                    i3.t d13 = p2.d(qVar5, 1.0f);
                                    String errorMessage = readDetailsState.getErrorMessage();
                                    long D = ib.i.D(i24, i25, echoTheme2, qVar4, qVar4);
                                    i20 = i19;
                                    boolean z10 = (i20 & 896) == 256;
                                    Object L13 = qVar4.L();
                                    if (z10) {
                                        eVar = eVar2;
                                    } else {
                                        eVar = eVar2;
                                        if (L13 != eVar) {
                                            lVar18 = lVar24;
                                            qVar3 = qVar5;
                                            echoTheme = echoTheme2;
                                            glassState = rememberGlassState;
                                            ErrorScreenKt.m1837ErrorScreenuDo3WH8(d13, null, errorMessage, D, (ho.a) L13, qVar4, 6, 2);
                                            qVar2 = qVar4;
                                            qVar2.p(false);
                                            i21 = 48;
                                        }
                                    }
                                    lVar18 = lVar24;
                                    L13 = new g(lVar18, 3);
                                    qVar4.h0(L13);
                                    qVar3 = qVar5;
                                    echoTheme = echoTheme2;
                                    glassState = rememberGlassState;
                                    ErrorScreenKt.m1837ErrorScreenuDo3WH8(d13, null, errorMessage, D, (ho.a) L13, qVar4, 6, 2);
                                    qVar2 = qVar4;
                                    qVar2.p(false);
                                    i21 = 48;
                                } else {
                                    lVar18 = lVar24;
                                    glassState = rememberGlassState;
                                    qVar2 = qVar4;
                                    qVar3 = qVar5;
                                    echoTheme = echoTheme2;
                                    i20 = i19;
                                    eVar = eVar2;
                                    if (readDetailsState.getRedeemError() != null) {
                                        qVar2.X(1632508213);
                                        i3.t d14 = p2.d(qVar3, 1.0f);
                                        String redeemError = readDetailsState.getRedeemError();
                                        long D2 = ib.i.D(i24, i25, echoTheme, qVar2, qVar2);
                                        i21 = 48;
                                        boolean z11 = (i20 & 896) == 256;
                                        Object L14 = qVar2.L();
                                        if (z11 || L14 == eVar) {
                                            L14 = new g(lVar18, 4);
                                            qVar2.h0(L14);
                                        }
                                        ErrorScreenKt.m1837ErrorScreenuDo3WH8(d14, null, redeemError, D2, (ho.a) L14, qVar2, 6, 2);
                                        qVar2 = qVar2;
                                        qVar2.p(false);
                                        z0Var6 = z0Var6;
                                    } else {
                                        i21 = 48;
                                        if (readDetailsState.getReadDetails() != null) {
                                            qVar2.X(1632929906);
                                            ReadDetailsResponse readDetails = readDetailsState.getReadDetails();
                                            boolean inLibrary = readDetailsState.getInLibrary();
                                            ExplorePricingType pricingType = readDetailsState.getPricingType();
                                            Boolean isFreeUser = readDetailsState.isFreeUser();
                                            boolean isEligibleForTrial = readDetailsState.isEligibleForTrial();
                                            boolean isLoadingAction = readDetailsState.isLoadingAction();
                                            PurchaseState purchase = readDetailsState.getPurchase();
                                            PaymentConfig paymentConfig = readDetailsState.getPaymentConfig();
                                            ReadMeta readMeta = readDetailsState.getReadMeta();
                                            String previewUrl = readDetailsState.getPreviewUrl();
                                            String sampleReadId = readDetailsState.getSampleReadId();
                                            boolean isPlayingPreview = readDetailsState.isPlayingPreview();
                                            Map<String, MoneyPrice> localizedPrices = readDetailsState.getLocalizedPrices();
                                            String playingCarouselPreviewReadId = readDetailsState.getPlayingCarouselPreviewReadId();
                                            String disabledReason = readDetailsState.getDisabledReason();
                                            i3.t y10 = r1.d.y(qVar3);
                                            int i26 = i20 & 896;
                                            boolean z12 = i26 == 256;
                                            z0Var6 = z0Var6;
                                            Object L15 = qVar2.L();
                                            if (z12 || L15 == eVar) {
                                                L15 = new g(lVar18, 0);
                                                qVar2.h0(L15);
                                            }
                                            ho.a aVar6 = (ho.a) L15;
                                            boolean z13 = i26 == 256;
                                            Object L16 = qVar2.L();
                                            if (z13 || L16 == eVar) {
                                                final int i27 = 0;
                                                L16 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.h
                                                    @Override // ho.l
                                                    public final Object invoke(Object obj) {
                                                        sn.z ReadDetailsScreenUi$lambda$19$0$3$0;
                                                        sn.z ReadDetailsScreenUi$lambda$19$0$8$0;
                                                        sn.z ReadDetailsScreenUi$lambda$28$0;
                                                        switch (i27) {
                                                            case 0:
                                                                ReadDetailsScreenUi$lambda$19$0$3$0 = ReadDetailsScreenKt.ReadDetailsScreenUi$lambda$19$0$3$0(lVar18, (ExploreRead) obj);
                                                                return ReadDetailsScreenUi$lambda$19$0$3$0;
                                                            case 1:
                                                                ReadDetailsScreenUi$lambda$19$0$8$0 = ReadDetailsScreenKt.ReadDetailsScreenUi$lambda$19$0$8$0(lVar18, (Activity) obj);
                                                                return ReadDetailsScreenUi$lambda$19$0$8$0;
                                                            default:
                                                                ReadDetailsScreenUi$lambda$28$0 = ReadDetailsScreenKt.ReadDetailsScreenUi$lambda$28$0(lVar18, ((Boolean) obj).booleanValue());
                                                                return ReadDetailsScreenUi$lambda$28$0;
                                                        }
                                                    }
                                                };
                                                qVar2.h0(L16);
                                            }
                                            ho.l lVar25 = (ho.l) L16;
                                            boolean h11 = (i26 == 256) | qVar2.h(readDetailsState);
                                            Object L17 = qVar2.L();
                                            if (h11 || L17 == eVar) {
                                                readDetailsResponse = readDetails;
                                                L17 = new d(lVar18, readDetailsState, 1);
                                                qVar2.h0(L17);
                                            } else {
                                                readDetailsResponse = readDetails;
                                            }
                                            ho.a aVar7 = (ho.a) L17;
                                            boolean h12 = (i26 == 256) | qVar2.h(readDetailsState);
                                            Object L18 = qVar2.L();
                                            if (h12 || L18 == eVar) {
                                                L18 = new d(lVar18, readDetailsState, 2);
                                                qVar2.h0(L18);
                                            }
                                            ho.a aVar8 = (ho.a) L18;
                                            Object L19 = qVar2.L();
                                            if (L19 == eVar) {
                                                z0Var = z0Var3;
                                                L19 = new e(z0Var, 1);
                                                qVar2.h0(L19);
                                            } else {
                                                z0Var = z0Var3;
                                            }
                                            ho.a aVar9 = (ho.a) L19;
                                            boolean z14 = i26 == 256;
                                            Object L20 = qVar2.L();
                                            if (z14 || L20 == eVar) {
                                                L20 = new g(lVar18, 1);
                                                qVar2.h0(L20);
                                            }
                                            ho.a aVar10 = (ho.a) L20;
                                            boolean z15 = i26 == 256;
                                            Object L21 = qVar2.L();
                                            if (z15 || L21 == eVar) {
                                                final int i28 = 1;
                                                L21 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.h
                                                    @Override // ho.l
                                                    public final Object invoke(Object obj) {
                                                        sn.z ReadDetailsScreenUi$lambda$19$0$3$0;
                                                        sn.z ReadDetailsScreenUi$lambda$19$0$8$0;
                                                        sn.z ReadDetailsScreenUi$lambda$28$0;
                                                        switch (i28) {
                                                            case 0:
                                                                ReadDetailsScreenUi$lambda$19$0$3$0 = ReadDetailsScreenKt.ReadDetailsScreenUi$lambda$19$0$3$0(lVar18, (ExploreRead) obj);
                                                                return ReadDetailsScreenUi$lambda$19$0$3$0;
                                                            case 1:
                                                                ReadDetailsScreenUi$lambda$19$0$8$0 = ReadDetailsScreenKt.ReadDetailsScreenUi$lambda$19$0$8$0(lVar18, (Activity) obj);
                                                                return ReadDetailsScreenUi$lambda$19$0$8$0;
                                                            default:
                                                                ReadDetailsScreenUi$lambda$28$0 = ReadDetailsScreenKt.ReadDetailsScreenUi$lambda$28$0(lVar18, ((Boolean) obj).booleanValue());
                                                                return ReadDetailsScreenUi$lambda$28$0;
                                                        }
                                                    }
                                                };
                                                qVar2.h0(L21);
                                            }
                                            ho.l lVar26 = (ho.l) L21;
                                            boolean z16 = i26 == 256;
                                            Object L22 = qVar2.L();
                                            if (z16 || L22 == eVar) {
                                                L22 = new g(lVar18, 2);
                                                qVar2.h0(L22);
                                            }
                                            int i29 = i20 << 12;
                                            m1715ReadDetailsContentn2tekjI(readDetailsResponse, inLibrary, pricingType, isFreeUser, isEligibleForTrial, isLoadingAction, purchase, paymentConfig, readMeta, previewUrl, sampleReadId, isPlayingPreview, localizedPrices, playingCarouselPreviewReadId, disabledReason, aVar6, lVar25, aVar7, aVar8, lVar16, lVar20, aVar9, aVar10, lVar26, (ho.a) L22, m1714getLambda$962485959$app_productionRelease, rememberPxToDp, y10, qVar2, 0, i29 & 1879048192, ((i20 >> 18) & 14) | 48 | (i29 & 458752), 0);
                                            qVar2 = qVar2;
                                            qVar2.p(false);
                                        } else {
                                            z0Var6 = z0Var6;
                                            z0Var = z0Var3;
                                            qVar2.X(1634957647);
                                            qVar2.p(false);
                                        }
                                        qVar2.p(true);
                                        final i3.t glassButtonEffect = GlassModifiersKt.glassButtonEffect(qVar3, glassState, qVar2, (GlassState.$stable << 3) | 6);
                                        f10 = qVar2.f(x0Var);
                                        L = qVar2.L();
                                        if (!f10 || L == eVar) {
                                            L = new f(x0Var, 1);
                                            qVar2.h0(L);
                                        }
                                        final ho.l lVar27 = lVar18;
                                        z0 z0Var7 = z0Var6;
                                        u2.q qVar6 = qVar2;
                                        HeaderKt.m1896HeaderShfnhV8(f4.i0.q(qVar3, (ho.l) L), c3.k.d(-656776970, true, new i(aVar5, glassButtonEffect, 0), qVar2), echoTheme.getSpacings(qVar2, i24).getX1(), c3.k.d(1539446324, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.k
                                            @Override // ho.q
                                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                                sn.z ReadDetailsScreenUi$lambda$19$3;
                                                int intValue = ((Integer) obj3).intValue();
                                                ReadDetailsScreenUi$lambda$19$3 = ReadDetailsScreenKt.ReadDetailsScreenUi$lambda$19$3(ReadDetailsState.this, glassButtonEffect, lVar27, z0Var6, z0Var4, (l2) obj, (u2.m) obj2, intValue);
                                                return ReadDetailsScreenUi$lambda$19$3;
                                            }
                                        }, qVar2), echoTheme.getSpacings(qVar2, i24).getX1(), ComposableSingletons$ReadDetailsScreenKt.INSTANCE.m1713getLambda$2098089693$app_productionRelease(), new d2(echoTheme.getSpacings(qVar2, i24).getX5(), echoTheme.getSpacings(qVar2, i24).getX6(), echoTheme.getSpacings(qVar2, i24).getX5(), 0), null, null, 0L, qVar6, 199728, 896);
                                        u2.q qVar7 = qVar6;
                                        qVar7.p(true);
                                        if (!ReadDetailsScreenUi$lambda$10(z0Var4)) {
                                            qVar7.X(-1091707281);
                                            ReadMeta readMeta2 = readDetailsState.getReadMeta();
                                            boolean readIsInPlayerQueue = readDetailsState.getReadIsInPlayerQueue();
                                            int i30 = i20 & 896;
                                            boolean h13 = (i30 == 256) | qVar7.h(readDetailsState);
                                            Object L23 = qVar7.L();
                                            if (h13 || L23 == eVar) {
                                                L23 = new c3.b(lVar18, readDetailsState, z0Var4, 27);
                                                qVar7.h0(L23);
                                            }
                                            ho.a aVar11 = (ho.a) L23;
                                            boolean z17 = i30 == 256;
                                            Object L24 = qVar7.L();
                                            if (z17 || L24 == eVar) {
                                                final int i31 = 0;
                                                L24 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.l
                                                    @Override // ho.a
                                                    public final Object invoke() {
                                                        sn.z ReadDetailsScreenUi$lambda$21$0;
                                                        sn.z ReadDetailsScreenUi$lambda$22$0;
                                                        switch (i31) {
                                                            case 0:
                                                                ReadDetailsScreenUi$lambda$21$0 = ReadDetailsScreenKt.ReadDetailsScreenUi$lambda$21$0(lVar18, z0Var4);
                                                                return ReadDetailsScreenUi$lambda$21$0;
                                                            default:
                                                                ReadDetailsScreenUi$lambda$22$0 = ReadDetailsScreenKt.ReadDetailsScreenUi$lambda$22$0(lVar18, z0Var4);
                                                                return ReadDetailsScreenUi$lambda$22$0;
                                                        }
                                                    }
                                                };
                                                qVar7.h0(L24);
                                            }
                                            ho.a aVar12 = (ho.a) L24;
                                            boolean z18 = i30 == 256;
                                            Object L25 = qVar7.L();
                                            if (z18 || L25 == eVar) {
                                                final int i32 = 1;
                                                L25 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.l
                                                    @Override // ho.a
                                                    public final Object invoke() {
                                                        sn.z ReadDetailsScreenUi$lambda$21$0;
                                                        sn.z ReadDetailsScreenUi$lambda$22$0;
                                                        switch (i32) {
                                                            case 0:
                                                                ReadDetailsScreenUi$lambda$21$0 = ReadDetailsScreenKt.ReadDetailsScreenUi$lambda$21$0(lVar18, z0Var4);
                                                                return ReadDetailsScreenUi$lambda$21$0;
                                                            default:
                                                                ReadDetailsScreenUi$lambda$22$0 = ReadDetailsScreenKt.ReadDetailsScreenUi$lambda$22$0(lVar18, z0Var4);
                                                                return ReadDetailsScreenUi$lambda$22$0;
                                                        }
                                                    }
                                                };
                                                qVar7.h0(L25);
                                            }
                                            ho.a aVar13 = (ho.a) L25;
                                            boolean h14 = (i30 == 256) | qVar7.h(readDetailsState);
                                            Object L26 = qVar7.L();
                                            if (h14 || L26 == eVar) {
                                                L26 = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.f(lVar18, readDetailsState, z0Var7, z0Var4);
                                                qVar7.h0(L26);
                                            }
                                            ho.a aVar14 = (ho.a) L26;
                                            boolean h15 = ((29360128 & i20) == 8388608) | (i30 == 256) | qVar7.h(readDetailsState);
                                            Object L27 = qVar7.L();
                                            if (h15 || L27 == eVar) {
                                                L27 = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.f(8, lVar18, readDetailsState, lVar22, z0Var4);
                                                lVar19 = lVar22;
                                                z0Var2 = z0Var4;
                                                qVar7.h0(L27);
                                            } else {
                                                z0Var2 = z0Var4;
                                                lVar19 = lVar22;
                                            }
                                            ho.a aVar15 = (ho.a) L27;
                                            boolean z19 = i30 == 256;
                                            Object L28 = qVar7.L();
                                            if (z19 || L28 == eVar) {
                                                L28 = new g1(lVar18, z0Var2, z0Var, 1);
                                                qVar7.h0(L28);
                                            }
                                            ho.a aVar16 = (ho.a) L28;
                                            Object L29 = qVar7.L();
                                            if (L29 == eVar) {
                                                L29 = new e(z0Var2, 2);
                                                qVar7.h0(L29);
                                            }
                                            MoreActionsSheetKt.MoreActionsSheet(readMeta2, readIsInPlayerQueue, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, (ho.a) L29, qVar7, 100663296);
                                            qVar7 = qVar7;
                                            qVar7.p(false);
                                        } else {
                                            lVar19 = lVar22;
                                            qVar7.X(-1090457981);
                                            qVar7.p(false);
                                        }
                                        if (!ReadDetailsScreenUi$lambda$7(z0Var)) {
                                            qVar7.X(-1090418239);
                                            String readId = readDetailsState.getReadId();
                                            Object L30 = qVar7.L();
                                            if (L30 == eVar) {
                                                L30 = new e(z0Var, 3);
                                                qVar7.h0(L30);
                                            }
                                            ReportProblemBottomSheetKt.ReportProblemBottomSheet(readId, (ho.a) L30, lVar21, null, qVar7, ((i20 >> 6) & 896) | 48, 8);
                                            qVar7.p(false);
                                        } else {
                                            qVar7.X(-1090231805);
                                            qVar7.p(false);
                                        }
                                        if (!readDetailsState.getShowRateTitleDialog()) {
                                            qVar7.X(-1090190017);
                                            String readId2 = readDetailsState.getReadId();
                                            boolean z20 = (i20 & 896) == 256;
                                            Object L31 = qVar7.L();
                                            if (z20 || L31 == eVar) {
                                                final int i33 = 2;
                                                L31 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.h
                                                    @Override // ho.l
                                                    public final Object invoke(Object obj) {
                                                        sn.z ReadDetailsScreenUi$lambda$19$0$3$0;
                                                        sn.z ReadDetailsScreenUi$lambda$19$0$8$0;
                                                        sn.z ReadDetailsScreenUi$lambda$28$0;
                                                        switch (i33) {
                                                            case 0:
                                                                ReadDetailsScreenUi$lambda$19$0$3$0 = ReadDetailsScreenKt.ReadDetailsScreenUi$lambda$19$0$3$0(lVar18, (ExploreRead) obj);
                                                                return ReadDetailsScreenUi$lambda$19$0$3$0;
                                                            case 1:
                                                                ReadDetailsScreenUi$lambda$19$0$8$0 = ReadDetailsScreenKt.ReadDetailsScreenUi$lambda$19$0$8$0(lVar18, (Activity) obj);
                                                                return ReadDetailsScreenUi$lambda$19$0$8$0;
                                                            default:
                                                                ReadDetailsScreenUi$lambda$28$0 = ReadDetailsScreenKt.ReadDetailsScreenUi$lambda$28$0(lVar18, ((Boolean) obj).booleanValue());
                                                                return ReadDetailsScreenUi$lambda$28$0;
                                                        }
                                                    }
                                                };
                                                qVar7.h0(L31);
                                            }
                                            RateTitleSheetKt.RateTitleSheet(readId2, (ho.l) L31, null, qVar7, 0, 4);
                                            z6 = false;
                                            qVar7.p(false);
                                        } else {
                                            z6 = false;
                                            qVar7.X(-1090032413);
                                            qVar7.p(false);
                                        }
                                        AnimatedVisibilityContainersKt.AnimatedSlideTopWithFadeVisibility(readDetailsState.getShowRatedToast(), c3.k.d(-1824381482, true, new m(lVar18, 0), qVar7), qVar7, i21);
                                        u2.q qVar8 = qVar7;
                                        FullScreenLoaderKt.m1838FullScreenLoaderFNF3uiM(((readDetailsState.isLoadingDetails() || readDetailsState.getReadDetails() != null) && !readDetailsState.isRedeemingCode()) ? z6 : true, null, 0L, qVar8, 0, 6);
                                        qVar = qVar8;
                                        lVar11 = lVar18;
                                        aVar3 = aVar5;
                                        lVar13 = lVar20;
                                        pVar2 = m1714getLambda$962485959$app_productionRelease;
                                        lVar12 = lVar21;
                                        lVar10 = lVar19;
                                        lVar14 = lVar16;
                                    }
                                }
                                z0Var = z0Var3;
                                qVar2.p(true);
                                final i3.t glassButtonEffect2 = GlassModifiersKt.glassButtonEffect(qVar3, glassState, qVar2, (GlassState.$stable << 3) | 6);
                                f10 = qVar2.f(x0Var);
                                L = qVar2.L();
                                if (!f10) {
                                }
                                L = new f(x0Var, 1);
                                qVar2.h0(L);
                                final ho.l lVar272 = lVar18;
                                z0 z0Var72 = z0Var6;
                                u2.q qVar62 = qVar2;
                                HeaderKt.m1896HeaderShfnhV8(f4.i0.q(qVar3, (ho.l) L), c3.k.d(-656776970, true, new i(aVar5, glassButtonEffect2, 0), qVar2), echoTheme.getSpacings(qVar2, i24).getX1(), c3.k.d(1539446324, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.k
                                    @Override // ho.q
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        sn.z ReadDetailsScreenUi$lambda$19$3;
                                        int intValue = ((Integer) obj3).intValue();
                                        ReadDetailsScreenUi$lambda$19$3 = ReadDetailsScreenKt.ReadDetailsScreenUi$lambda$19$3(ReadDetailsState.this, glassButtonEffect2, lVar272, z0Var6, z0Var4, (l2) obj, (u2.m) obj2, intValue);
                                        return ReadDetailsScreenUi$lambda$19$3;
                                    }
                                }, qVar2), echoTheme.getSpacings(qVar2, i24).getX1(), ComposableSingletons$ReadDetailsScreenKt.INSTANCE.m1713getLambda$2098089693$app_productionRelease(), new d2(echoTheme.getSpacings(qVar2, i24).getX5(), echoTheme.getSpacings(qVar2, i24).getX6(), echoTheme.getSpacings(qVar2, i24).getX5(), 0), null, null, 0L, qVar62, 199728, 896);
                                u2.q qVar72 = qVar62;
                                qVar72.p(true);
                                if (!ReadDetailsScreenUi$lambda$10(z0Var4)) {
                                }
                                if (!ReadDetailsScreenUi$lambda$7(z0Var)) {
                                }
                                if (!readDetailsState.getShowRateTitleDialog()) {
                                }
                                AnimatedVisibilityContainersKt.AnimatedSlideTopWithFadeVisibility(readDetailsState.getShowRatedToast(), c3.k.d(-1824381482, true, new m(lVar18, 0), qVar72), qVar72, i21);
                                u2.q qVar82 = qVar72;
                                FullScreenLoaderKt.m1838FullScreenLoaderFNF3uiM(((readDetailsState.isLoadingDetails() || readDetailsState.getReadDetails() != null) && !readDetailsState.isRedeemingCode()) ? z6 : true, null, 0L, qVar82, 0, 6);
                                qVar = qVar82;
                                lVar11 = lVar18;
                                aVar3 = aVar5;
                                lVar13 = lVar20;
                                pVar2 = m1714getLambda$962485959$app_productionRelease;
                                lVar12 = lVar21;
                                lVar10 = lVar19;
                                lVar14 = lVar16;
                            } else {
                                qVar = qVar4;
                                qVar.R();
                                pVar2 = pVar;
                                lVar10 = lVar5;
                                lVar11 = lVar6;
                                aVar3 = aVar2;
                                lVar12 = lVar7;
                                lVar13 = lVar9;
                                lVar14 = lVar8;
                            }
                            r10 = qVar.r();
                            if (r10 == null) {
                                r10.f34012d = new io.elevenlabs.readerapp.ui.components.x(readDetailsState, pVar2, lVar11, aVar3, lVar12, lVar14, lVar13, lVar10, i10, i11);
                                return;
                            }
                            return;
                        }
                        lVar8 = lVar3;
                        i17 = i11 & 64;
                        if (i17 == 0) {
                        }
                        int i232 = i12;
                        i18 = i11 & 128;
                        if (i18 == 0) {
                        }
                        i19 = i232;
                        if (!qVar4.O(i19 & 1, (i19 & 4793491) == 4793490)) {
                        }
                        r10 = qVar.r();
                        if (r10 == null) {
                        }
                    }
                    lVar7 = lVar2;
                    i16 = i11 & 32;
                    if (i16 != 0) {
                    }
                    lVar8 = lVar3;
                    i17 = i11 & 64;
                    if (i17 == 0) {
                    }
                    int i2322 = i12;
                    i18 = i11 & 128;
                    if (i18 == 0) {
                    }
                    i19 = i2322;
                    if (!qVar4.O(i19 & 1, (i19 & 4793491) == 4793490)) {
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                    }
                }
                aVar2 = aVar;
                i15 = i11 & 16;
                if (i15 == 0) {
                }
                lVar7 = lVar2;
                i16 = i11 & 32;
                if (i16 != 0) {
                }
                lVar8 = lVar3;
                i17 = i11 & 64;
                if (i17 == 0) {
                }
                int i23222 = i12;
                i18 = i11 & 128;
                if (i18 == 0) {
                }
                i19 = i23222;
                if (!qVar4.O(i19 & 1, (i19 & 4793491) == 4793490)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            lVar6 = lVar;
            i14 = i11 & 8;
            if (i14 != 0) {
            }
            aVar2 = aVar;
            i15 = i11 & 16;
            if (i15 == 0) {
            }
            lVar7 = lVar2;
            i16 = i11 & 32;
            if (i16 != 0) {
            }
            lVar8 = lVar3;
            i17 = i11 & 64;
            if (i17 == 0) {
            }
            int i232222 = i12;
            i18 = i11 & 128;
            if (i18 == 0) {
            }
            i19 = i232222;
            if (!qVar4.O(i19 & 1, (i19 & 4793491) == 4793490)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        lVar6 = lVar;
        i14 = i11 & 8;
        if (i14 != 0) {
        }
        aVar2 = aVar;
        i15 = i11 & 16;
        if (i15 == 0) {
        }
        lVar7 = lVar2;
        i16 = i11 & 32;
        if (i16 != 0) {
        }
        lVar8 = lVar3;
        i17 = i11 & 64;
        if (i17 == 0) {
        }
        int i2322222 = i12;
        i18 = i11 & 128;
        if (i18 == 0) {
        }
        i19 = i2322222;
        if (!qVar4.O(i19 & 1, (i19 & 4793491) == 4793490)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z ReadDetailsScreenUi$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    private static final boolean ReadDetailsScreenUi$lambda$10(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void ReadDetailsScreenUi$lambda$11(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    private static final String ReadDetailsScreenUi$lambda$13(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z ReadDetailsScreenUi$lambda$15$0(z0 z0Var) {
        z0Var.setValue(null);
        return sn.z.f31622a;
    }

    public static final x0 ReadDetailsScreenUi$lambda$16$0() {
        return new f1(250);
    }

    private static final int ReadDetailsScreenUi$lambda$17(x0 x0Var) {
        return ((f1) x0Var).h();
    }

    private static final void ReadDetailsScreenUi$lambda$18(x0 x0Var, int i10) {
        ((f1) x0Var).i(i10);
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$0$0$0(ho.l lVar) {
        lVar.invoke(new m0(22));
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$0$0$0$0(ReadDetailsViewModel readDetailsViewModel) {
        readDetailsViewModel.getClass();
        readDetailsViewModel.onRetry();
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$0$1$0(ho.l lVar) {
        lVar.invoke(new t(18));
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$0$1$0$0(ReadDetailsViewModel readDetailsViewModel) {
        readDetailsViewModel.getClass();
        readDetailsViewModel.onRetry();
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$0$2$0(ho.l lVar) {
        lVar.invoke(new t(21));
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$0$2$0$0(ReadDetailsViewModel readDetailsViewModel) {
        readDetailsViewModel.getClass();
        readDetailsViewModel.togglePreview();
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$0$3$0(ho.l lVar, ExploreRead exploreRead) {
        exploreRead.getClass();
        lVar.invoke(new j0(exploreRead, 4));
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$0$3$0$0(ExploreRead exploreRead, ReadDetailsViewModel readDetailsViewModel) {
        readDetailsViewModel.getClass();
        readDetailsViewModel.playCarouselPreview(exploreRead);
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$0$4$0(ho.l lVar, ReadDetailsState readDetailsState) {
        lVar.invoke(new p(readDetailsState, 1));
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$0$4$0$0(ReadDetailsState readDetailsState, ReadDetailsViewModel readDetailsViewModel) {
        readDetailsViewModel.getClass();
        readDetailsViewModel.openPlayer(readDetailsState.getSampleReadId());
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$0$5$0(ho.l lVar, ReadDetailsState readDetailsState) {
        lVar.invoke(new p(readDetailsState, 3));
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$0$5$0$0(ReadDetailsState readDetailsState, ReadDetailsViewModel readDetailsViewModel) {
        readDetailsViewModel.getClass();
        readDetailsViewModel.openPlayer(readDetailsState.getReadId());
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$0$6$0(z0 z0Var) {
        ReadDetailsScreenUi$lambda$8(z0Var, true);
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$0$7$0(ho.l lVar) {
        lVar.invoke(new m0(11));
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$0$7$0$0(ReadDetailsViewModel readDetailsViewModel) {
        readDetailsViewModel.getClass();
        readDetailsViewModel.onRateTitleClick();
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$0$8$0(ho.l lVar, Activity activity) {
        activity.getClass();
        lVar.invoke(new j0(activity, 5));
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$0$8$0$0(Activity activity, ReadDetailsViewModel readDetailsViewModel) {
        readDetailsViewModel.getClass();
        readDetailsViewModel.purchaseRead(activity);
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$0$9$0(ho.l lVar) {
        lVar.invoke(new t(1));
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$0$9$0$0(ReadDetailsViewModel readDetailsViewModel) {
        readDetailsViewModel.getClass();
        readDetailsViewModel.navigateToPaywall();
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$1$0(x0 x0Var, h5.l lVar) {
        ReadDetailsScreenUi$lambda$18(x0Var, (int) (lVar.f12092a & 4294967295L));
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$2(ho.a aVar, i3.t tVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        int i11;
        l2Var.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(l2Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            EchoBackButtonKt.EchoBackButton(aVar, tVar, EchoButtonVariant.GhostWhite, null, qVar, 384, 8);
            r1.d.g(l2Var.b(i3.q.f13017a, 1.0f, true), qVar);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$3(ReadDetailsState readDetailsState, i3.t tVar, ho.l lVar, z0 z0Var, z0 z0Var2, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (f10 || L == eVar) {
                L = new l0(lVar, z0Var, 2);
                qVar.h0(L);
            }
            ho.l lVar2 = (ho.l) L;
            boolean f11 = qVar.f(lVar) | qVar.h(readDetailsState);
            Object L2 = qVar.L();
            if (f11 || L2 == eVar) {
                L2 = new d(lVar, readDetailsState, 0);
                qVar.h0(L2);
            }
            ho.a aVar = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new e(z0Var2, 0);
                qVar.h0(L3);
            }
            ReadDetailsHeaderActions(readDetailsState, tVar, lVar2, aVar, (ho.a) L3, qVar, 24576);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$3$0$0(ho.l lVar, z0 z0Var, String str) {
        str.getClass();
        lVar.invoke(new t(16));
        z0Var.setValue(str);
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$3$0$0$0(ReadDetailsViewModel readDetailsViewModel) {
        readDetailsViewModel.getClass();
        readDetailsViewModel.onShareClick(Analytics.Event.ReadDetailsActionSource.TopBar);
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$3$1$0(ho.l lVar, ReadDetailsState readDetailsState) {
        lVar.invoke(new p(readDetailsState, 0));
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$3$1$0$0(ReadDetailsState readDetailsState, ReadDetailsViewModel readDetailsViewModel) {
        readDetailsViewModel.getClass();
        if (readDetailsState.isInReadLater()) {
            readDetailsViewModel.onRemoveFromReadLaterClick();
        } else {
            readDetailsViewModel.onAddToReadLaterClick();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$19$3$2$0(z0 z0Var) {
        ReadDetailsScreenUi$lambda$11(z0Var, true);
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$20$0(ho.l lVar, ReadDetailsState readDetailsState, z0 z0Var) {
        lVar.invoke(new p(readDetailsState, 2));
        ReadDetailsScreenUi$lambda$11(z0Var, false);
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$20$0$0(ReadDetailsState readDetailsState, ReadDetailsViewModel readDetailsViewModel) {
        readDetailsViewModel.getClass();
        readDetailsViewModel.openPlayer(readDetailsState.getReadId());
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$21$0(ho.l lVar, z0 z0Var) {
        lVar.invoke(new m0(27));
        ReadDetailsScreenUi$lambda$11(z0Var, false);
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$21$0$0(ReadDetailsViewModel readDetailsViewModel) {
        readDetailsViewModel.getClass();
        readDetailsViewModel.onAddToQueueClick();
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$22$0(ho.l lVar, z0 z0Var) {
        lVar.invoke(new t(12));
        ReadDetailsScreenUi$lambda$11(z0Var, false);
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$22$0$0(ReadDetailsViewModel readDetailsViewModel) {
        readDetailsViewModel.getClass();
        readDetailsViewModel.onRemoveFromQueueClick();
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$23$0(ho.l lVar, ReadDetailsState readDetailsState, z0 z0Var, z0 z0Var2) {
        String shareUrl;
        lVar.invoke(new m0(23));
        ReadDetailsResponse readDetails = readDetailsState.getReadDetails();
        if (readDetails != null && (shareUrl = readDetails.getShareUrl()) != null) {
            z0Var.setValue(shareUrl);
        }
        ReadDetailsScreenUi$lambda$11(z0Var2, false);
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$23$0$0(ReadDetailsViewModel readDetailsViewModel) {
        readDetailsViewModel.getClass();
        readDetailsViewModel.onShareClick(Analytics.Event.ReadDetailsActionSource.MoreActionsSheet);
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$24$0(ho.l lVar, ReadDetailsState readDetailsState, ho.l lVar2, z0 z0Var) {
        lVar.invoke(new m0(26));
        String readId = readDetailsState.getReadId();
        if (readId != null) {
            lVar2.invoke(readId);
        }
        ReadDetailsScreenUi$lambda$11(z0Var, false);
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$24$0$0(ReadDetailsViewModel readDetailsViewModel) {
        readDetailsViewModel.getClass();
        readDetailsViewModel.onAddToCollectionClick();
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$25$0(ho.l lVar, z0 z0Var, z0 z0Var2) {
        lVar.invoke(new t(20));
        ReadDetailsScreenUi$lambda$11(z0Var, false);
        ReadDetailsScreenUi$lambda$8(z0Var2, true);
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$25$0$0(ReadDetailsViewModel readDetailsViewModel) {
        readDetailsViewModel.getClass();
        readDetailsViewModel.onHelpClick();
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$26$0(z0 z0Var) {
        ReadDetailsScreenUi$lambda$11(z0Var, false);
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$27$0(z0 z0Var) {
        ReadDetailsScreenUi$lambda$8(z0Var, false);
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$28$0(ho.l lVar, boolean z6) {
        lVar.invoke(new i0(z6, 4));
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$28$0$0(boolean z6, ReadDetailsViewModel readDetailsViewModel) {
        readDetailsViewModel.getClass();
        readDetailsViewModel.onRateTitleDialogClose(z6);
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$29(ho.l lVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            WeakHashMap weakHashMap = c3.f29142x;
            i3.t e10 = ib.i.e(EchoTheme.INSTANCE, qVar, EchoTheme.$stable, r1.d.P(i3.q.f13017a, u0.e(qVar).f29154l));
            String R = kj.c.R(qVar, R.string.rating_success_title);
            String R2 = kj.c.R(qVar, R.string.rating_success_text);
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new g(lVar, 5);
                qVar.h0(L);
            }
            EchoToastKt.EchoToast(R2, e10, R, null, (ho.a) L, null, qVar, 0, 40);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$29$0$0(ho.l lVar) {
        lVar.invoke(new m0(10));
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$29$0$0$0(ReadDetailsViewModel readDetailsViewModel) {
        readDetailsViewModel.getClass();
        readDetailsViewModel.onToastClick();
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$3$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$30(ReadDetailsState readDetailsState, ho.p pVar, ho.l lVar, ho.a aVar, ho.l lVar2, ho.l lVar3, ho.l lVar4, ho.l lVar5, int i10, int i11, u2.m mVar, int i12) {
        ReadDetailsScreenUi(readDetailsState, pVar, lVar, aVar, lVar2, lVar3, lVar4, lVar5, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$4$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z ReadDetailsScreenUi$lambda$5$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    private static final boolean ReadDetailsScreenUi$lambda$7(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void ReadDetailsScreenUi$lambda$8(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ReadLaterToggleButton(boolean z6, ho.a aVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        ho.a aVar2;
        i3.t tVar2;
        int i13;
        boolean z10;
        i3.t tVar3;
        r1 r10;
        i3.t tVar4;
        int i14;
        int i15;
        int i16;
        int i17;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(845278733);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            aVar2 = aVar;
            if (qVar.h(aVar2)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        } else {
            aVar2 = aVar;
        }
        int i18 = i11 & 4;
        if (i18 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 147) == 146) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!qVar.O(i12 & 1, z10)) {
                if (i18 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                if (z6) {
                    i14 = io.elevenlabs.ui.R.drawable.checkmark_1;
                } else {
                    i14 = io.elevenlabs.ui.R.drawable.plus_large;
                }
                int i19 = i14;
                if (z6) {
                    i15 = R.string.read_details_more_actions_item_title_remove_from_read_later;
                } else {
                    i15 = R.string.read_details_more_actions_item_title_add_to_read_later;
                }
                EchoIconButtonKt.EchoIconButton(i19, aVar2, tVar4, kj.c.R(qVar, i15), EchoButtonVariant.GhostWhite, EchoButtonSize.Medium, false, false, false, qVar, (i12 & 112) | 221184 | (i12 & 896), 448);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.agent.c(z6, aVar, tVar3, i10, i11, 2);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar.O(i12 & 1, z10)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z ReadLaterToggleButton$lambda$0(boolean z6, ho.a aVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        ReadLaterToggleButton(z6, aVar, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    private static final void SingleRowLayout(final ButtonLayoutState buttonLayoutState, final String str, final String str2, final boolean z6, final String str3, final boolean z10, final boolean z11, final ho.a aVar, final ho.a aVar2, final ho.a aVar3, final ho.l lVar, final ho.a aVar4, u2.m mVar, final int i10, final int i11) {
        int i12;
        String str4;
        boolean z12;
        ho.a aVar5;
        int i13;
        boolean z13;
        i3.t tVar;
        boolean z14;
        String R;
        Integer num;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        String str5;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1123296063);
        if ((i10 & 6) == 0) {
            if (qVar.f(buttonLayoutState)) {
                i24 = 4;
            } else {
                i24 = 2;
            }
            i12 = i24 | i10;
        } else {
            i12 = i10;
        }
        int i25 = 16;
        if ((i10 & 48) == 0) {
            if (qVar.f(str)) {
                i23 = 32;
            } else {
                i23 = 16;
            }
            i12 |= i23;
        }
        if ((i10 & 384) == 0) {
            if (qVar.f(str2)) {
                i22 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i22 = 128;
            }
            i12 |= i22;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.g(z6)) {
                i21 = 2048;
            } else {
                i21 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i21;
        }
        if ((i10 & 24576) == 0) {
            str4 = str3;
            if (qVar.f(str4)) {
                i20 = 16384;
            } else {
                i20 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i20;
        } else {
            str4 = str3;
        }
        if ((196608 & i10) == 0) {
            z12 = z10;
            if (qVar.g(z12)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i12 |= i19;
        } else {
            z12 = z10;
        }
        if ((1572864 & i10) == 0) {
            if (qVar.g(z11)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i12 |= i18;
        }
        if ((12582912 & i10) == 0) {
            aVar5 = aVar;
            if (qVar.h(aVar5)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i12 |= i17;
        } else {
            aVar5 = aVar;
        }
        if ((100663296 & i10) == 0) {
            if (qVar.h(aVar2)) {
                i16 = 67108864;
            } else {
                i16 = 33554432;
            }
            i12 |= i16;
        }
        if ((i10 & 805306368) == 0) {
            if (qVar.h(aVar3)) {
                i15 = 536870912;
            } else {
                i15 = 268435456;
            }
            i12 |= i15;
        }
        if ((i11 & 6) == 0) {
            if (qVar.h(lVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i11 | i14;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar.h(aVar4)) {
                i25 = 32;
            }
            i13 |= i25;
        }
        if ((306783379 & i12) == 306783378 && (i13 & 19) == 18) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (qVar.O(i12 & 1, z13)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i26 = EchoTheme.$stable;
            int i27 = i12;
            i3.t t10 = r1.d.t(r1.d.I(r1.d.G(i3.q.f13017a, echoTheme.getSpacings(qVar, i26).getX5(), t2.u.P, 2), t2.u.P, t2.u.P, t2.u.P, echoTheme.getSpacings(qVar, i26).getX4(), 7), i1.f29224a);
            u0 u0Var = r1.j.f29228a;
            k2 a10 = i2.a(ib.i.m(echoTheme, qVar, i26), i3.d.f13004y0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(t10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            i3.t c10 = p2.c(new m1(1.0f, true), 1.0f);
            if (buttonLayoutState.getShowPreviewButton()) {
                qVar.X(-1076995822);
                int i28 = i27 >> 15;
                tVar = c10;
                z14 = false;
                PreviewButton(str4, z12, aVar5, aVar2, tVar, qVar, ((i27 >> 12) & 126) | (i28 & 896) | (i28 & 7168), 0);
                qVar.p(false);
            } else {
                tVar = c10;
                z14 = false;
                qVar.X(-1076698873);
                qVar.p(false);
            }
            ButtonLayoutState.MainButtonType mainButtonType = buttonLayoutState.getMainButtonType();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i29 = iArr[mainButtonType.ordinal()];
            if (i29 != 1) {
                if (i29 != 2) {
                    if (i29 != 3 && i29 != 4) {
                        throw com.google.android.gms.internal.play_billing.b.h(796553298, qVar, z14);
                    }
                    qVar.X(796568168);
                    qVar.p(z14);
                    R = str2;
                } else {
                    qVar.X(796558810);
                    int i30 = R.string.read_details_purchase_action;
                    if (str == null) {
                        qVar.X(796561989);
                        str5 = kj.c.R(qVar, R.string.explore_book_paid);
                        qVar.p(z14);
                    } else {
                        qVar.X(796561493);
                        qVar.p(z14);
                        str5 = str;
                    }
                    R = kj.c.Q(i30, new Object[]{str5}, qVar);
                    qVar.p(z14);
                }
            } else {
                qVar.X(796555493);
                R = kj.c.R(qVar, R.string.read_details_play);
                qVar.p(z14);
            }
            if (iArr[buttonLayoutState.getMainButtonType().ordinal()] == 1) {
                num = Integer.valueOf(io.elevenlabs.ui.R.drawable.play_round);
            } else {
                num = null;
            }
            if (iArr[buttonLayoutState.getMainButtonType().ordinal()] == 2) {
                z15 = z6;
            } else {
                z15 = z11;
            }
            final Context context = (Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b);
            FullWidthButtonVariant fullWidthButtonVariant = FullWidthButtonVariant.Primary;
            FullWidthButtonSize fullWidthButtonSize = FullWidthButtonSize.Large;
            i3.t x10 = i4.i0.x(tVar, "reader-details-play");
            if ((i27 & 14) == 4) {
                z16 = true;
            } else {
                z16 = z14;
            }
            if ((i27 & 1879048192) == 536870912) {
                z17 = true;
            } else {
                z17 = z14;
            }
            boolean h10 = z17 | z16 | qVar.h(context);
            if ((i13 & 14) == 4) {
                z18 = true;
            } else {
                z18 = z14;
            }
            boolean z20 = h10 | z18;
            if ((i13 & 112) == 32) {
                z19 = true;
            } else {
                z19 = z14;
            }
            boolean z21 = z20 | z19;
            Object L = qVar.L();
            if (z21 || L == u2.l.f33918a) {
                ho.a aVar6 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.x
                    @Override // ho.a
                    public final Object invoke() {
                        sn.z SingleRowLayout$lambda$0$0$0;
                        SingleRowLayout$lambda$0$0$0 = ReadDetailsScreenKt.SingleRowLayout$lambda$0$0$0(ButtonLayoutState.this, aVar3, context, aVar4, lVar);
                        return SingleRowLayout$lambda$0$0$0;
                    }
                };
                qVar.h0(aVar6);
                L = aVar6;
            }
            FullWidthButtonKt.EchoThemeFullWidthButton(R, (ho.a) L, x10, fullWidthButtonSize, fullWidthButtonVariant, num, z15, false, false, qVar, 27648, 384);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.y
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z SingleRowLayout$lambda$1;
                    int intValue = ((Integer) obj2).intValue();
                    SingleRowLayout$lambda$1 = ReadDetailsScreenKt.SingleRowLayout$lambda$1(ButtonLayoutState.this, str, str2, z6, str3, z10, z11, aVar, aVar2, aVar3, lVar, aVar4, i10, i11, (u2.m) obj, intValue);
                    return SingleRowLayout$lambda$1;
                }
            };
        }
    }

    public static final sn.z SingleRowLayout$lambda$0$0$0(ButtonLayoutState buttonLayoutState, ho.a aVar, Context context, ho.a aVar2, ho.l lVar) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[buttonLayoutState.getMainButtonType().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3 && i10 != 4) {
                    c6.p();
                    return null;
                }
                aVar2.invoke();
            } else {
                Activity findActivity = ContextExtensionsKt.findActivity(context);
                if (findActivity != null) {
                    lVar.invoke(findActivity);
                }
            }
        } else {
            aVar.invoke();
        }
        return sn.z.f31622a;
    }

    public static final sn.z SingleRowLayout$lambda$1(ButtonLayoutState buttonLayoutState, String str, String str2, boolean z6, String str3, boolean z10, boolean z11, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.l lVar, ho.a aVar4, int i10, int i11, u2.m mVar, int i12) {
        SingleRowLayout(buttonLayoutState, str, str2, z6, str3, z10, z11, aVar, aVar2, aVar3, lVar, aVar4, mVar, u2.r.M(i10 | 1), u2.r.M(i11));
        return sn.z.f31622a;
    }

    private static final List<MetaItem> computeFallbackMetaItems(ReadMeta readMeta, u2.m mVar, int i10) {
        String charCountToTextDuration;
        ListeningProgress listeningProgress = ListeningProgressKt.getListeningProgress(readMeta);
        ArrayList arrayList = new ArrayList();
        if (listeningProgress.getTotalUnits() > 0.0d) {
            u2.q qVar = (u2.q) mVar;
            qVar.X(-1344826468);
            if (listeningProgress.isAudioOnly()) {
                qVar.X(-1344778976);
                charCountToTextDuration = MinutesFormatterKt.formatSecondsAsDuration(listeningProgress.getTotalUnits(), qVar, 0);
                qVar.p(false);
            } else {
                qVar.X(-1344704297);
                charCountToTextDuration = WordCountToLengthFormatterKt.charCountToTextDuration((long) listeningProgress.getTotalUnits(), qVar, 0);
                qVar.p(false);
            }
            arrayList.add(new MetaItem(MetaStatKeys.KEY_LENGTH, charCountToTextDuration));
            qVar.p(false);
        } else {
            u2.q qVar2 = (u2.q) mVar;
            qVar2.X(-1344541051);
            qVar2.p(false);
        }
        Rating rating = readMeta.getRating();
        if (rating != null && rating.getCount() > 0) {
            arrayList.add(new MetaItem(MetaStatKeys.KEY_RATING, RateFormatterKt.formatRatingScore(rating.getAverage())));
        }
        return arrayList;
    }

    private static final i1.m0 crossfadeWithStagger(int i10, float f10) {
        if (t2.u.P <= f10 && f10 <= 1.0f) {
            int l4 = (int) ((1.0f - ae.l.l(f10, t2.u.P, 1.0f)) * i10);
            return i1.l.c(y0.e(j1.e.s(l4, i10 - l4, null, 4), 2), y0.f(j1.e.s(l4, 0, null, 4), 2));
        }
        c6.t("stagger must be between 0f and 1f");
        return null;
    }

    public static /* synthetic */ i1.m0 crossfadeWithStagger$default(int i10, float f10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 500;
        }
        if ((i11 & 2) != 0) {
            f10 = 0.2f;
        }
        return crossfadeWithStagger(i10, f10);
    }

    private static final <T> T rememberDebouncedValue(T t10, long j4, u2.m mVar, int i10, int i11) {
        boolean z6;
        if ((i11 & 2) != 0) {
            j4 = 100;
        }
        boolean z10 = false;
        if ((((i10 & 112) ^ 48) > 32 && ((u2.q) mVar).e(j4)) || (i10 & 48) == 32) {
            z6 = true;
        } else {
            z6 = false;
        }
        int i12 = i10 & 14;
        if (((i12 ^ 6) > 4 && ((u2.q) mVar).h(t10)) || (i10 & 6) == 4) {
            z10 = true;
        }
        boolean z11 = z6 | z10;
        u2.q qVar = (u2.q) mVar;
        Object L = qVar.L();
        if (z11 || L == u2.l.f33918a) {
            L = new ReadDetailsScreenKt$rememberDebouncedValue$1$1(j4, t10, null);
            qVar.h0(L);
        }
        return (T) u2.r.C(t10, t10, (ho.p) L, qVar, ((i10 & 8) << 3) | i12 | ((i10 << 3) & 112)).getValue();
    }
}
