package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.Configuration;
import io.elevenlabs.domain.model.BinarySearchList;
import io.elevenlabs.domain.model.DisplayMode;
import io.elevenlabs.domain.model.PlayerDisplayMode;
import io.elevenlabs.domain.model.Pronunciation;
import io.elevenlabs.domain.model.PronunciationPreviewState;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.domain.model.SkipDuration;
import io.elevenlabs.domain.model.UserConfig;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.highlighter.HighlighterData;
import io.livekit.android.room.SignalClient;
import io.livekit.android.rpc.RpcError;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0095\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0003\b©\u0001\n\u0002\u0010\t\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0005\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010'\u001a\u00020\u0006\u0012\b\b\u0002\u0010(\u001a\u00020\u0006\u0012\b\b\u0002\u0010)\u001a\u00020\u0006\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010+\u001a\u00020\u0006\u0012\b\b\u0002\u0010,\u001a\u00020\u0006\u0012\b\b\u0002\u0010-\u001a\u00020\u0006\u0012\b\b\u0002\u0010.\u001a\u00020\u0006\u0012\b\b\u0002\u0010/\u001a\u00020\u0006\u0012\b\b\u0002\u00100\u001a\u00020\u0006\u0012\b\b\u0002\u00101\u001a\u00020\u0006\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u00103\u001a\u00020\u001f\u0012\b\b\u0002\u00104\u001a\u00020\u0006\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u000107\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;\u0012\b\b\u0002\u0010=\u001a\u00020\u0006\u0012\b\b\u0002\u0010>\u001a\u00020\u0006\u0012\b\b\u0002\u0010?\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010@\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010A\u0012\b\b\u0002\u0010E\u001a\u00020D\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010F\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010I\u001a\u00020\u0006\u0012\b\b\u0002\u0010J\u001a\u00020\u0006\u0012\b\b\u0002\u0010K\u001a\u00020\t\u0012\b\b\u0002\u0010L\u001a\u00020\u0006\u0012\b\b\u0002\u0010M\u001a\u00020\u0006\u0012\b\b\u0002\u0010O\u001a\u00020N\u0012\b\b\u0002\u0010P\u001a\u00020N¢\u0006\u0004\bQ\u0010RJ\u001a\u0010T\u001a\u00020\u00062\b\u0010S\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\tH\u0016¢\u0006\u0004\bV\u0010WJ\u0012\u0010X\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b^\u0010]J\u0010\u0010_\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b_\u0010WJ\u0010\u0010`\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b`\u0010aJ\u0012\u0010b\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bd\u0010YJ\u0010\u0010e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\be\u0010]J\u0010\u0010f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bf\u0010]J\u0010\u0010g\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bg\u0010]J\u0010\u0010h\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bh\u0010]J\u0012\u0010i\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bi\u0010jJ\u0012\u0010k\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bk\u0010YJ\u0010\u0010l\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bl\u0010]J\u0012\u0010m\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bm\u0010nJ\u0010\u0010o\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bo\u0010]J\u0012\u0010p\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bp\u0010YJ\u0010\u0010q\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bq\u0010]J\u0010\u0010r\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\br\u0010]J\u0010\u0010s\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bs\u0010]J\u0012\u0010t\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bt\u0010uJ\u0012\u0010v\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bv\u0010wJ\u0012\u0010x\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bx\u0010yJ\u0012\u0010z\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bz\u0010{J\u0010\u0010|\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b|\u0010]J\u0010\u0010}\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b}\u0010]J\u0010\u0010~\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b~\u0010]J\u0012\u0010\u007f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u007f\u0010YJ\u0012\u0010\u0080\u0001\u001a\u00020\u0006HÆ\u0003¢\u0006\u0005\b\u0080\u0001\u0010]J\u0012\u0010\u0081\u0001\u001a\u00020\u0006HÆ\u0003¢\u0006\u0005\b\u0081\u0001\u0010]J\u0012\u0010\u0082\u0001\u001a\u00020\u0006HÆ\u0003¢\u0006\u0005\b\u0082\u0001\u0010]J\u0012\u0010\u0083\u0001\u001a\u00020\u0006HÆ\u0003¢\u0006\u0005\b\u0083\u0001\u0010]J\u0012\u0010\u0084\u0001\u001a\u00020\u0006HÆ\u0003¢\u0006\u0005\b\u0084\u0001\u0010]J\u0012\u0010\u0085\u0001\u001a\u00020\u0006HÆ\u0003¢\u0006\u0005\b\u0085\u0001\u0010]J\u0012\u0010\u0086\u0001\u001a\u00020\u0006HÆ\u0003¢\u0006\u0005\b\u0086\u0001\u0010]J\u0014\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u0087\u0001\u0010YJ\u0012\u0010\u0088\u0001\u001a\u00020\u001fHÆ\u0003¢\u0006\u0005\b\u0088\u0001\u0010uJ\u0012\u0010\u0089\u0001\u001a\u00020\u0006HÆ\u0003¢\u0006\u0005\b\u0089\u0001\u0010]J\u0014\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u008a\u0001\u0010YJ\u0014\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u008b\u0001\u0010YJ!\u0010\u008c\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u000107HÆ\u0003¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0014\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u008e\u0001\u0010YJ\u0014\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u008f\u0001\u0010YJ\u0015\u0010\u0090\u0001\u001a\u0004\u0018\u00010;HÆ\u0003¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u0012\u0010\u0092\u0001\u001a\u00020\u0006HÆ\u0003¢\u0006\u0005\b\u0092\u0001\u0010]J\u0012\u0010\u0093\u0001\u001a\u00020\u0006HÆ\u0003¢\u0006\u0005\b\u0093\u0001\u0010]J\u0012\u0010\u0094\u0001\u001a\u00020\u0006HÆ\u0003¢\u0006\u0005\b\u0094\u0001\u0010]J\u001b\u0010\u0095\u0001\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010@HÆ\u0003¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0015\u0010\u0097\u0001\u001a\u0004\u0018\u00010AHÆ\u0003¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0013\u0010\u0099\u0001\u001a\u00020DHÆ\u0003¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0015\u0010\u009b\u0001\u001a\u0004\u0018\u00010FHÆ\u0003¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0014\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u009d\u0001\u0010YJ\u0012\u0010\u009e\u0001\u001a\u00020\u0006HÆ\u0003¢\u0006\u0005\b\u009e\u0001\u0010]J\u0012\u0010\u009f\u0001\u001a\u00020\u0006HÆ\u0003¢\u0006\u0005\b\u009f\u0001\u0010]J\u0012\u0010 \u0001\u001a\u00020\tHÆ\u0003¢\u0006\u0005\b \u0001\u0010WJ\u0012\u0010¡\u0001\u001a\u00020\u0006HÆ\u0003¢\u0006\u0005\b¡\u0001\u0010]J\u0012\u0010¢\u0001\u001a\u00020\u0006HÆ\u0003¢\u0006\u0005\b¢\u0001\u0010]J\u0013\u0010£\u0001\u001a\u00020NHÆ\u0003¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u0013\u0010¥\u0001\u001a\u00020NHÆ\u0003¢\u0006\u0006\b¥\u0001\u0010¤\u0001J©\u0005\u0010¦\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010'\u001a\u00020\u00062\b\b\u0002\u0010(\u001a\u00020\u00062\b\b\u0002\u0010)\u001a\u00020\u00062\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010+\u001a\u00020\u00062\b\b\u0002\u0010,\u001a\u00020\u00062\b\b\u0002\u0010-\u001a\u00020\u00062\b\b\u0002\u0010.\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020\u00062\b\b\u0002\u00100\u001a\u00020\u00062\b\b\u0002\u00101\u001a\u00020\u00062\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u00103\u001a\u00020\u001f2\b\b\u0002\u00104\u001a\u00020\u00062\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u0001072\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;2\b\b\u0002\u0010=\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u00062\b\b\u0002\u0010?\u001a\u00020\u00062\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010@2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010A2\b\b\u0002\u0010E\u001a\u00020D2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010F2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010I\u001a\u00020\u00062\b\b\u0002\u0010J\u001a\u00020\u00062\b\b\u0002\u0010K\u001a\u00020\t2\b\b\u0002\u0010L\u001a\u00020\u00062\b\b\u0002\u0010M\u001a\u00020\u00062\b\b\u0002\u0010O\u001a\u00020N2\b\b\u0002\u0010P\u001a\u00020NHÆ\u0001¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0012\u0010¨\u0001\u001a\u00020\u0002HÖ\u0001¢\u0006\u0005\b¨\u0001\u0010YR\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0003\u0010©\u0001\u001a\u0005\bª\u0001\u0010YR\u0019\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0005\u0010«\u0001\u001a\u0005\b¬\u0001\u0010[R\u0018\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\r\n\u0005\b\u0007\u0010\u00ad\u0001\u001a\u0004\b\u0007\u0010]R\u0018\u0010\b\u001a\u00020\u00068\u0006¢\u0006\r\n\u0005\b\b\u0010\u00ad\u0001\u001a\u0004\b\b\u0010]R\u0019\u0010\n\u001a\u00020\t8\u0006¢\u0006\u000e\n\u0005\b\n\u0010®\u0001\u001a\u0005\b¯\u0001\u0010WR\u0019\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\u000e\n\u0005\b\f\u0010°\u0001\u001a\u0005\b±\u0001\u0010aR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000e\n\u0005\b\u000e\u0010²\u0001\u001a\u0005\b³\u0001\u0010cR\u0019\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u000f\u0010©\u0001\u001a\u0005\b´\u0001\u0010YR\u0019\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b\u0010\u0010\u00ad\u0001\u001a\u0005\bµ\u0001\u0010]R\u0018\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\r\n\u0005\b\u0011\u0010\u00ad\u0001\u001a\u0004\b\u0011\u0010]R\u0018\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\r\n\u0005\b\u0012\u0010\u00ad\u0001\u001a\u0004\b\u0012\u0010]R\u0018\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\r\n\u0005\b\u0013\u0010\u00ad\u0001\u001a\u0004\b\u0013\u0010]R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\u000e\n\u0005\b\u0015\u0010¶\u0001\u001a\u0005\b·\u0001\u0010jR\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0016\u0010©\u0001\u001a\u0005\b¸\u0001\u0010YR\u0019\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b\u0017\u0010\u00ad\u0001\u001a\u0005\b¹\u0001\u0010]R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\u000e\n\u0005\b\u0019\u0010º\u0001\u001a\u0005\b»\u0001\u0010nR\u0019\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b\u001a\u0010\u00ad\u0001\u001a\u0005\b¼\u0001\u0010]R\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u001b\u0010©\u0001\u001a\u0005\b½\u0001\u0010YR\u0019\u0010\u001c\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b\u001c\u0010\u00ad\u0001\u001a\u0005\b¾\u0001\u0010]R\u0019\u0010\u001d\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b\u001d\u0010\u00ad\u0001\u001a\u0005\b¿\u0001\u0010]R\u0019\u0010\u001e\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b\u001e\u0010\u00ad\u0001\u001a\u0005\bÀ\u0001\u0010]R\u001b\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\u000e\n\u0005\b \u0010Á\u0001\u001a\u0005\bÂ\u0001\u0010uR\u001b\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\u000e\n\u0005\b\"\u0010Ã\u0001\u001a\u0005\bÄ\u0001\u0010wR\u001b\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\u000e\n\u0005\b$\u0010Å\u0001\u001a\u0005\bÆ\u0001\u0010yR\u001b\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\u000e\n\u0005\b&\u0010Ç\u0001\u001a\u0005\bÈ\u0001\u0010{R\u0019\u0010'\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b'\u0010\u00ad\u0001\u001a\u0005\bÉ\u0001\u0010]R\u0019\u0010(\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b(\u0010\u00ad\u0001\u001a\u0005\bÊ\u0001\u0010]R\u0019\u0010)\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b)\u0010\u00ad\u0001\u001a\u0005\bË\u0001\u0010]R\u001b\u0010*\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b*\u0010©\u0001\u001a\u0005\bÌ\u0001\u0010YR\u0019\u0010+\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b+\u0010\u00ad\u0001\u001a\u0005\bÍ\u0001\u0010]R\u0019\u0010,\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b,\u0010\u00ad\u0001\u001a\u0005\bÎ\u0001\u0010]R\u0019\u0010-\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b-\u0010\u00ad\u0001\u001a\u0005\bÏ\u0001\u0010]R\u0019\u0010.\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b.\u0010\u00ad\u0001\u001a\u0005\bÐ\u0001\u0010]R\u0019\u0010/\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b/\u0010\u00ad\u0001\u001a\u0005\bÑ\u0001\u0010]R\u0019\u00100\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b0\u0010\u00ad\u0001\u001a\u0005\bÒ\u0001\u0010]R\u0019\u00101\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b1\u0010\u00ad\u0001\u001a\u0005\bÓ\u0001\u0010]R\u001b\u00102\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b2\u0010©\u0001\u001a\u0005\bÔ\u0001\u0010YR\u0019\u00103\u001a\u00020\u001f8\u0006¢\u0006\u000e\n\u0005\b3\u0010Á\u0001\u001a\u0005\bÕ\u0001\u0010uR\u0019\u00104\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b4\u0010\u00ad\u0001\u001a\u0005\bÖ\u0001\u0010]R\u001b\u00105\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b5\u0010©\u0001\u001a\u0005\b×\u0001\u0010YR\u001b\u00106\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b6\u0010©\u0001\u001a\u0005\bØ\u0001\u0010YR(\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u0001078\u0006¢\u0006\u000f\n\u0005\b8\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010\u008d\u0001R\u001b\u00109\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b9\u0010©\u0001\u001a\u0005\bÛ\u0001\u0010YR\u001b\u0010:\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b:\u0010©\u0001\u001a\u0005\bÜ\u0001\u0010YR\u001c\u0010<\u001a\u0004\u0018\u00010;8\u0006¢\u0006\u000f\n\u0005\b<\u0010Ý\u0001\u001a\u0006\bÞ\u0001\u0010\u0091\u0001R\u0019\u0010=\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b=\u0010\u00ad\u0001\u001a\u0005\bß\u0001\u0010]R\u0018\u0010>\u001a\u00020\u00068\u0006¢\u0006\r\n\u0005\b>\u0010\u00ad\u0001\u001a\u0004\b>\u0010]R\u0018\u0010?\u001a\u00020\u00068\u0006¢\u0006\r\n\u0005\b?\u0010\u00ad\u0001\u001a\u0004\b?\u0010]R\"\u0010B\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010@8\u0006¢\u0006\u000f\n\u0005\bB\u0010à\u0001\u001a\u0006\bá\u0001\u0010\u0096\u0001R\u001c\u0010C\u001a\u0004\u0018\u00010A8\u0006¢\u0006\u000f\n\u0005\bC\u0010â\u0001\u001a\u0006\bã\u0001\u0010\u0098\u0001R\u001a\u0010E\u001a\u00020D8\u0006¢\u0006\u000f\n\u0005\bE\u0010ä\u0001\u001a\u0006\bå\u0001\u0010\u009a\u0001R\u001c\u0010G\u001a\u0004\u0018\u00010F8\u0006¢\u0006\u000f\n\u0005\bG\u0010æ\u0001\u001a\u0006\bç\u0001\u0010\u009c\u0001R\u001b\u0010H\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\bH\u0010©\u0001\u001a\u0005\bè\u0001\u0010YR\u0019\u0010I\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\bI\u0010\u00ad\u0001\u001a\u0005\bé\u0001\u0010]R\u0019\u0010J\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\bJ\u0010\u00ad\u0001\u001a\u0005\bê\u0001\u0010]R\u0019\u0010K\u001a\u00020\t8\u0006¢\u0006\u000e\n\u0005\bK\u0010®\u0001\u001a\u0005\bë\u0001\u0010WR\u0018\u0010L\u001a\u00020\u00068\u0006¢\u0006\r\n\u0005\bL\u0010\u00ad\u0001\u001a\u0004\bL\u0010]R\u0018\u0010M\u001a\u00020\u00068\u0006¢\u0006\r\n\u0005\bM\u0010\u00ad\u0001\u001a\u0004\bM\u0010]R\u001a\u0010O\u001a\u00020N8\u0006¢\u0006\u000f\n\u0005\bO\u0010ì\u0001\u001a\u0006\bí\u0001\u0010¤\u0001R\u001a\u0010P\u001a\u00020N8\u0006¢\u0006\u000f\n\u0005\bP\u0010ì\u0001\u001a\u0006\bî\u0001\u0010¤\u0001R\u001b\u0010ï\u0001\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0006\bï\u0001\u0010\u00ad\u0001\u001a\u0005\bð\u0001\u0010]R\u001b\u0010ñ\u0001\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0006\bñ\u0001\u0010\u00ad\u0001\u001a\u0005\bò\u0001\u0010]R\u0013\u0010ô\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\bó\u0001\u0010]R\u0013\u0010ö\u0001\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\bõ\u0001\u0010WR\u0013\u0010÷\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\b÷\u0001\u0010]R\u0017\u0010û\u0001\u001a\u0005\u0018\u00010ø\u00018F¢\u0006\b\u001a\u0006\bù\u0001\u0010ú\u0001R\u0013\u0010ý\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\bü\u0001\u0010]R\u0013\u0010ÿ\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\bþ\u0001\u0010]¨\u0006\u0080\u0002"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerState;", "", "", "readId", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerControllerState;", "player", "", "isLoadingContent", "isLoadingHtmlContent", "", "htmlLoadingProgress", "Lio/elevenlabs/highlighter/HighlighterData;", "highlighterData", "Lio/elevenlabs/domain/model/BinarySearchList;", "wordOffsets", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "canUpgrade", "isAppInForeground", "isSeeking", "isSeekOperationInProgress", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/ContentState;", "contentState", "fullScreenImageSrc", "navigateBack", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerToastMessage;", "toastMessage", "navigateToPurchaseHours", "purchaseHoursContext", "navigateToVoiceDesignPaywall", "navigateToPaywall", "canNavigateToLowCreditsAgain", "Ljava/util/Date;", "sleepTimerDate", "Lio/elevenlabs/domain/model/Voice;", "voiceUsed", "Lio/elevenlabs/domain/Configuration;", "configuration", "Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;", "playerConfig", "showSpeedPickerDialog", "showContentsDialog", "showTooLargeForOfflineToast", "chapterDownloadErrorMessage", "showCustomizeDialog", "navigateToPlayerPreferences", "showExportDialog", "showRenameDialog", "showRatingDialog", "showSleepTimerDialog", "showShareOptionsSheet", "navigateToGenFMLoaderWithReadId", "currentDate", "showBookmarksDialog", "navigateToShareDetails", "clickedBookmarkId", "Lsn/k;", "navigateToBookmarkShareDetails", "recentlyAddedBookmarkId", "editBookmarkId", "Lio/elevenlabs/domain/model/PlayerDisplayMode;", "displayMode", "showQueue", "isScreenRecordingEnabled", "isVoiceAgentFloatingButtonEnabled", "", "Lio/elevenlabs/domain/model/Pronunciation;", "pronunciations", "showPronunciationExistsDialog", "Lio/elevenlabs/domain/model/PronunciationPreviewState;", "pronunciationPreviewState", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/UndoSeekState;", "undoSeek", "currentSoundscapeId", "shouldShowPagerTeaser", "controlsVisibleByUser", "activeControlsInteractionCount", "isVoiceChangerEnabled", "isSearchInAudioEnabled", "Lio/elevenlabs/domain/model/SkipDuration;", "inAppForwardSeekDuration", "inAppBackwardSeekDuration", "<init>", "(Ljava/lang/String;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerControllerState;ZZILio/elevenlabs/highlighter/HighlighterData;Lio/elevenlabs/domain/model/BinarySearchList;Ljava/lang/String;ZZZZLio/elevenlabs/readerapp/ui/screens/authenticated/player/ContentState;Ljava/lang/String;ZLio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerToastMessage;ZLjava/lang/String;ZZZLjava/util/Date;Lio/elevenlabs/domain/model/Voice;Lio/elevenlabs/domain/Configuration;Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;ZZZLjava/lang/String;ZZZZZZZLjava/lang/String;Ljava/util/Date;ZLjava/lang/String;Ljava/lang/String;Lsn/k;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/PlayerDisplayMode;ZZZLjava/util/List;Lio/elevenlabs/domain/model/Pronunciation;Lio/elevenlabs/domain/model/PronunciationPreviewState;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/UndoSeekState;Ljava/lang/String;ZZIZZLio/elevenlabs/domain/model/SkipDuration;Lio/elevenlabs/domain/model/SkipDuration;)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerControllerState;", "component3", "()Z", "component4", "component5", "component6", "()Lio/elevenlabs/highlighter/HighlighterData;", "component7", "()Lio/elevenlabs/domain/model/BinarySearchList;", "component8", "component9", "component10", "component11", "component12", "component13", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/player/ContentState;", "component14", "component15", "component16", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerToastMessage;", "component17", "component18", "component19", "component20", "component21", "component22", "()Ljava/util/Date;", "component23", "()Lio/elevenlabs/domain/model/Voice;", "component24", "()Lio/elevenlabs/domain/Configuration;", "component25", "()Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "()Lsn/k;", "component43", "component44", "component45", "()Lio/elevenlabs/domain/model/PlayerDisplayMode;", "component46", "component47", "component48", "component49", "()Ljava/util/List;", "component50", "()Lio/elevenlabs/domain/model/Pronunciation;", "component51", "()Lio/elevenlabs/domain/model/PronunciationPreviewState;", "component52", "()Lio/elevenlabs/readerapp/ui/screens/authenticated/player/UndoSeekState;", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "()Lio/elevenlabs/domain/model/SkipDuration;", "component60", "copy", "(Ljava/lang/String;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerControllerState;ZZILio/elevenlabs/highlighter/HighlighterData;Lio/elevenlabs/domain/model/BinarySearchList;Ljava/lang/String;ZZZZLio/elevenlabs/readerapp/ui/screens/authenticated/player/ContentState;Ljava/lang/String;ZLio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerToastMessage;ZLjava/lang/String;ZZZLjava/util/Date;Lio/elevenlabs/domain/model/Voice;Lio/elevenlabs/domain/Configuration;Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;ZZZLjava/lang/String;ZZZZZZZLjava/lang/String;Ljava/util/Date;ZLjava/lang/String;Ljava/lang/String;Lsn/k;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/PlayerDisplayMode;ZZZLjava/util/List;Lio/elevenlabs/domain/model/Pronunciation;Lio/elevenlabs/domain/model/PronunciationPreviewState;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/UndoSeekState;Ljava/lang/String;ZZIZZLio/elevenlabs/domain/model/SkipDuration;Lio/elevenlabs/domain/model/SkipDuration;)Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerState;", "toString", "Ljava/lang/String;", "getReadId", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerControllerState;", "getPlayer", "Z", TokenNames.I, "getHtmlLoadingProgress", "Lio/elevenlabs/highlighter/HighlighterData;", "getHighlighterData", "Lio/elevenlabs/domain/model/BinarySearchList;", "getWordOffsets", "getError", "getCanUpgrade", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/ContentState;", "getContentState", "getFullScreenImageSrc", "getNavigateBack", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerToastMessage;", "getToastMessage", "getNavigateToPurchaseHours", "getPurchaseHoursContext", "getNavigateToVoiceDesignPaywall", "getNavigateToPaywall", "getCanNavigateToLowCreditsAgain", "Ljava/util/Date;", "getSleepTimerDate", "Lio/elevenlabs/domain/model/Voice;", "getVoiceUsed", "Lio/elevenlabs/domain/Configuration;", "getConfiguration", "Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;", "getPlayerConfig", "getShowSpeedPickerDialog", "getShowContentsDialog", "getShowTooLargeForOfflineToast", "getChapterDownloadErrorMessage", "getShowCustomizeDialog", "getNavigateToPlayerPreferences", "getShowExportDialog", "getShowRenameDialog", "getShowRatingDialog", "getShowSleepTimerDialog", "getShowShareOptionsSheet", "getNavigateToGenFMLoaderWithReadId", "getCurrentDate", "getShowBookmarksDialog", "getNavigateToShareDetails", "getClickedBookmarkId", "Lsn/k;", "getNavigateToBookmarkShareDetails", "getRecentlyAddedBookmarkId", "getEditBookmarkId", "Lio/elevenlabs/domain/model/PlayerDisplayMode;", "getDisplayMode", "getShowQueue", "Ljava/util/List;", "getPronunciations", "Lio/elevenlabs/domain/model/Pronunciation;", "getShowPronunciationExistsDialog", "Lio/elevenlabs/domain/model/PronunciationPreviewState;", "getPronunciationPreviewState", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/UndoSeekState;", "getUndoSeek", "getCurrentSoundscapeId", "getShouldShowPagerTeaser", "getControlsVisibleByUser", "getActiveControlsInteractionCount", "Lio/elevenlabs/domain/model/SkipDuration;", "getInAppForwardSeekDuration", "getInAppBackwardSeekDuration", "showShareButton", "getShowShareButton", "showContentsButton", "getShowContentsButton", "getShowSearchButton", "showSearchButton", "getCurrentChapterIndex", "currentChapterIndex", "isSoundscapeEnabled", "", "getSleepTimerRemainingSeconds", "()Ljava/lang/Long;", "sleepTimerRemainingSeconds", "getCanAutoHideControls", "canAutoHideControls", "getShouldShowControls", "shouldShowControls", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class PlayerState {
    public static final int $stable = 8;
    private final int activeControlsInteractionCount;
    private final boolean canNavigateToLowCreditsAgain;
    private final boolean canUpgrade;
    private final String chapterDownloadErrorMessage;
    private final String clickedBookmarkId;
    private final Configuration configuration;
    private final ContentState contentState;
    private final boolean controlsVisibleByUser;
    private final Date currentDate;
    private final String currentSoundscapeId;
    private final PlayerDisplayMode displayMode;
    private final String editBookmarkId;
    private final String error;
    private final String fullScreenImageSrc;
    private final HighlighterData highlighterData;
    private final int htmlLoadingProgress;
    private final SkipDuration inAppBackwardSeekDuration;
    private final SkipDuration inAppForwardSeekDuration;
    private final boolean isAppInForeground;
    private final boolean isLoadingContent;
    private final boolean isLoadingHtmlContent;
    private final boolean isScreenRecordingEnabled;
    private final boolean isSearchInAudioEnabled;
    private final boolean isSeekOperationInProgress;
    private final boolean isSeeking;
    private final boolean isVoiceAgentFloatingButtonEnabled;
    private final boolean isVoiceChangerEnabled;
    private final boolean navigateBack;
    private final sn.k navigateToBookmarkShareDetails;
    private final String navigateToGenFMLoaderWithReadId;
    private final boolean navigateToPaywall;
    private final boolean navigateToPlayerPreferences;
    private final boolean navigateToPurchaseHours;
    private final String navigateToShareDetails;
    private final boolean navigateToVoiceDesignPaywall;
    private final PlayerControllerState player;
    private final UserConfig.PlayerConfig playerConfig;
    private final PronunciationPreviewState pronunciationPreviewState;
    private final List<Pronunciation> pronunciations;
    private final String purchaseHoursContext;
    private final String readId;
    private final String recentlyAddedBookmarkId;
    private final boolean shouldShowPagerTeaser;
    private final boolean showBookmarksDialog;
    private final boolean showContentsButton;
    private final boolean showContentsDialog;
    private final boolean showCustomizeDialog;
    private final boolean showExportDialog;
    private final Pronunciation showPronunciationExistsDialog;
    private final boolean showQueue;
    private final boolean showRatingDialog;
    private final boolean showRenameDialog;
    private final boolean showShareButton;
    private final boolean showShareOptionsSheet;
    private final boolean showSleepTimerDialog;
    private final boolean showSpeedPickerDialog;
    private final boolean showTooLargeForOfflineToast;
    private final Date sleepTimerDate;
    private final PlayerToastMessage toastMessage;
    private final UndoSeekState undoSeek;
    private final Voice voiceUsed;
    private final BinarySearchList wordOffsets;

    public /* synthetic */ PlayerState(String str, PlayerControllerState playerControllerState, boolean z6, boolean z10, int i10, HighlighterData highlighterData, BinarySearchList binarySearchList, String str2, boolean z11, boolean z12, boolean z13, boolean z14, ContentState contentState, String str3, boolean z15, PlayerToastMessage playerToastMessage, boolean z16, String str4, boolean z17, boolean z18, boolean z19, Date date, Voice voice, Configuration configuration, UserConfig.PlayerConfig playerConfig, boolean z20, boolean z21, boolean z22, String str5, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, String str6, Date date2, boolean z30, String str7, String str8, sn.k kVar, String str9, String str10, PlayerDisplayMode playerDisplayMode, boolean z31, boolean z32, boolean z33, List list, Pronunciation pronunciation, PronunciationPreviewState pronunciationPreviewState, UndoSeekState undoSeekState, String str11, boolean z34, boolean z35, int i11, boolean z36, boolean z37, SkipDuration skipDuration, SkipDuration skipDuration2, int i12, int i13, kotlin.jvm.internal.f fVar) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? new PlayerControllerState(null, null, false, null, 15, null) : playerControllerState, (i12 & 4) != 0 ? false : z6, (i12 & 8) != 0 ? false : z10, (i12 & 16) != 0 ? 0 : i10, (i12 & 32) != 0 ? new HighlighterData(null, false, null, null, 15, null) : highlighterData, (i12 & 64) != 0 ? null : binarySearchList, (i12 & 128) != 0 ? "" : str2, (i12 & RpcError.MAX_MESSAGE_BYTES) != 0 ? false : z11, (i12 & 512) != 0 ? true : z12, (i12 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? false : z13, (i12 & 2048) != 0 ? false : z14, (i12 & 4096) != 0 ? null : contentState, (i12 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : str3, (i12 & 16384) != 0 ? false : z15, (i12 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? null : playerToastMessage, (i12 & 65536) != 0 ? false : z16, (i12 & 131072) != 0 ? null : str4, (i12 & 262144) != 0 ? false : z17, (i12 & 524288) != 0 ? false : z18, (i12 & 1048576) != 0 ? true : z19, (i12 & 2097152) != 0 ? null : date, (i12 & 4194304) != 0 ? null : voice, (i12 & 8388608) != 0 ? null : configuration, (i12 & 16777216) != 0 ? null : playerConfig, (i12 & 33554432) != 0 ? false : z20, (i12 & 67108864) != 0 ? false : z21, (i12 & 134217728) != 0 ? false : z22, (i12 & 268435456) != 0 ? null : str5, (i12 & 536870912) != 0 ? false : z23, (i12 & 1073741824) != 0 ? false : z24, (i12 & Integer.MIN_VALUE) != 0 ? false : z25, (i13 & 1) != 0 ? false : z26, (i13 & 2) != 0 ? false : z27, (i13 & 4) != 0 ? false : z28, (i13 & 8) != 0 ? false : z29, (i13 & 16) != 0 ? null : str6, date2, (i13 & 64) != 0 ? false : z30, (i13 & 128) != 0 ? null : str7, (i13 & RpcError.MAX_MESSAGE_BYTES) != 0 ? null : str8, (i13 & 512) != 0 ? null : kVar, (i13 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : str9, (i13 & 2048) != 0 ? null : str10, (i13 & 4096) != 0 ? null : playerDisplayMode, (i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? false : z31, (i13 & 16384) != 0 ? false : z32, (i13 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? false : z33, (i13 & 65536) != 0 ? null : list, (i13 & 131072) != 0 ? null : pronunciation, (i13 & 262144) != 0 ? PronunciationPreviewState.Stopped : pronunciationPreviewState, (i13 & 524288) != 0 ? null : undoSeekState, (i13 & 1048576) != 0 ? null : str11, (2097152 & i13) != 0 ? false : z34, (4194304 & i13) != 0 ? true : z35, (8388608 & i13) != 0 ? 0 : i11, (16777216 & i13) != 0 ? false : z36, (33554432 & i13) != 0 ? false : z37, (67108864 & i13) != 0 ? SkipDuration.SECONDS_30 : skipDuration, (134217728 & i13) != 0 ? SkipDuration.SECONDS_15 : skipDuration2);
    }

    public static /* synthetic */ PlayerState copy$default(PlayerState playerState, String str, PlayerControllerState playerControllerState, boolean z6, boolean z10, int i10, HighlighterData highlighterData, BinarySearchList binarySearchList, String str2, boolean z11, boolean z12, boolean z13, boolean z14, ContentState contentState, String str3, boolean z15, PlayerToastMessage playerToastMessage, boolean z16, String str4, boolean z17, boolean z18, boolean z19, Date date, Voice voice, Configuration configuration, UserConfig.PlayerConfig playerConfig, boolean z20, boolean z21, boolean z22, String str5, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, String str6, Date date2, boolean z30, String str7, String str8, sn.k kVar, String str9, String str10, PlayerDisplayMode playerDisplayMode, boolean z31, boolean z32, boolean z33, List list, Pronunciation pronunciation, PronunciationPreviewState pronunciationPreviewState, UndoSeekState undoSeekState, String str11, boolean z34, boolean z35, int i11, boolean z36, boolean z37, SkipDuration skipDuration, SkipDuration skipDuration2, int i12, int i13, Object obj) {
        return playerState.copy((i12 & 1) != 0 ? playerState.readId : str, (i12 & 2) != 0 ? playerState.player : playerControllerState, (i12 & 4) != 0 ? playerState.isLoadingContent : z6, (i12 & 8) != 0 ? playerState.isLoadingHtmlContent : z10, (i12 & 16) != 0 ? playerState.htmlLoadingProgress : i10, (i12 & 32) != 0 ? playerState.highlighterData : highlighterData, (i12 & 64) != 0 ? playerState.wordOffsets : binarySearchList, (i12 & 128) != 0 ? playerState.error : str2, (i12 & RpcError.MAX_MESSAGE_BYTES) != 0 ? playerState.canUpgrade : z11, (i12 & 512) != 0 ? playerState.isAppInForeground : z12, (i12 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? playerState.isSeeking : z13, (i12 & 2048) != 0 ? playerState.isSeekOperationInProgress : z14, (i12 & 4096) != 0 ? playerState.contentState : contentState, (i12 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? playerState.fullScreenImageSrc : str3, (i12 & 16384) != 0 ? playerState.navigateBack : z15, (i12 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? playerState.toastMessage : playerToastMessage, (i12 & 65536) != 0 ? playerState.navigateToPurchaseHours : z16, (i12 & 131072) != 0 ? playerState.purchaseHoursContext : str4, (i12 & 262144) != 0 ? playerState.navigateToVoiceDesignPaywall : z17, (i12 & 524288) != 0 ? playerState.navigateToPaywall : z18, (i12 & 1048576) != 0 ? playerState.canNavigateToLowCreditsAgain : z19, (i12 & 2097152) != 0 ? playerState.sleepTimerDate : date, (i12 & 4194304) != 0 ? playerState.voiceUsed : voice, (i12 & 8388608) != 0 ? playerState.configuration : configuration, (i12 & 16777216) != 0 ? playerState.playerConfig : playerConfig, (i12 & 33554432) != 0 ? playerState.showSpeedPickerDialog : z20, (i12 & 67108864) != 0 ? playerState.showContentsDialog : z21, (i12 & 134217728) != 0 ? playerState.showTooLargeForOfflineToast : z22, (i12 & 268435456) != 0 ? playerState.chapterDownloadErrorMessage : str5, (i12 & 536870912) != 0 ? playerState.showCustomizeDialog : z23, (i12 & 1073741824) != 0 ? playerState.navigateToPlayerPreferences : z24, (i12 & Integer.MIN_VALUE) != 0 ? playerState.showExportDialog : z25, (i13 & 1) != 0 ? playerState.showRenameDialog : z26, (i13 & 2) != 0 ? playerState.showRatingDialog : z27, (i13 & 4) != 0 ? playerState.showSleepTimerDialog : z28, (i13 & 8) != 0 ? playerState.showShareOptionsSheet : z29, (i13 & 16) != 0 ? playerState.navigateToGenFMLoaderWithReadId : str6, (i13 & 32) != 0 ? playerState.currentDate : date2, (i13 & 64) != 0 ? playerState.showBookmarksDialog : z30, (i13 & 128) != 0 ? playerState.navigateToShareDetails : str7, (i13 & RpcError.MAX_MESSAGE_BYTES) != 0 ? playerState.clickedBookmarkId : str8, (i13 & 512) != 0 ? playerState.navigateToBookmarkShareDetails : kVar, (i13 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? playerState.recentlyAddedBookmarkId : str9, (i13 & 2048) != 0 ? playerState.editBookmarkId : str10, (i13 & 4096) != 0 ? playerState.displayMode : playerDisplayMode, (i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? playerState.showQueue : z31, (i13 & 16384) != 0 ? playerState.isScreenRecordingEnabled : z32, (i13 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? playerState.isVoiceAgentFloatingButtonEnabled : z33, (i13 & 65536) != 0 ? playerState.pronunciations : list, (i13 & 131072) != 0 ? playerState.showPronunciationExistsDialog : pronunciation, (i13 & 262144) != 0 ? playerState.pronunciationPreviewState : pronunciationPreviewState, (i13 & 524288) != 0 ? playerState.undoSeek : undoSeekState, (i13 & 1048576) != 0 ? playerState.currentSoundscapeId : str11, (i13 & 2097152) != 0 ? playerState.shouldShowPagerTeaser : z34, (i13 & 4194304) != 0 ? playerState.controlsVisibleByUser : z35, (i13 & 8388608) != 0 ? playerState.activeControlsInteractionCount : i11, (i13 & 16777216) != 0 ? playerState.isVoiceChangerEnabled : z36, (i13 & 33554432) != 0 ? playerState.isSearchInAudioEnabled : z37, (i13 & 67108864) != 0 ? playerState.inAppForwardSeekDuration : skipDuration, (i13 & 134217728) != 0 ? playerState.inAppBackwardSeekDuration : skipDuration2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReadId() {
        return this.readId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsAppInForeground() {
        return this.isAppInForeground;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsSeeking() {
        return this.isSeeking;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsSeekOperationInProgress() {
        return this.isSeekOperationInProgress;
    }

    /* renamed from: component13, reason: from getter */
    public final ContentState getContentState() {
        return this.contentState;
    }

    /* renamed from: component14, reason: from getter */
    public final String getFullScreenImageSrc() {
        return this.fullScreenImageSrc;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getNavigateBack() {
        return this.navigateBack;
    }

    /* renamed from: component16, reason: from getter */
    public final PlayerToastMessage getToastMessage() {
        return this.toastMessage;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getNavigateToPurchaseHours() {
        return this.navigateToPurchaseHours;
    }

    /* renamed from: component18, reason: from getter */
    public final String getPurchaseHoursContext() {
        return this.purchaseHoursContext;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getNavigateToVoiceDesignPaywall() {
        return this.navigateToVoiceDesignPaywall;
    }

    /* renamed from: component2, reason: from getter */
    public final PlayerControllerState getPlayer() {
        return this.player;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getNavigateToPaywall() {
        return this.navigateToPaywall;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getCanNavigateToLowCreditsAgain() {
        return this.canNavigateToLowCreditsAgain;
    }

    /* renamed from: component22, reason: from getter */
    public final Date getSleepTimerDate() {
        return this.sleepTimerDate;
    }

    /* renamed from: component23, reason: from getter */
    public final Voice getVoiceUsed() {
        return this.voiceUsed;
    }

    /* renamed from: component24, reason: from getter */
    public final Configuration getConfiguration() {
        return this.configuration;
    }

    /* renamed from: component25, reason: from getter */
    public final UserConfig.PlayerConfig getPlayerConfig() {
        return this.playerConfig;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getShowSpeedPickerDialog() {
        return this.showSpeedPickerDialog;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getShowContentsDialog() {
        return this.showContentsDialog;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getShowTooLargeForOfflineToast() {
        return this.showTooLargeForOfflineToast;
    }

    /* renamed from: component29, reason: from getter */
    public final String getChapterDownloadErrorMessage() {
        return this.chapterDownloadErrorMessage;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoadingContent() {
        return this.isLoadingContent;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getShowCustomizeDialog() {
        return this.showCustomizeDialog;
    }

    /* renamed from: component31, reason: from getter */
    public final boolean getNavigateToPlayerPreferences() {
        return this.navigateToPlayerPreferences;
    }

    /* renamed from: component32, reason: from getter */
    public final boolean getShowExportDialog() {
        return this.showExportDialog;
    }

    /* renamed from: component33, reason: from getter */
    public final boolean getShowRenameDialog() {
        return this.showRenameDialog;
    }

    /* renamed from: component34, reason: from getter */
    public final boolean getShowRatingDialog() {
        return this.showRatingDialog;
    }

    /* renamed from: component35, reason: from getter */
    public final boolean getShowSleepTimerDialog() {
        return this.showSleepTimerDialog;
    }

    /* renamed from: component36, reason: from getter */
    public final boolean getShowShareOptionsSheet() {
        return this.showShareOptionsSheet;
    }

    /* renamed from: component37, reason: from getter */
    public final String getNavigateToGenFMLoaderWithReadId() {
        return this.navigateToGenFMLoaderWithReadId;
    }

    /* renamed from: component38, reason: from getter */
    public final Date getCurrentDate() {
        return this.currentDate;
    }

    /* renamed from: component39, reason: from getter */
    public final boolean getShowBookmarksDialog() {
        return this.showBookmarksDialog;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoadingHtmlContent() {
        return this.isLoadingHtmlContent;
    }

    /* renamed from: component40, reason: from getter */
    public final String getNavigateToShareDetails() {
        return this.navigateToShareDetails;
    }

    /* renamed from: component41, reason: from getter */
    public final String getClickedBookmarkId() {
        return this.clickedBookmarkId;
    }

    /* renamed from: component42, reason: from getter */
    public final sn.k getNavigateToBookmarkShareDetails() {
        return this.navigateToBookmarkShareDetails;
    }

    /* renamed from: component43, reason: from getter */
    public final String getRecentlyAddedBookmarkId() {
        return this.recentlyAddedBookmarkId;
    }

    /* renamed from: component44, reason: from getter */
    public final String getEditBookmarkId() {
        return this.editBookmarkId;
    }

    /* renamed from: component45, reason: from getter */
    public final PlayerDisplayMode getDisplayMode() {
        return this.displayMode;
    }

    /* renamed from: component46, reason: from getter */
    public final boolean getShowQueue() {
        return this.showQueue;
    }

    /* renamed from: component47, reason: from getter */
    public final boolean getIsScreenRecordingEnabled() {
        return this.isScreenRecordingEnabled;
    }

    /* renamed from: component48, reason: from getter */
    public final boolean getIsVoiceAgentFloatingButtonEnabled() {
        return this.isVoiceAgentFloatingButtonEnabled;
    }

    public final List<Pronunciation> component49() {
        return this.pronunciations;
    }

    /* renamed from: component5, reason: from getter */
    public final int getHtmlLoadingProgress() {
        return this.htmlLoadingProgress;
    }

    /* renamed from: component50, reason: from getter */
    public final Pronunciation getShowPronunciationExistsDialog() {
        return this.showPronunciationExistsDialog;
    }

    /* renamed from: component51, reason: from getter */
    public final PronunciationPreviewState getPronunciationPreviewState() {
        return this.pronunciationPreviewState;
    }

    /* renamed from: component52, reason: from getter */
    public final UndoSeekState getUndoSeek() {
        return this.undoSeek;
    }

    /* renamed from: component53, reason: from getter */
    public final String getCurrentSoundscapeId() {
        return this.currentSoundscapeId;
    }

    /* renamed from: component54, reason: from getter */
    public final boolean getShouldShowPagerTeaser() {
        return this.shouldShowPagerTeaser;
    }

    /* renamed from: component55, reason: from getter */
    public final boolean getControlsVisibleByUser() {
        return this.controlsVisibleByUser;
    }

    /* renamed from: component56, reason: from getter */
    public final int getActiveControlsInteractionCount() {
        return this.activeControlsInteractionCount;
    }

    /* renamed from: component57, reason: from getter */
    public final boolean getIsVoiceChangerEnabled() {
        return this.isVoiceChangerEnabled;
    }

    /* renamed from: component58, reason: from getter */
    public final boolean getIsSearchInAudioEnabled() {
        return this.isSearchInAudioEnabled;
    }

    /* renamed from: component59, reason: from getter */
    public final SkipDuration getInAppForwardSeekDuration() {
        return this.inAppForwardSeekDuration;
    }

    /* renamed from: component6, reason: from getter */
    public final HighlighterData getHighlighterData() {
        return this.highlighterData;
    }

    /* renamed from: component60, reason: from getter */
    public final SkipDuration getInAppBackwardSeekDuration() {
        return this.inAppBackwardSeekDuration;
    }

    /* renamed from: component7, reason: from getter */
    public final BinarySearchList getWordOffsets() {
        return this.wordOffsets;
    }

    /* renamed from: component8, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getCanUpgrade() {
        return this.canUpgrade;
    }

    public final PlayerState copy(String readId, PlayerControllerState player, boolean isLoadingContent, boolean isLoadingHtmlContent, int htmlLoadingProgress, HighlighterData highlighterData, BinarySearchList wordOffsets, String r69, boolean canUpgrade, boolean isAppInForeground, boolean isSeeking, boolean isSeekOperationInProgress, ContentState contentState, String fullScreenImageSrc, boolean navigateBack, PlayerToastMessage toastMessage, boolean navigateToPurchaseHours, String purchaseHoursContext, boolean navigateToVoiceDesignPaywall, boolean navigateToPaywall, boolean canNavigateToLowCreditsAgain, Date sleepTimerDate, Voice voiceUsed, Configuration configuration, UserConfig.PlayerConfig playerConfig, boolean showSpeedPickerDialog, boolean showContentsDialog, boolean showTooLargeForOfflineToast, String chapterDownloadErrorMessage, boolean showCustomizeDialog, boolean navigateToPlayerPreferences, boolean showExportDialog, boolean showRenameDialog, boolean showRatingDialog, boolean showSleepTimerDialog, boolean showShareOptionsSheet, String navigateToGenFMLoaderWithReadId, Date currentDate, boolean showBookmarksDialog, String navigateToShareDetails, String clickedBookmarkId, sn.k navigateToBookmarkShareDetails, String recentlyAddedBookmarkId, String editBookmarkId, PlayerDisplayMode displayMode, boolean showQueue, boolean isScreenRecordingEnabled, boolean isVoiceAgentFloatingButtonEnabled, List<Pronunciation> pronunciations, Pronunciation showPronunciationExistsDialog, PronunciationPreviewState pronunciationPreviewState, UndoSeekState undoSeek, String currentSoundscapeId, boolean shouldShowPagerTeaser, boolean controlsVisibleByUser, int activeControlsInteractionCount, boolean isVoiceChangerEnabled, boolean isSearchInAudioEnabled, SkipDuration inAppForwardSeekDuration, SkipDuration inAppBackwardSeekDuration) {
        player.getClass();
        highlighterData.getClass();
        r69.getClass();
        currentDate.getClass();
        pronunciationPreviewState.getClass();
        inAppForwardSeekDuration.getClass();
        inAppBackwardSeekDuration.getClass();
        return new PlayerState(readId, player, isLoadingContent, isLoadingHtmlContent, htmlLoadingProgress, highlighterData, wordOffsets, r69, canUpgrade, isAppInForeground, isSeeking, isSeekOperationInProgress, contentState, fullScreenImageSrc, navigateBack, toastMessage, navigateToPurchaseHours, purchaseHoursContext, navigateToVoiceDesignPaywall, navigateToPaywall, canNavigateToLowCreditsAgain, sleepTimerDate, voiceUsed, configuration, playerConfig, showSpeedPickerDialog, showContentsDialog, showTooLargeForOfflineToast, chapterDownloadErrorMessage, showCustomizeDialog, navigateToPlayerPreferences, showExportDialog, showRenameDialog, showRatingDialog, showSleepTimerDialog, showShareOptionsSheet, navigateToGenFMLoaderWithReadId, currentDate, showBookmarksDialog, navigateToShareDetails, clickedBookmarkId, navigateToBookmarkShareDetails, recentlyAddedBookmarkId, editBookmarkId, displayMode, showQueue, isScreenRecordingEnabled, isVoiceAgentFloatingButtonEnabled, pronunciations, showPronunciationExistsDialog, pronunciationPreviewState, undoSeek, currentSoundscapeId, shouldShowPagerTeaser, controlsVisibleByUser, activeControlsInteractionCount, isVoiceChangerEnabled, isSearchInAudioEnabled, inAppForwardSeekDuration, inAppBackwardSeekDuration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return false;
    }

    public final int getActiveControlsInteractionCount() {
        return this.activeControlsInteractionCount;
    }

    public final boolean getCanAutoHideControls() {
        if (this.displayMode == PlayerDisplayMode.Text && !this.highlighterData.getSlots().isEmpty() && !this.isSeeking && !this.isLoadingContent && !this.isLoadingHtmlContent && wq.n.m0(this.error) && !this.showQueue && this.activeControlsInteractionCount == 0) {
            return true;
        }
        return false;
    }

    public final boolean getCanNavigateToLowCreditsAgain() {
        return this.canNavigateToLowCreditsAgain;
    }

    public final boolean getCanUpgrade() {
        return this.canUpgrade;
    }

    public final String getChapterDownloadErrorMessage() {
        return this.chapterDownloadErrorMessage;
    }

    public final String getClickedBookmarkId() {
        return this.clickedBookmarkId;
    }

    public final Configuration getConfiguration() {
        return this.configuration;
    }

    public final ContentState getContentState() {
        return this.contentState;
    }

    public final boolean getControlsVisibleByUser() {
        return this.controlsVisibleByUser;
    }

    public final int getCurrentChapterIndex() {
        ContentState contentState = this.contentState;
        if (contentState != null) {
            return PlayerStateKt.calculateCurrentChapterIndex(contentState);
        }
        return 0;
    }

    public final Date getCurrentDate() {
        return this.currentDate;
    }

    public final String getCurrentSoundscapeId() {
        return this.currentSoundscapeId;
    }

    public final PlayerDisplayMode getDisplayMode() {
        return this.displayMode;
    }

    public final String getEditBookmarkId() {
        return this.editBookmarkId;
    }

    public final String getError() {
        return this.error;
    }

    public final String getFullScreenImageSrc() {
        return this.fullScreenImageSrc;
    }

    public final HighlighterData getHighlighterData() {
        return this.highlighterData;
    }

    public final int getHtmlLoadingProgress() {
        return this.htmlLoadingProgress;
    }

    public final SkipDuration getInAppBackwardSeekDuration() {
        return this.inAppBackwardSeekDuration;
    }

    public final SkipDuration getInAppForwardSeekDuration() {
        return this.inAppForwardSeekDuration;
    }

    public final boolean getNavigateBack() {
        return this.navigateBack;
    }

    public final sn.k getNavigateToBookmarkShareDetails() {
        return this.navigateToBookmarkShareDetails;
    }

    public final String getNavigateToGenFMLoaderWithReadId() {
        return this.navigateToGenFMLoaderWithReadId;
    }

    public final boolean getNavigateToPaywall() {
        return this.navigateToPaywall;
    }

    public final boolean getNavigateToPlayerPreferences() {
        return this.navigateToPlayerPreferences;
    }

    public final boolean getNavigateToPurchaseHours() {
        return this.navigateToPurchaseHours;
    }

    public final String getNavigateToShareDetails() {
        return this.navigateToShareDetails;
    }

    public final boolean getNavigateToVoiceDesignPaywall() {
        return this.navigateToVoiceDesignPaywall;
    }

    public final PlayerControllerState getPlayer() {
        return this.player;
    }

    public final UserConfig.PlayerConfig getPlayerConfig() {
        return this.playerConfig;
    }

    public final PronunciationPreviewState getPronunciationPreviewState() {
        return this.pronunciationPreviewState;
    }

    public final List<Pronunciation> getPronunciations() {
        return this.pronunciations;
    }

    public final String getPurchaseHoursContext() {
        return this.purchaseHoursContext;
    }

    public final String getReadId() {
        return this.readId;
    }

    public final String getRecentlyAddedBookmarkId() {
        return this.recentlyAddedBookmarkId;
    }

    public final boolean getShouldShowControls() {
        if (!this.controlsVisibleByUser && getCanAutoHideControls()) {
            return false;
        }
        return true;
    }

    public final boolean getShouldShowPagerTeaser() {
        return this.shouldShowPagerTeaser;
    }

    public final boolean getShowBookmarksDialog() {
        return this.showBookmarksDialog;
    }

    public final boolean getShowContentsButton() {
        return this.showContentsButton;
    }

    public final boolean getShowContentsDialog() {
        return this.showContentsDialog;
    }

    public final boolean getShowCustomizeDialog() {
        return this.showCustomizeDialog;
    }

    public final boolean getShowExportDialog() {
        return this.showExportDialog;
    }

    public final Pronunciation getShowPronunciationExistsDialog() {
        return this.showPronunciationExistsDialog;
    }

    public final boolean getShowQueue() {
        return this.showQueue;
    }

    public final boolean getShowRatingDialog() {
        return this.showRatingDialog;
    }

    public final boolean getShowRenameDialog() {
        return this.showRenameDialog;
    }

    public final boolean getShowSearchButton() {
        ReadMeta readMeta;
        ContentState contentState = this.contentState;
        if (contentState == null || (readMeta = contentState.getReadMeta()) == null) {
            return false;
        }
        if (readMeta.getDisplayMode() == DisplayMode.AudioOnly) {
            if (!this.isSearchInAudioEnabled || this.highlighterData.getSlots().isEmpty()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean getShowShareButton() {
        return this.showShareButton;
    }

    public final boolean getShowShareOptionsSheet() {
        return this.showShareOptionsSheet;
    }

    public final boolean getShowSleepTimerDialog() {
        return this.showSleepTimerDialog;
    }

    public final boolean getShowSpeedPickerDialog() {
        return this.showSpeedPickerDialog;
    }

    public final boolean getShowTooLargeForOfflineToast() {
        return this.showTooLargeForOfflineToast;
    }

    public final Date getSleepTimerDate() {
        return this.sleepTimerDate;
    }

    public final Long getSleepTimerRemainingSeconds() {
        Date date = this.sleepTimerDate;
        if (date != null) {
            long time = (date.getTime() - this.currentDate.getTime()) / SignalClient.CLOSE_REASON_NORMAL_CLOSURE;
            if (time < 0) {
                time = 0;
            }
            return Long.valueOf(time);
        }
        return null;
    }

    public final PlayerToastMessage getToastMessage() {
        return this.toastMessage;
    }

    public final UndoSeekState getUndoSeek() {
        return this.undoSeek;
    }

    public final Voice getVoiceUsed() {
        return this.voiceUsed;
    }

    public final BinarySearchList getWordOffsets() {
        return this.wordOffsets;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    public final boolean isAppInForeground() {
        return this.isAppInForeground;
    }

    public final boolean isLoadingContent() {
        return this.isLoadingContent;
    }

    public final boolean isLoadingHtmlContent() {
        return this.isLoadingHtmlContent;
    }

    public final boolean isScreenRecordingEnabled() {
        return this.isScreenRecordingEnabled;
    }

    public final boolean isSearchInAudioEnabled() {
        return this.isSearchInAudioEnabled;
    }

    public final boolean isSeekOperationInProgress() {
        return this.isSeekOperationInProgress;
    }

    public final boolean isSeeking() {
        return this.isSeeking;
    }

    public final boolean isSoundscapeEnabled() {
        if (this.currentSoundscapeId != null) {
            return true;
        }
        return false;
    }

    public final boolean isVoiceAgentFloatingButtonEnabled() {
        return this.isVoiceAgentFloatingButtonEnabled;
    }

    public final boolean isVoiceChangerEnabled() {
        return this.isVoiceChangerEnabled;
    }

    public String toString() {
        String str = this.readId;
        PlayerControllerState playerControllerState = this.player;
        boolean z6 = this.isLoadingContent;
        boolean z10 = this.isLoadingHtmlContent;
        int i10 = this.htmlLoadingProgress;
        HighlighterData highlighterData = this.highlighterData;
        BinarySearchList binarySearchList = this.wordOffsets;
        String str2 = this.error;
        boolean z11 = this.canUpgrade;
        boolean z12 = this.isAppInForeground;
        boolean z13 = this.isSeeking;
        boolean z14 = this.isSeekOperationInProgress;
        ContentState contentState = this.contentState;
        String str3 = this.fullScreenImageSrc;
        boolean z15 = this.navigateBack;
        PlayerToastMessage playerToastMessage = this.toastMessage;
        boolean z16 = this.navigateToPurchaseHours;
        String str4 = this.purchaseHoursContext;
        boolean z17 = this.navigateToVoiceDesignPaywall;
        boolean z18 = this.navigateToPaywall;
        boolean z19 = this.canNavigateToLowCreditsAgain;
        Date date = this.sleepTimerDate;
        Voice voice = this.voiceUsed;
        Configuration configuration = this.configuration;
        UserConfig.PlayerConfig playerConfig = this.playerConfig;
        boolean z20 = this.showSpeedPickerDialog;
        boolean z21 = this.showContentsDialog;
        boolean z22 = this.showTooLargeForOfflineToast;
        String str5 = this.chapterDownloadErrorMessage;
        boolean z23 = this.showCustomizeDialog;
        boolean z24 = this.navigateToPlayerPreferences;
        boolean z25 = this.showExportDialog;
        boolean z26 = this.showRenameDialog;
        boolean z27 = this.showRatingDialog;
        boolean z28 = this.showSleepTimerDialog;
        boolean z29 = this.showShareOptionsSheet;
        String str6 = this.navigateToGenFMLoaderWithReadId;
        Date date2 = this.currentDate;
        boolean z30 = this.showBookmarksDialog;
        String str7 = this.navigateToShareDetails;
        String str8 = this.clickedBookmarkId;
        sn.k kVar = this.navigateToBookmarkShareDetails;
        String str9 = this.recentlyAddedBookmarkId;
        String str10 = this.editBookmarkId;
        PlayerDisplayMode playerDisplayMode = this.displayMode;
        boolean z31 = this.showQueue;
        boolean z32 = this.isScreenRecordingEnabled;
        boolean z33 = this.isVoiceAgentFloatingButtonEnabled;
        List<Pronunciation> list = this.pronunciations;
        Pronunciation pronunciation = this.showPronunciationExistsDialog;
        PronunciationPreviewState pronunciationPreviewState = this.pronunciationPreviewState;
        UndoSeekState undoSeekState = this.undoSeek;
        String str11 = this.currentSoundscapeId;
        boolean z34 = this.shouldShowPagerTeaser;
        boolean z35 = this.controlsVisibleByUser;
        int i11 = this.activeControlsInteractionCount;
        boolean z36 = this.isVoiceChangerEnabled;
        boolean z37 = this.isSearchInAudioEnabled;
        SkipDuration skipDuration = this.inAppForwardSeekDuration;
        SkipDuration skipDuration2 = this.inAppBackwardSeekDuration;
        StringBuilder sb = new StringBuilder("PlayerState(readId=");
        sb.append(str);
        sb.append(", player=");
        sb.append(playerControllerState);
        sb.append(", isLoadingContent=");
        ib.i.t(sb, z6, ", isLoadingHtmlContent=", z10, ", htmlLoadingProgress=");
        sb.append(i10);
        sb.append(", highlighterData=");
        sb.append(highlighterData);
        sb.append(", wordOffsets=");
        sb.append(binarySearchList);
        sb.append(", error=");
        sb.append(str2);
        sb.append(", canUpgrade=");
        ib.i.t(sb, z11, ", isAppInForeground=", z12, ", isSeeking=");
        ib.i.t(sb, z13, ", isSeekOperationInProgress=", z14, ", contentState=");
        sb.append(contentState);
        sb.append(", fullScreenImageSrc=");
        sb.append(str3);
        sb.append(", navigateBack=");
        sb.append(z15);
        sb.append(", toastMessage=");
        sb.append(playerToastMessage);
        sb.append(", navigateToPurchaseHours=");
        defpackage.f.z(sb, z16, ", purchaseHoursContext=", str4, ", navigateToVoiceDesignPaywall=");
        ib.i.t(sb, z17, ", navigateToPaywall=", z18, ", canNavigateToLowCreditsAgain=");
        sb.append(z19);
        sb.append(", sleepTimerDate=");
        sb.append(date);
        sb.append(", voiceUsed=");
        sb.append(voice);
        sb.append(", configuration=");
        sb.append(configuration);
        sb.append(", playerConfig=");
        sb.append(playerConfig);
        sb.append(", showSpeedPickerDialog=");
        sb.append(z20);
        sb.append(", showContentsDialog=");
        ib.i.t(sb, z21, ", showTooLargeForOfflineToast=", z22, ", chapterDownloadErrorMessage=");
        defpackage.f.y(sb, str5, ", showCustomizeDialog=", z23, ", navigateToPlayerPreferences=");
        ib.i.t(sb, z24, ", showExportDialog=", z25, ", showRenameDialog=");
        ib.i.t(sb, z26, ", showRatingDialog=", z27, ", showSleepTimerDialog=");
        ib.i.t(sb, z28, ", showShareOptionsSheet=", z29, ", navigateToGenFMLoaderWithReadId=");
        sb.append(str6);
        sb.append(", currentDate=");
        sb.append(date2);
        sb.append(", showBookmarksDialog=");
        defpackage.f.z(sb, z30, ", navigateToShareDetails=", str7, ", clickedBookmarkId=");
        sb.append(str8);
        sb.append(", navigateToBookmarkShareDetails=");
        sb.append(kVar);
        sb.append(", recentlyAddedBookmarkId=");
        defpackage.f.x(sb, str9, ", editBookmarkId=", str10, ", displayMode=");
        sb.append(playerDisplayMode);
        sb.append(", showQueue=");
        sb.append(z31);
        sb.append(", isScreenRecordingEnabled=");
        ib.i.t(sb, z32, ", isVoiceAgentFloatingButtonEnabled=", z33, ", pronunciations=");
        sb.append(list);
        sb.append(", showPronunciationExistsDialog=");
        sb.append(pronunciation);
        sb.append(", pronunciationPreviewState=");
        sb.append(pronunciationPreviewState);
        sb.append(", undoSeek=");
        sb.append(undoSeekState);
        sb.append(", currentSoundscapeId=");
        defpackage.f.y(sb, str11, ", shouldShowPagerTeaser=", z34, ", controlsVisibleByUser=");
        sb.append(z35);
        sb.append(", activeControlsInteractionCount=");
        sb.append(i11);
        sb.append(", isVoiceChangerEnabled=");
        ib.i.t(sb, z36, ", isSearchInAudioEnabled=", z37, ", inAppForwardSeekDuration=");
        sb.append(skipDuration);
        sb.append(", inAppBackwardSeekDuration=");
        sb.append(skipDuration2);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public PlayerState(String str, PlayerControllerState playerControllerState, boolean z6, boolean z10, int i10, HighlighterData highlighterData, BinarySearchList binarySearchList, String str2, boolean z11, boolean z12, boolean z13, boolean z14, ContentState contentState, String str3, boolean z15, PlayerToastMessage playerToastMessage, boolean z16, String str4, boolean z17, boolean z18, boolean z19, Date date, Voice voice, Configuration configuration, UserConfig.PlayerConfig playerConfig, boolean z20, boolean z21, boolean z22, String str5, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, String str6, Date date2, boolean z30, String str7, String str8, sn.k kVar, String str9, String str10, PlayerDisplayMode playerDisplayMode, boolean z31, boolean z32, boolean z33, List<Pronunciation> list, Pronunciation pronunciation, PronunciationPreviewState pronunciationPreviewState, UndoSeekState undoSeekState, String str11, boolean z34, boolean z35, int i11, boolean z36, boolean z37, SkipDuration skipDuration, SkipDuration skipDuration2) {
        ReadMeta readMeta;
        playerControllerState.getClass();
        highlighterData.getClass();
        str2.getClass();
        date2.getClass();
        pronunciationPreviewState.getClass();
        skipDuration.getClass();
        skipDuration2.getClass();
        this.readId = str;
        this.player = playerControllerState;
        this.isLoadingContent = z6;
        this.isLoadingHtmlContent = z10;
        this.htmlLoadingProgress = i10;
        this.highlighterData = highlighterData;
        this.wordOffsets = binarySearchList;
        this.error = str2;
        this.canUpgrade = z11;
        this.isAppInForeground = z12;
        this.isSeeking = z13;
        this.isSeekOperationInProgress = z14;
        this.contentState = contentState;
        this.fullScreenImageSrc = str3;
        this.navigateBack = z15;
        this.toastMessage = playerToastMessage;
        this.navigateToPurchaseHours = z16;
        this.purchaseHoursContext = str4;
        this.navigateToVoiceDesignPaywall = z17;
        this.navigateToPaywall = z18;
        this.canNavigateToLowCreditsAgain = z19;
        this.sleepTimerDate = date;
        this.voiceUsed = voice;
        this.configuration = configuration;
        this.playerConfig = playerConfig;
        this.showSpeedPickerDialog = z20;
        this.showContentsDialog = z21;
        this.showTooLargeForOfflineToast = z22;
        this.chapterDownloadErrorMessage = str5;
        this.showCustomizeDialog = z23;
        this.navigateToPlayerPreferences = z24;
        this.showExportDialog = z25;
        this.showRenameDialog = z26;
        this.showRatingDialog = z27;
        this.showSleepTimerDialog = z28;
        this.showShareOptionsSheet = z29;
        this.navigateToGenFMLoaderWithReadId = str6;
        this.currentDate = date2;
        this.showBookmarksDialog = z30;
        this.navigateToShareDetails = str7;
        this.clickedBookmarkId = str8;
        this.navigateToBookmarkShareDetails = kVar;
        this.recentlyAddedBookmarkId = str9;
        this.editBookmarkId = str10;
        this.displayMode = playerDisplayMode;
        this.showQueue = z31;
        this.isScreenRecordingEnabled = z32;
        this.isVoiceAgentFloatingButtonEnabled = z33;
        this.pronunciations = list;
        this.showPronunciationExistsDialog = pronunciation;
        this.pronunciationPreviewState = pronunciationPreviewState;
        this.undoSeek = undoSeekState;
        this.currentSoundscapeId = str11;
        this.shouldShowPagerTeaser = z34;
        this.controlsVisibleByUser = z35;
        this.activeControlsInteractionCount = i11;
        this.isVoiceChangerEnabled = z36;
        this.isSearchInAudioEnabled = z37;
        this.inAppForwardSeekDuration = skipDuration;
        this.inAppBackwardSeekDuration = skipDuration2;
        boolean z38 = false;
        this.showShareButton = (contentState == null || (readMeta = contentState.getReadMeta()) == null || !ReadMetaKt.getCanShare(readMeta)) ? false : true;
        if (contentState != null && contentState.getReadMeta().getChapters().size() > 1) {
            z38 = true;
        }
        this.showContentsButton = z38;
    }
}
