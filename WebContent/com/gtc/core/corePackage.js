define([ 'core/model/Config', 'core/model/Session', 'core/util/ObjectUtil',
		'core/util/StringUtil','core/view/Panel' ], function(Config, Session,
		ObjectUtil, StringUtil, Panel) {
	return {
		Config : Config,
		Session : Session,
		ObjectUtil : ObjectUtil,
		StringUtil : StringUtil,
		Panel : Panel
	};
});